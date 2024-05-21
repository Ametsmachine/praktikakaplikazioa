package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class makinaeditatu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the frame.
	 */
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
		panel.setBounds(336, 21, 234, 44);
		panel.setBackground(new Color(255, 228, 181));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Makina gehitu");
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
		textField_5.setBounds(200, 330, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
        
        JLabel lblNewLabel_1_4_1_1 = new JLabel("Produktu kimikoak:");
        lblNewLabel_1_4_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1.setBounds(36, 385, 206, 19);
        contentPane.add(lblNewLabel_1_4_1_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox(" Mikrolubrikaziorako olioa: LUBRI FLUID   (HRE HIDRAULIC)");
        chckbxNewCheckBox.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox.setBounds(36, 431, 434, 21);
        contentPane.add(chckbxNewCheckBox);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Gidak eta elementuak labaintzeko olioa:DROSERA MS 68  (TOTAL ESPAÑA)\r\n");
        chckbxNewCheckBox_1.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_1.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_1.setBounds(36, 470, 464, 21);
        contentPane.add(chckbxNewCheckBox_1);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox(" Abiadura eta aitzinapen kaxarako olioa:AZOLLA ZS 68 (TOTAL ESPAÑA)");
        chckbxNewCheckBox_2.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_2.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox_2.setBounds(36, 508, 440, 21);
        contentPane.add(chckbxNewCheckBox_2);
        
        JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Arriskuak:");
        lblNewLabel_1_4_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1.setBounds(36, 555, 206, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Soinean dugun zerbait,  makinaren mugitzenari  \r\nden atalen batean korapilatzea:mahukak, lepokoak, hilea …");
        chckbxNewCheckBox_3.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_3.setFont(new Font("Arial", Font.BOLD, 11));
        chckbxNewCheckBox_3.setBounds(36, 590, 625, 29);
        contentPane.add(chckbxNewCheckBox_3);
        
        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Piezen bizarrekin, hertz biziekin, kutxilekin… ebakiak egiteko arriskua.");
        chckbxNewCheckBox_4.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_4.setFont(new Font("Arial", Font.BOLD, 11));
        chckbxNewCheckBox_4.setBounds(36, 621, 362, 21);
        contentPane.add(chckbxNewCheckBox_4);
        
        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Irrist egitea lurrean egon daiteken olioarekin");
        chckbxNewCheckBox_5.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_5.setFont(new Font("Arial", Font.BOLD, 11));
        chckbxNewCheckBox_5.setBounds(36, 651, 452, 21);
        contentPane.add(chckbxNewCheckBox_5);
        
        JLabel lblNewLabel_1_4_1_1_1_1 = new JLabel(" Norberaren babeserako ekipoak:");
        lblNewLabel_1_4_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1_1.setBounds(549, 125, 377, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1_1);
        
        JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Betaurrekoak");
        chckbxNewCheckBox_6.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_6.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_6.setBounds(561, 150, 156, 21);
        contentPane.add(chckbxNewCheckBox_6);
        
        JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Altzairuzko punta duen segurtasun botak.");
        chckbxNewCheckBox_7.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_7.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_7.setBounds(561, 173, 341, 21);
        contentPane.add(chckbxNewCheckBox_7);
        
        JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Txaketa, buzoa edo bata.");
        chckbxNewCheckBox_8.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_8.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_8.setBounds(561, 192, 243, 21);
        contentPane.add(chckbxNewCheckBox_8);
        
        JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Eskularruak");
        chckbxNewCheckBox_9.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_9.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_9.setBounds(561, 215, 122, 21);
        contentPane.add(chckbxNewCheckBox_9);
        
        JLabel lblNewLabel_1_4_1_1_1_1_1 = new JLabel("Sortarazitako hondakinak:");
        lblNewLabel_1_4_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1_1_1.setBounds(561, 281, 377, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1_1_1);
        
        JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Altzairuzko eta aluminiozko totxoak");
        chckbxNewCheckBox_10.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_10.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_10.setBounds(561, 306, 311, 21);
        contentPane.add(chckbxNewCheckBox_10);
        
        JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Txirbila: Altzairua, Aluminioa.");
        chckbxNewCheckBox_11.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_11.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_11.setBounds(561, 331, 311, 21);
        contentPane.add(chckbxNewCheckBox_11);
        
        JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Metal gogorrezko plakatxoa hondatuak");
        chckbxNewCheckBox_12.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_12.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_12.setBounds(561, 354, 311, 21);
        contentPane.add(chckbxNewCheckBox_12);
        
        JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Altzairu lasterreko erreminta hondatuak");
        chckbxNewCheckBox_13.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_13.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_13.setBounds(561, 377, 311, 21);
        contentPane.add(chckbxNewCheckBox_13);
        
        JCheckBox chckbxNewCheckBox_14 = new JCheckBox("Olioa");
        chckbxNewCheckBox_14.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_14.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_14.setBounds(561, 400, 93, 21);
        contentPane.add(chckbxNewCheckBox_14);
        
        JLabel lblNewLabel_1_4_1_1_1_1_1_1 = new JLabel("Makinaren atalak:");
        lblNewLabel_1_4_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1_4_1_1_1_1_1_1.setBounds(561, 468, 377, 19);
        contentPane.add(lblNewLabel_1_4_1_1_1_1_1_1);
        
        JCheckBox chckbxNewCheckBox_15 = new JCheckBox("F-eko makinen piezak");
        chckbxNewCheckBox_15.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_15.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_15.setBounds(561, 508, 243, 21);
        contentPane.add(chckbxNewCheckBox_15);
        
        JCheckBox chckbxNewCheckBox_16 = new JCheckBox("T-eko makinen piezak");
        chckbxNewCheckBox_16.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_16.setFont(new Font("Arial", Font.BOLD, 14));
        chckbxNewCheckBox_16.setBounds(561, 542, 190, 21);
        contentPane.add(chckbxNewCheckBox_16);
        
        JButton btnNewButton = new JButton("Editatu");
        btnNewButton.setBackground(new Color(255, 228, 181));
        btnNewButton.setBounds(748, 621, 124, 44);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Atzera");
        btnNewButton_1.setBounds(26, 21, 85, 29);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bat ventanaBat = new bat(); // Crear una instancia de la clase bat
                ventanaBat.setVisible(true); // Mostrar la ventana bat
                setVisible(false); // Opcional: ocultar la ventana actual
            }
        });
        contentPane.add(btnNewButton_1);
        
       
		
	}
}