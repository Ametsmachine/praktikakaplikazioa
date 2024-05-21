package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class erregistro extends JFrame {

    private JPanel contentPane;
    private JTextField textField; 
    private JTextField textField_1; 
    private JTextField textField_2; 

    public erregistro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 657, 562);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 222, 173));
        panel.setBounds(231, 28, 177, 47);
        contentPane.add(panel);
        
                JLabel lblNewLabel = new JLabel("Erregistratu");
                panel.add(lblNewLabel);
                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));

        setupLabelsAndFields();

        JButton btnNewButton = new JButton("Gorde");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveToDatabase();
            }
        });
        btnNewButton.setBounds(429, 289, 91, 47);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Atzera");
        btnNewButton_1.setBackground(new Color(211, 211, 211));
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                hasiera hasieraFrame = new hasiera(); 
                hasieraFrame.setVisible(true); 
            }
        });
        btnNewButton_1.setBounds(31, 28, 91, 25);
        contentPane.add(btnNewButton_1);
    }

    private void setupLabelsAndFields() {
        JLabel lblNewLabel_1 = new JLabel("Izena:");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_1.setBounds(186, 116, 91, 22);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Abizena:");
        lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_1_1.setBounds(186, 174, 91, 22);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("NAN:");
        lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_1_2.setBounds(197, 240, 91, 22);
        contentPane.add(lblNewLabel_1_2);

        textField = new JTextField();
        textField.setBounds(287, 120, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(287, 178, 96, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(287, 240, 96, 18);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
    }

    private void saveToDatabase() {
        String izena = textField.getText();
        String abizena = textField_1.getText();
        String nan = textField_2.getText();

        String dbUrl = "jdbc:mysql://localhost:3306/praktikak";
        String dbUser = "root";
        String dbPassword = "1WMG2023";

        String sql = "INSERT INTO erabiltzaileak (izena, abizena, NAN) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, izena);
            preparedStatement.setString(2, abizena);
            preparedStatement.setString(3, nan);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datuak ondo gordeta!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errorea datuak gordetzean: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
