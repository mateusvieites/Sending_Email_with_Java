package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import email.SendMail;
import texts.AllTexts;

import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MessageWindow extends JFrame {

	private JPanel contentPane;
	private JTextField subject_txf;
	private JTextField file_txf;
	private JTextField to_txf;

	public MessageWindow() {
		setTitle("I dont know a good name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Options");
		menuBar.add(mnNewMenu);
		
		JMenuItem settings_menuitem = new JMenuItem("Setting");
		mnNewMenu.add(settings_menuitem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel subject_label = new JLabel("Subject:");
		subject_label.setBounds(10, 36, 46, 14);
		contentPane.add(subject_label);
		
		subject_txf = new JTextField();
		subject_txf.setBounds(66, 33, 358, 20);
		contentPane.add(subject_txf);
		subject_txf.setColumns(10);
		
		JLabel message_label = new JLabel("Message:");
		message_label.setHorizontalAlignment(SwingConstants.RIGHT);
		message_label.setBounds(10, 57, 46, 14);
		contentPane.add(message_label);
		
		JLabel file_label = new JLabel("File:");
		file_label.setHorizontalAlignment(SwingConstants.RIGHT);
		file_label.setBounds(10, 141, 46, 14);
		contentPane.add(file_label);
		
		JButton sfile_button = new JButton("Search File:");
		sfile_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sfile_button.setBounds(66, 138, 89, 20);
		contentPane.add(sfile_button);
		
		file_txf = new JTextField();
		file_txf.setBounds(165, 138, 259, 20);
		contentPane.add(file_txf);
		file_txf.setColumns(10);
		
		JLabel to_label = new JLabel("To:");
		to_label.setHorizontalAlignment(SwingConstants.RIGHT);
		to_label.setBounds(10, 11, 46, 14);
		contentPane.add(to_label);
		
		to_txf = new JTextField();
		to_txf.setBounds(66, 8, 358, 20);
		contentPane.add(to_txf);
		to_txf.setColumns(10);
		
		JTextArea message_txA = new JTextArea();
		message_txA.setBounds(66, 64, 358, 64);
		contentPane.add(message_txA);
		
		JButton send_button = new JButton("Send");
		send_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AllTexts.setMessage(message_txA.getText());
				AllTexts.setSubject(subject_txf.getText());
				AllTexts.setTo(to_txf.getText());
				new SendMail();
				
			}
		});
		send_button.setBounds(335, 163, 89, 23);
		contentPane.add(send_button);
	}
}
