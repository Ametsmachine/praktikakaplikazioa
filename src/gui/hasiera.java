package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class hasiera extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField passwordField;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                hasiera frame = new hasiera();
                frame.setVisible(true);
            }
        });
    }

    public hasiera() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 802, 682);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Izena:");
        lblNewLabel_1.setForeground(SystemColor.menuText);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(193, 271, 133, 31);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Hasi saioa");
        btnNewButton.setBackground(new Color(255, 222, 173));
        btnNewButton.setForeground(SystemColor.menuText);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = new String(passwordField.getPassword());

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikak", "root", "1WMG2023");
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT * FROM erabiltzaileak WHERE izena='" + username + "' AND NAN='" + password + "'");
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Ongi etorri!");
                        dispose();

                       
                        bat frame = bat.getExistingInstance();
                        if (frame == null) {
                            
                            frame = new bat();
                        }
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Saiatu berriro...");
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(512, 368, 167, 31);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_1_1 = new JLabel("Pasahitza:");
        lblNewLabel_1_1.setBackground(new Color(0, 0, 0));
        lblNewLabel_1_1.setForeground(SystemColor.textText);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(193, 312, 116, 31);
        contentPane.add(lblNewLabel_1_1);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
        passwordField.setBounds(341, 312, 167, 30);
        contentPane.add(passwordField);

        textField = new JTextField();
        textField.setBounds(341, 271, 167, 29);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 228, 181));
        panel.setBounds(234, 166, 327, 54);
        contentPane.add(panel);
        
        JLabel lblNewLabel = new JLabel("Hasi Saioa");
        panel.add(lblNewLabel);
        lblNewLabel.setBackground(new Color(255, 239, 213));
        lblNewLabel.setForeground(Color.DARK_GRAY);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
        
        JButton btnNewButton_1 = new JButton("Erregistratu");
        btnNewButton_1.setForeground(new Color(0, 0, 0));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_1.setBackground(new Color(255, 182, 193));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  
                erregistro registroFrame = new erregistro();  
                registroFrame.setVisible(true);  
            }
        });
        btnNewButton_1.setBounds(512, 420, 167, 31);
        contentPane.add(btnNewButton_1);
    }
}