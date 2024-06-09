package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class makinaeditatu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JCheckBox chckbxNewCheckBox;
    private JCheckBox chckbxNewCheckBox_1;
    private JCheckBox chckbxNewCheckBox_2;
    private JCheckBox chckbxNewCheckBox_3;
    private JCheckBox chckbxNewCheckBox_4;
    private JCheckBox chckbxNewCheckBox_5;
    private JCheckBox chckbxNewCheckBox_6;
    private JCheckBox chckbxNewCheckBox_7;
    private JCheckBox chckbxNewCheckBox_8;
    private JCheckBox chckbxNewCheckBox_9;
    private JCheckBox chckbxNewCheckBox_10;
    private JCheckBox chckbxNewCheckBox_11;
    private JCheckBox chckbxNewCheckBox_12;
    private JCheckBox chckbxNewCheckBox_13;
    private JCheckBox chckbxNewCheckBox_14;
    private JCheckBox chckbxNewCheckBox_15;
    private JCheckBox chckbxNewCheckBox_16;
    private JCheckBox chckbxNewCheckBox_17;
    private JCheckBox chckbxNewCheckBox_18;
    private JCheckBox chckbxNewCheckBox_19;
    private JCheckBox chckbxNewCheckBox_20;
    private JCheckBox chckbxNewCheckBox_21;
    private JCheckBox chckbxNewCheckBox_22;
    private JTextField searchField;

    public makinaeditatu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 926, 893);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Markaren izendapena:");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_1.setBounds(36, 106, 176, 13);
        contentPane.add(lblNewLabel_1);

        JPanel panel = new JPanel();
        panel.setBounds(646, 10, 234, 44);
        panel.setBackground(new Color(255, 228, 181));
        contentPane.add(panel);
        
        JLabel lblNewLabel = new JLabel("Makina editatu");
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));

        textField = new JTextField();
        textField.setBounds(222, 105, 128, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Marka:");
        lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_1_1.setBounds(36, 150, 176, 13);
        contentPane.add(lblNewLabel_1_1);

        textField_1 = new JTextField();
        textField_1.setBounds(100, 149, 96, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_1_2 = new JLabel("Modeloa:");
        lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_1_2.setBounds(36, 195, 176, 13);
        contentPane.add(lblNewLabel_1_2);

        textField_2 = new JTextField();
        textField_2.setBounds(128, 194, 96, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_1_3 = new JLabel("Kokapena:");
        lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_1_3.setBounds(36, 241, 122, 13);
        contentPane.add(lblNewLabel_1_3);

        textField_3 = new JTextField();
        textField_3.setBounds(146, 240, 96, 19);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(176, 284, 96, 19);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_1_4 = new JLabel("Aktibo zenbakia:");
        lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_1_4.setBounds(36, 285, 176, 13);
        contentPane.add(lblNewLabel_1_4);

        JLabel lblNewLabel_1_4_1 = new JLabel("CE marka (Bai/Ez):");
        lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_1_4_1.setBounds(36, 331, 176, 13);
        contentPane.add(lblNewLabel_1_4_1);

        textField_5 = new JTextField();
        textField_5.setBounds(208, 330, 96, 19);
        contentPane.add(textField_5);
        textField_5.setColumns(10);

        JLabel lblNewLabel_1_4_1_1 = new JLabel("Produktu kimikoak:");
        lblNewLabel_1_4_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1.setBounds(36, 385, 206, 19);
        contentPane.add(lblNewLabel_1_4_1_1);

        chckbxNewCheckBox = new JCheckBox("Mikrolubrikaziorako olioa: LUBRI FLUID (HRE HIDRAULIC)");
        chckbxNewCheckBox.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox.setBounds(36, 431, 434, 21);
        contentPane.add(chckbxNewCheckBox);

        chckbxNewCheckBox_1 = new JCheckBox("Gidak eta elementuak labaintzeko olioa: DROSERA MS 68 (TOTAL ESPAÑA)");
        chckbxNewCheckBox_1.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_1.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_1.setBounds(36, 470, 464, 21);
        contentPane.add(chckbxNewCheckBox_1);

        chckbxNewCheckBox_2 = new JCheckBox("Abiadura eta aitzinapen kaxarako olioa: AZOLLA ZS 68 (TOTAL ESPAÑA)");
        chckbxNewCheckBox_2.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_2.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_2.setBounds(36, 508, 440, 21);
        contentPane.add(chckbxNewCheckBox_2);

        JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Arriskuak:");
        lblNewLabel_1_4_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1.setBounds(36, 555, 206, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1);

        chckbxNewCheckBox_3 = new JCheckBox("Soinean dugun zerbait, makinaren mugitzenari den atalen batean korapilatzea: mahukak, lepokoak, hilea …");
        chckbxNewCheckBox_3.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_3.setFont(new Font("Arial", Font.BOLD, 11));
        chckbxNewCheckBox_3.setBounds(36, 590, 625, 29);
        contentPane.add(chckbxNewCheckBox_3);

        chckbxNewCheckBox_4 = new JCheckBox("Piezen bizarrekin, hertz biziekin, kutxilekin… ebakiak egiteko arriskua.");
        chckbxNewCheckBox_4.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_4.setFont(new Font("Arial", Font.BOLD, 11));
        chckbxNewCheckBox_4.setBounds(36, 621, 362, 21);
        contentPane.add(chckbxNewCheckBox_4);

        chckbxNewCheckBox_5 = new JCheckBox("Irrist egitea lurrean egon daiteken olioarekin");
        chckbxNewCheckBox_5.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_5.setFont(new Font("Arial", Font.BOLD, 11));
        chckbxNewCheckBox_5.setBounds(36, 651, 452, 21);
        contentPane.add(chckbxNewCheckBox_5);

        JLabel lblNewLabel_1_4_1_1_1_1 = new JLabel("Norberaren babeserako ekipoak:");
        lblNewLabel_1_4_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1_1.setBounds(465, 253, 376, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1_1);

        chckbxNewCheckBox_6 = new JCheckBox("Betaurrekoak");
        chckbxNewCheckBox_6.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_6.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_6.setBounds(465, 283, 150, 21);
        contentPane.add(chckbxNewCheckBox_6);

        chckbxNewCheckBox_7 = new JCheckBox("Altzairuzko punta duen segurtasun botak.");
        chckbxNewCheckBox_7.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_7.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_7.setBounds(465, 306, 300, 21);
        contentPane.add(chckbxNewCheckBox_7);

        chckbxNewCheckBox_8 = new JCheckBox("Txaketa, buzoa edo bata.");
        chckbxNewCheckBox_8.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_8.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_8.setBounds(465, 329, 200, 21);
        contentPane.add(chckbxNewCheckBox_8);

        chckbxNewCheckBox_9 = new JCheckBox("Eskularruak");
        chckbxNewCheckBox_9.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_9.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_9.setBounds(465, 352, 200, 21);
        contentPane.add(chckbxNewCheckBox_9);

        JLabel lblNewLabel_1_4_1_1_1_1_1 = new JLabel("Sortarazitako hondakinak:");
        lblNewLabel_1_4_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1_1_1.setBounds(465, 102, 376, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1_1_1);

        chckbxNewCheckBox_10 = new JCheckBox("Altzairuzko eta aluminiozko totxoak");
        chckbxNewCheckBox_10.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_10.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_10.setBounds(465, 127, 239, 21);
        contentPane.add(chckbxNewCheckBox_10);

        chckbxNewCheckBox_11 = new JCheckBox("Txirbila: Altzairua, Aluminioa");
        chckbxNewCheckBox_11.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_11.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_11.setBounds(465, 148, 223, 21);
        contentPane.add(chckbxNewCheckBox_11);

        chckbxNewCheckBox_12 = new JCheckBox("Metal gogorrezko plakatxoa hondatuak");
        chckbxNewCheckBox_12.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_12.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_12.setBounds(465, 171, 285, 21);
        contentPane.add(chckbxNewCheckBox_12);

        chckbxNewCheckBox_13 = new JCheckBox("Altzairu lasterreko erreminta hondatuak");
        chckbxNewCheckBox_13.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_13.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_13.setBounds(465, 193, 261, 21);
        contentPane.add(chckbxNewCheckBox_13);

        chckbxNewCheckBox_14 = new JCheckBox("Olioa");
        chckbxNewCheckBox_14.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_14.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_14.setBounds(465, 216, 285, 21);
        contentPane.add(chckbxNewCheckBox_14);

        JLabel lblNewLabel_1_4_1_1_1_2 = new JLabel("Makinaren Atalak:");
        lblNewLabel_1_4_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1_2.setBounds(526, 391, 376, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1_2);

        chckbxNewCheckBox_15 = new JCheckBox("Gorputza");
        chckbxNewCheckBox_15.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_15.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_15.setBounds(526, 416, 150, 21);
        contentPane.add(chckbxNewCheckBox_15);

        chckbxNewCheckBox_16 = new JCheckBox("Zubia");
        chckbxNewCheckBox_16.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_16.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_16.setBounds(526, 439, 150, 21);
        contentPane.add(chckbxNewCheckBox_16);

        chckbxNewCheckBox_17 = new JCheckBox("Erreminta etxearen ardatza");
        chckbxNewCheckBox_17.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_17.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_17.setBounds(526, 462, 189, 21);
        contentPane.add(chckbxNewCheckBox_17);

        chckbxNewCheckBox_18 = new JCheckBox("Mentsula");
        chckbxNewCheckBox_18.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_18.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_18.setBounds(526, 485, 150, 21);
        contentPane.add(chckbxNewCheckBox_18);

        chckbxNewCheckBox_19 = new JCheckBox("Orga mahai etxea");
        chckbxNewCheckBox_19.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_19.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_19.setBounds(526, 508, 150, 21);
        contentPane.add(chckbxNewCheckBox_19);

        chckbxNewCheckBox_20 = new JCheckBox("Mahaia");
        chckbxNewCheckBox_20.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_20.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_20.setBounds(717, 416, 150, 21);
        contentPane.add(chckbxNewCheckBox_20);

        chckbxNewCheckBox_21 = new JCheckBox("Cnc Kontrola");
        chckbxNewCheckBox_21.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_21.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_21.setBounds(717, 439, 150, 21);
        contentPane.add(chckbxNewCheckBox_21);

        chckbxNewCheckBox_22 = new JCheckBox("Babesa");
        chckbxNewCheckBox_22.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_22.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_22.setBounds(717, 462, 150, 21);
        contentPane.add(chckbxNewCheckBox_22);

        JButton btnSave = new JButton("Editatu");
        btnSave.setBounds(741, 612, 100, 30);
        contentPane.add(btnSave);

        JButton btnLoad = new JButton("Kargatu");
        btnLoad.setBounds(499, 24, 100, 30);
        contentPane.add(btnLoad);

        JButton btnNewButton_1 = new JButton("Atzera");
        btnNewButton_1.setBounds(26, 21, 85, 29);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bat ventanaBat = new bat();
                ventanaBat.setVisible(true);
                setVisible(false);
            }
        });
        contentPane.add(btnNewButton_1);

        JLabel lblSearch = new JLabel("Bilatu izena:");
        lblSearch.setFont(new Font("Arial", Font.BOLD, 16));
        lblSearch.setBounds(176, 23, 120, 20);
        contentPane.add(lblSearch);

        searchField = new JTextField();
        searchField.setBounds(288, 26, 200, 20);
        contentPane.add(searchField);
        searchField.setColumns(10);

        btnLoad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadData();
            }
        });

        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateData();
            }
        });
    }

    protected void loadData() {
        String izena = searchField.getText();

        if (izena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mesedez, idatzi makina izena", "Errorea", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/erronkaerrekuperazioa", "root", "1WMG2023");

            String sql = "SELECT marka, modeloa, kokapena, aktibozenbakia, CEmarka FROM makina WHERE izena = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                textField.setText(izena);
                textField_1.setText(rs.getString("marka"));
                textField_2.setText(rs.getString("modeloa"));
                textField_3.setText(rs.getString("kokapena"));
                textField_4.setText(rs.getString("aktibozenbakia"));
                textField_5.setText(rs.getString("CEmarka"));

                loadCheckboxData(izena, conn); // Cargar los datos de los checkboxes
            } else {
                JOptionPane.showMessageDialog(this, "Ez da aurkitu makina hori", "Errorea", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Errorea datu basearekin konektatzerakoan", "Errorea", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void loadCheckboxData(String izena, Connection conn) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT arriskuak_idarriskua FROM makinenarriskuak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int arriskuaId = rs.getInt("arriskuak_idarriskua");
                switch (arriskuaId) {
                    case 1:
                        chckbxNewCheckBox_3.setSelected(true);
                        break;
                    case 2:
                        chckbxNewCheckBox_4.setSelected(true);
                        break;
                    case 3:
                        chckbxNewCheckBox_5.setSelected(true);
                        break;
                }
            }
            rs.close();
            pstmt.close();

            sql = "SELECT produktukimikoak_id_produtu FROM makinenproduktukimikoak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int produktuaId = rs.getInt("produktukimikoak_id_produtu");
                switch (produktuaId) {
                    case 1:
                        chckbxNewCheckBox.setSelected(true);
                        break;
                    case 2:
                        chckbxNewCheckBox_1.setSelected(true);
                        break;
                    case 3:
                        chckbxNewCheckBox_2.setSelected(true);
                        break;
                }
            }
            rs.close();
            pstmt.close();

            sql = "SELECT ekipoak_id_ekipoak FROM makinenekipoak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int ekipoaId = rs.getInt("ekipoak_id_ekipoak");
                switch (ekipoaId) {
                    case 1:
                        chckbxNewCheckBox_6.setSelected(true);
                        break;
                    case 2:
                        chckbxNewCheckBox_7.setSelected(true);
                        break;
                    case 3:
                        chckbxNewCheckBox_8.setSelected(true);
                        break;
                    case 4:
                        chckbxNewCheckBox_9.setSelected(true);
                        break;
                }
            }
            rs.close();
            pstmt.close();

            sql = "SELECT sorrarazitakohondakinak_id_hondakinak FROM makinenhondakinak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int hondakinaId = rs.getInt("sorrarazitakohondakinak_id_hondakinak");
                switch (hondakinaId) {
                    case 1:
                        chckbxNewCheckBox_10.setSelected(true);
                        break;
                    case 2:
                        chckbxNewCheckBox_11.setSelected(true);
                        break;
                    case 3:
                        chckbxNewCheckBox_12.setSelected(true);
                        break;
                    case 4:
                        chckbxNewCheckBox_13.setSelected(true);
                        break;
                    case 5:
                        chckbxNewCheckBox_14.setSelected(true);
                        break;
                }
            }
            rs.close();
            pstmt.close();

            sql = "SELECT atalak_id_atalak FROM makinenatalak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int atalaId = rs.getInt("atalak_id_atalak");
                switch (atalaId) {
                    case 1:
                        chckbxNewCheckBox_15.setSelected(true);
                        break;
                    case 2:
                        chckbxNewCheckBox_16.setSelected(true);
                        break;
                    case 3:
                        chckbxNewCheckBox_17.setSelected(true);
                        break;
                    case 4:
                        chckbxNewCheckBox_18.setSelected(true);
                        break;
                    case 5:
                        chckbxNewCheckBox_19.setSelected(true);
                        break;
                    case 6:
                        chckbxNewCheckBox_20.setSelected(true);
                        break;
                    case 7:
                        chckbxNewCheckBox_21.setSelected(true);
                        break;
                    case 8:
                        chckbxNewCheckBox_22.setSelected(true);
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void updateData() {
        String izena = textField.getText();
        String marka = textField_1.getText();
        String modeloa = textField_2.getText();
        String kokapena = textField_3.getText();
        String aktibozenbakia = textField_4.getText();
        String CEmarka = textField_5.getText();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/erronkaerrekuperazioa", "root", "1WMG2023");

            String sql = "UPDATE makina SET izena = ?, marka = ?, modeloa = ?, kokapena = ?, aktibozenbakia = ?, CEmarka = ? WHERE izena = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            pstmt.setString(2, marka);
            pstmt.setString(3, modeloa);
            pstmt.setString(4, kokapena);
            pstmt.setString(5, aktibozenbakia);
            pstmt.setString(6, CEmarka);
            pstmt.setString(7, izena);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                updateCheckboxData(izena, conn);
                JOptionPane.showMessageDialog(this, "Makina eguneratua izan da!", "Arrakasta", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ez da aurkitu makina hori", "Errorea", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Errorea makinarik eguneratzerakoan: " + e.getMessage(), "Errorea", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void updateCheckboxData(String izena, Connection conn) {
        PreparedStatement pstmt = null;

        try {
            String sql = "DELETE FROM makinenarriskuak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            pstmt.executeUpdate();
            pstmt.close();

            sql = "INSERT INTO makinenarriskuak (makina_id_makina, arriskuak_idarriskua) VALUES ((SELECT id_makina FROM makina WHERE izena = ?), ?)";
            pstmt = conn.prepareStatement(sql);

            if (chckbxNewCheckBox_3.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 1);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_4.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 2);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_5.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 3);
                pstmt.executeUpdate();
            }
            pstmt.close();

            sql = "DELETE FROM makinenproduktukimikoak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            pstmt.executeUpdate();
            pstmt.close();

            sql = "INSERT INTO makinenproduktukimikoak (makina_id_makina, produktukimikoak_id_produtu) VALUES ((SELECT id_makina FROM makina WHERE izena = ?), ?)";
            pstmt = conn.prepareStatement(sql);

            if (chckbxNewCheckBox.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 1);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_1.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 2);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_2.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 3);
                pstmt.executeUpdate();
            }
            pstmt.close();

            sql = "DELETE FROM makinenekipoak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            pstmt.executeUpdate();
            pstmt.close();

            sql = "INSERT INTO makinenekipoak (makina_id_makina, ekipoak_id_ekipoak) VALUES ((SELECT id_makina FROM makina WHERE izena = ?), ?)";
            pstmt = conn.prepareStatement(sql);

            if (chckbxNewCheckBox_6.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 1);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_7.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 2);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_8.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 3);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_9.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 4);
                pstmt.executeUpdate();
            }
            pstmt.close();

            sql = "DELETE FROM makinenhondakinak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            pstmt.executeUpdate();
            pstmt.close();

            sql = "INSERT INTO makinenhondakinak (makina_id_makina, sorrarazitakohondakinak_id_hondakinak) VALUES ((SELECT id_makina FROM makina WHERE izena = ?), ?)";
            pstmt = conn.prepareStatement(sql);

            if (chckbxNewCheckBox_10.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 1);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_11.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 2);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_12.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 3);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_13.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 4);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_14.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 5);
                pstmt.executeUpdate();
            }
            pstmt.close();

            sql = "DELETE FROM makinenatalak WHERE makina_id_makina = (SELECT id_makina FROM makina WHERE izena = ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, izena);
            pstmt.executeUpdate();
            pstmt.close();

            sql = "INSERT INTO makinenatalak (makina_id_makina, atalak_id_atalak) VALUES ((SELECT id_makina FROM makina WHERE izena = ?), ?)";
            pstmt = conn.prepareStatement(sql);

            if (chckbxNewCheckBox_15.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 1);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_16.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 2);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_17.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 3);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_18.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 4);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_19.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 5);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_20.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 6);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_21.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 7);
                pstmt.executeUpdate();
            }
            if (chckbxNewCheckBox_22.isSelected()) {
                pstmt.setString(1, izena);
                pstmt.setInt(2, 8);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
