package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class bat extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public bat() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 726, 551);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setForeground(SystemColor.textText);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
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

        hornitzaileakikusi.setBounds(30, 158, 61, 43);
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
        btnHornitzaileaBihurtu.setBounds(30, 264, 61, 43);
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
        btnNewButton.setBounds(30, 377, 75, 43);
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
        btnNewButton_1.setBounds(10, 10, 81, 29);
        contentPane.add(btnNewButton_1);
    }

    public static bat getExistingInstance() {
        
        return null;
    }
}


