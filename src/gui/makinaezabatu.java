package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class makinaezabatu extends JFrame {

	private JPanel contentPane;
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(288, 25, 224, 41);
		panel_1.setBackground(new Color(255, 222, 173));
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Makina ezabatu");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		
		JLabel lblNewLabel_1 = new JLabel("Aukeratu ezabatu nahi duzun makina:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(33, 128, 293, 23);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(33, 161, 118, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ezabatu");
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setBounds(637, 386, 115, 41);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atzera");
        btnNewButton_1.setBounds(33, 25, 101, 29);
        panel.add(btnNewButton_1);

        
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                bat batInstance = new bat(); 
                batInstance.setVisible(true); 
                setVisible(false); 
            }
        });
	}
}
