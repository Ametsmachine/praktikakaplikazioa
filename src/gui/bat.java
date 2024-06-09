package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class bat extends JFrame {

    private JPanel contentPane;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField searchField;

    public bat() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 1200, 600); // Ampliar el tamaño de la ventana
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setForeground(SystemColor.textText);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton hornitzaileakikusi = new JButton("+ Makina berri bat gehitu +");
        hornitzaileakikusi.setForeground(new Color(0, 0, 0));
        hornitzaileakikusi.setBackground(new Color(50, 205, 50));
        hornitzaileakikusi.setFont(new Font("Tahoma", Font.BOLD, 18));
        hornitzaileakikusi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                makinagehitu frame = new makinagehitu();
                frame.setVisible(true);
            }
        });
        hornitzaileakikusi.setBounds(50, 86, 305, 21);
        contentPane.add(hornitzaileakikusi);

        JButton btnHornitzaileaBihurtu = new JButton("- Makina bat ezabatu -");
        btnHornitzaileaBihurtu.setBackground(new Color(255, 69, 0));
        btnHornitzaileaBihurtu.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnHornitzaileaBihurtu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                makinaezabatu deleteWindow = new makinaezabatu();
                deleteWindow.setVisible(true);
            }
        });
        btnHornitzaileaBihurtu.setBounds(428, 86, 304, 21);
        contentPane.add(btnHornitzaileaBihurtu);

        JButton btnNewButton = new JButton("Makina bat editatu");
        btnNewButton.setBackground(new Color(255, 255, 153));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                makinaeditatu editWindow = new makinaeditatu();
                editWindow.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setBounds(806, 86, 309, 21);
        contentPane.add(btnNewButton);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(255, 235, 205));
        panel.setBounds(331, 27, 477, 49);
        contentPane.add(panel);

        JLabel lblNewLabel = new JLabel("MAKINAREN INFORMAZIOA");
        lblNewLabel.setBackground(new Color(255, 228, 181));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
        panel.add(lblNewLabel);

        JButton btnNewButton_1 = new JButton("Atzera");
        btnNewButton_1.setBackground(new Color(192, 192, 192));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                hasiera hasieraFrame = new hasiera();
                hasieraFrame.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(10, 27, 81, 29);
        contentPane.add(btnNewButton_1);

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Izena", "Marka", "Modeloa", "Kokapena", "Aktibo Zenbakia", "CE Marka", "Produktu Kimikoak", "Arriskuak", "Babeserako Ekipoak", "Sorrarazitako Hondakinak"});
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(10, 170, 1160, 283);
        contentPane.add(scrollPane);

        // Ajustar el ancho de las columnas
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Desactivar el ajuste automático de las columnas
        TableColumn column = table.getColumnModel().getColumn(6);
        column.setPreferredWidth(600); // Ajustar según sea necesario
        column = table.getColumnModel().getColumn(7);
        column.setPreferredWidth(1200); // Ajustar según sea necesario
        column = table.getColumnModel().getColumn(8);
        column.setPreferredWidth(600); // Ajustar según sea necesario
        column = table.getColumnModel().getColumn(9);
        column.setPreferredWidth(900); // Ajustar según sea necesario

        JLabel lblSearch = new JLabel("Bilatu izena:");
        lblSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblSearch.setBounds(26, 135, 132, 20);
        contentPane.add(lblSearch);

        searchField = new JTextField();
        searchField.setBounds(138, 138, 200, 20);
        contentPane.add(searchField);
        searchField.setColumns(10);

        JButton btnSearch = new JButton("Bilatu");
        btnSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnSearch.setBounds(348, 140, 100, 20);
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String izena = searchField.getText();
                if (izena.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Mesedez, idatzi makina izena", "Errorea", JOptionPane.ERROR_MESSAGE);
                } else {
                    cargarDatos(izena);
                }
            }
        });
        contentPane.add(btnSearch);

        JButton btnViewAll = new JButton("Makina guztiak ikusi");
        btnViewAll.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnViewAll.setBounds(458, 140, 200, 20);
        btnViewAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarDatos("");
            }
        });
        contentPane.add(btnViewAll);

        // Cargar datos de todas las máquinas al iniciar la ventana
        cargarDatos("");
    }

    private void cargarDatos(String izena) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT m.izena, m.marka, m.modeloa, m.kokapena, m.aktibozenbakia, m.CEmarka, " +
                    "GROUP_CONCAT(DISTINCT pk.azalpena SEPARATOR ', ') AS produktukimikoak, " +
                    "GROUP_CONCAT(DISTINCT ar.arriskumota SEPARATOR ', ') AS arriskuak, " +
                    "GROUP_CONCAT(DISTINCT e.azalpena SEPARATOR ', ') AS ekipoak, " +
                    "GROUP_CONCAT(DISTINCT sh.azalpena SEPARATOR ', ') AS sorrarazitakohondakinak " +
                    "FROM makina m " +
                    "LEFT JOIN makinenproduktukimikoak mpk ON m.id_makina = mpk.makina_id_makina " +
                    "LEFT JOIN produktukimikoak pk ON mpk.produktukimikoak_id_produtu = pk.id_produtu " +
                    "LEFT JOIN makinenarriskuak ma ON m.id_makina = ma.makina_id_makina " +
                    "LEFT JOIN arriskuak ar ON ma.arriskuak_idarriskua = ar.idarriskua " +
                    "LEFT JOIN makinenekipoak me ON m.id_makina = me.makina_id_makina " +
                    "LEFT JOIN ekipoak e ON me.ekipoak_id_ekipoak = e.id_ekipoak " +
                    "LEFT JOIN makinenhondakinak mh ON m.id_makina = mh.makina_id_makina " +
                    "LEFT JOIN sorrarazitakohondakinak sh ON mh.sorrarazitakohondakinak_id_hondakinak = sh.id_hondakinak ";

            if (!izena.isEmpty()) {
                query += "WHERE m.izena = '" + izena + "' ";
            }

            query += "GROUP BY m.id_makina";

            ResultSet rs = stmt.executeQuery(query);

            tableModel.setRowCount(0); // Clear previous data

            while (rs.next()) {
                String izenaResult = rs.getString("izena");
                String marka = rs.getString("marka");
                String modeloa = rs.getString("modeloa");
                String kokapena = rs.getString("kokapena");
                String aktibozenbakia = rs.getString("aktibozenbakia");
                String CEmarka = rs.getString("CEmarka");
                String produktukimikoak = rs.getString("produktukimikoak");
                String arriskuak = rs.getString("arriskuak");
                String ekipoak = rs.getString("ekipoak");
                String sorrarazitakohondakinak = rs.getString("sorrarazitakohondakinak");

                tableModel.addRow(new Object[]{izenaResult, marka, modeloa, kokapena, aktibozenbakia, CEmarka, produktukimikoak, arriskuak, ekipoak, sorrarazitakohondakinak});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
        }
    }

    private Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/erronkaerrekuperazioa";
        String user = "root";
        String password = "1WMG2023";
        return DriverManager.getConnection(url, user, password);
    }

    public static bat getExistingInstance() {
        return null;
    }
}
