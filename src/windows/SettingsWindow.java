package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import texts.AllTexts;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class SettingsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField email_txtf;
	private JTextField password_txtf;
	
	public SettingsWindow(boolean firstTime) {
		setTitle("Setting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel email_label = new JLabel("Email:");
		email_label.setHorizontalAlignment(SwingConstants.RIGHT);
		email_label.setBounds(10, 11, 56, 14);
		contentPane.add(email_label);
		
		email_txtf = new JTextField();
		email_txtf.setBounds(76, 8, 325, 20);
		contentPane.add(email_txtf);
		email_txtf.setColumns(10);
		
		JLabel password_label = new JLabel("Password:");
		password_label.setHorizontalAlignment(SwingConstants.RIGHT);
		password_label.setBounds(0, 36, 66, 14);
		contentPane.add(password_label);
		
		password_txtf = new JTextField();
		password_txtf.setBounds(76, 33, 325, 20);
		contentPane.add(password_txtf);
		password_txtf.setColumns(10);
		
		JButton confirm_button = new JButton("Confirm");
		confirm_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean emailText = AllTexts.checkError(email_label.getText());
				boolean passwordText = AllTexts.checkError(password_txtf.getText());
				
				if(emailText && passwordText) {
					AllTexts.setMyEmail(email_txtf.getText());
					AllTexts.setPassWord(password_txtf.getText());
					
					if(firstTime) {
						new MessageWindow().setVisible(true);
						dispose();
					}else {
						dispose();
					}
				}else {
					// #TODO ERROR MESSAGE
				}
			}
		});
		confirm_button.setBounds(312, 59, 89, 23);
		contentPane.add(confirm_button);
	}
}
