package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class makinaeditatu extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField textField;

    public makinaeditatu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 776, 501);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(0, 0, 762, 464);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Makina editatu");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
        lblNewLabel.setBounds(288, 25, 224, 41);
        panel.add(lblNewLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(33, 128, 693, 248);
        panel.add(scrollPane);

        tableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Izena", "Marka", "Modeloa", "Kokapena", "Aktibozenbakia", "CEmarka"}
        );
        table = new JTable(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        table.setCellSelectionEnabled(true);
        table.setColumnSelectionAllowed(false);
        table.setRowSorter(new TableRowSorter<>(table.getModel()));
        scrollPane.setViewportView(table);

        loadTableData();

        JButton btnSave = new JButton("Editatu");
        btnSave.setBackground(new Color(144, 238, 144));
        btnSave.setBounds(637, 386, 115, 41);
        panel.add(btnSave);

        JButton btnBack = new JButton("Atzera");
        btnBack.setBounds(33, 25, 101, 29);
        panel.add(btnBack);

        JLabel lblNewLabel_1 = new JLabel("Makina izena:");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_1.setBounds(44, 95, 109, 13);
        panel.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(157, 93, 96, 19);
        panel.add(textField);
        textField.setColumns(10);

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bat batInstance = new bat();
                batInstance.setVisible(true);
                setVisible(false);
            }
        });

        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveTableData();
            }
        });
    }

    private void loadTableData() {
        tableModel.setRowCount(0);  // Clear existing rows

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikakk", "root", "1WMG2023");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT izena, marka, modeloa, kokapena, aktibozenbakia, CEmarka FROM makina")) {

            while (rs.next()) {
                String izena = rs.getString("izena");
                String marka = rs.getString("marka");
                String modeloa = rs.getString("modeloa");
                String kokapena = rs.getString("kokapena");
                int aktibozenbakia = rs.getInt("aktibozenbakia");
                String cfmarka = rs.getString("CEmarka");
                tableModel.addRow(new Object[]{izena, marka, modeloa, kokapena, aktibozenbakia, cfmarka});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void saveTableData() {
        TableModel model = table.getModel();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikakk", "root", "1WMG2023")) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String izena = model.getValueAt(i, 0).toString();
                String marka = model.getValueAt(i, 1).toString();
                String modeloa = model.getValueAt(i, 2).toString();
                String kokapena = model.getValueAt(i, 3).toString();
                int aktibozenbakia = Integer.parseInt(model.getValueAt(i, 4).toString());
                String cfmarka = model.getValueAt(i, 5).toString();

                // Construct the update query using all columns
                String updateQuery = "UPDATE makina SET izena = ?, marka = ?, modeloa = ?, kokapena = ?, aktibozenbakia = ?, CEmarka = ? WHERE aktibozenbakia = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                    pstmt.setString(1, izena);
                    pstmt.setString(2, marka);
                    pstmt.setString(3, modeloa);
                    pstmt.setString(4, kokapena);
                    pstmt.setInt(5, aktibozenbakia);
                    pstmt.setString(6, cfmarka);
                    pstmt.setInt(7, aktibozenbakia); // Assuming aktibozenbakia is the unique identifier
                    pstmt.executeUpdate();
                }
            }
            JOptionPane.showMessageDialog(this, "Datuak ondo gorde dira!", "Arrakasta", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Errorea datu basearekin konektatzerakoan", "Errorea", JOptionPane.ERROR_MESSAGE);
        }
    }
}


