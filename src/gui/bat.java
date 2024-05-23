package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class bat extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;

    /**
     * Create the frame.
     */
    public bat() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 738, 537);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setForeground(SystemColor.textText);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Botón para ver proveedores
        JButton hornitzaileakikusi = new JButton("+");
        hornitzaileakikusi.setForeground(new Color(0, 0, 0));
        hornitzaileakikusi.setBackground(new Color(0, 255, 127));
        hornitzaileakikusi.setFont(new Font("Tahoma", Font.BOLD, 22));
        hornitzaileakikusi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                makinagehitu frame = new makinagehitu(); 
                frame.setVisible(true); 
            }
        });
        hornitzaileakikusi.setBounds(30, 109, 61, 43);
        contentPane.add(hornitzaileakikusi);

       
        JButton btnHornitzaileaBihurtu = new JButton("-");
        btnHornitzaileaBihurtu.setBackground(new Color(255, 69, 0));
        btnHornitzaileaBihurtu.setFont(new Font("Tahoma", Font.BOLD, 22));
        btnHornitzaileaBihurtu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                makinaezabatu deleteWindow = new makinaezabatu(); 
                deleteWindow.setVisible(true); 
            }
        });
        btnHornitzaileaBihurtu.setBounds(30, 251, 61, 43);
        contentPane.add(btnHornitzaileaBihurtu);

        
        JButton btnNewButton = new JButton("Editatu");
        btnNewButton.setBackground(new Color(255, 235, 205));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                makinaeditatu editWindow = new makinaeditatu(); 
                editWindow.setVisible(true); 
                dispose(); 
            }
        });
        btnNewButton.setBounds(30, 384, 75, 43);
        contentPane.add(btnNewButton);

        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(255, 235, 205));
        panel.setBounds(153, 25, 477, 49);
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

        
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(119, 98, 533, 262); 
        contentPane.add(scrollPane);

        cargarDatos();  
    }

   
    private void cargarDatos() {
        try {
            Connection conn = getConnection(); 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM makina"); 

            
            tableModel = new DefaultTableModel(new String[]{"izena", "marka", "modeloa","kokapena", "aktibozenbakia", "CEmarka"}, 0);
            while (rs.next()) {
                String izena = rs.getString("izena");
                String marka = rs.getString("marka");
                String modeloa = rs.getString("modeloa");
                String kokapena = rs.getString("kokapena");
                String aktibozenbakia = rs.getString("aktibozenbakia");
                String CEmarka = rs.getString("CEmarka");
                tableModel.addRow(new Object[]{izena, marka, modeloa, kokapena, aktibozenbakia, CEmarka});
            }
            table.setModel(tableModel);

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
        }
    }

    private Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/praktikak";
        String user = "root";
        String password = "1WMG2023";
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                bat frame = new bat();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

	public static bat getExistingInstance() {
		
		return null;
	}
}

