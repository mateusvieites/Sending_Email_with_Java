package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SettingsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public SettingsWindow() {
		setTitle("Setting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel email_label = new JLabel("Email:");
		email_label.setHorizontalAlignment(SwingConstants.RIGHT);
		email_label.setBounds(10, 11, 46, 14);
		contentPane.add(email_label);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 335, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel password_label = new JLabel("Password:");
		password_label.setHorizontalAlignment(SwingConstants.RIGHT);
		password_label.setBounds(0, 36, 56, 14);
		contentPane.add(password_label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 33, 335, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton confirm_button = new JButton("Confirm");
		confirm_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		confirm_button.setBounds(312, 59, 89, 23);
		contentPane.add(confirm_button);
	}
}
