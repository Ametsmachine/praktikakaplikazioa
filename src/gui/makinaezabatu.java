package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class makinaezabatu extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JTextField textField;

    public makinaezabatu() {
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

        JLabel lblNewLabel = new JLabel("Makina ezabatu");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
        lblNewLabel.setBounds(288, 25, 224, 41);
        panel.add(lblNewLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(33, 128, 693, 248);
        panel.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        loadTableData();

        JButton btnDelete = new JButton("Ezabatu");
        btnDelete.setBackground(new Color(255, 69, 0));
        btnDelete.setBounds(637, 386, 115, 41);
        panel.add(btnDelete);

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

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteMachine();
            }
        });
    }

    private void loadTableData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Izena", "Marka", "Modeloa", "Kokapena", "Aktibozenbakia", "CEmarka"}, 0);
        table.setModel(model);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/erronkaerrekuperazioa", "root", "1WMG2023");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT izena, marka, modeloa, kokapena, aktibozenbakia, CEmarka FROM makina")) {

            while (rs.next()) {
                String izena = rs.getString("izena");
                String marka = rs.getString("marka");
                String modeloa = rs.getString("modeloa");
                String kokapena = rs.getString("kokapena");
                int aktibozenbakia = rs.getInt("aktibozenbakia");
                String cfmarka = rs.getString("CEmarka");
                model.addRow(new Object[]{izena, marka, modeloa, kokapena, aktibozenbakia, cfmarka});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void deleteMachine() {
        String machineName = textField.getText();
        if (machineName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mesedez, idatzi makina izena", "Errorea", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/erronkaerrekuperazioa", "root", "1WMG2023");
            conn.setAutoCommit(false);

            String selectMachineIdSql = "SELECT id_makina FROM makina WHERE izena = ?";
            pstmt = conn.prepareStatement(selectMachineIdSql);
            pstmt.setString(1, machineName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int makinaId = rs.getInt("id_makina");

                String deleteMakinenArriskuakSql = "DELETE FROM makinenarriskuak WHERE makina_id_makina = ?";
                executeDelete(conn, deleteMakinenArriskuakSql, makinaId);

                String deleteMakinenProduktukimikoakSql = "DELETE FROM makinenproduktukimikoak WHERE makina_id_makina = ?";
                executeDelete(conn, deleteMakinenProduktukimikoakSql, makinaId);

                String deleteMakinenEkipoakSql = "DELETE FROM makinenekipoak WHERE makina_id_makina = ?";
                executeDelete(conn, deleteMakinenEkipoakSql, makinaId);

                String deleteMakinenHondakinakSql = "DELETE FROM makinenhondakinak WHERE makina_id_makina = ?";
                executeDelete(conn, deleteMakinenHondakinakSql, makinaId);

                String deleteMakinenAtalakSql = "DELETE FROM makinenatalak WHERE makina_id_makina = ?";
                executeDelete(conn, deleteMakinenAtalakSql, makinaId);

                String deleteMachineSql = "DELETE FROM makina WHERE id_makina = ?";
                executeDelete(conn, deleteMachineSql, makinaId);

                conn.commit();
                JOptionPane.showMessageDialog(this, "Makina ezabatua izan da", "Arrakasta", JOptionPane.INFORMATION_MESSAGE);
                loadTableData();  // Refresh the table data
            } else {
                JOptionPane.showMessageDialog(this, "Ez da aurkitu makina hori", "Errorea", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Errorea datu basearekin konektatzerakoan", "Errorea", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void executeDelete(Connection conn, String sql, int makinaId) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, makinaId);
            pstmt.executeUpdate();
        }
    }
}
