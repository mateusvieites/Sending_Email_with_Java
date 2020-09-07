package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MessageWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public MessageWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Options");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Setting");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel subject_label = new JLabel("Subject:");
		subject_label.setBounds(10, 11, 46, 14);
		contentPane.add(subject_label);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 358, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel message_label = new JLabel("Message:");
		message_label.setHorizontalAlignment(SwingConstants.RIGHT);
		message_label.setBounds(10, 36, 46, 14);
		contentPane.add(message_label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 33, 358, 80);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel file_label = new JLabel("File");
		file_label.setHorizontalAlignment(SwingConstants.RIGHT);
		file_label.setBounds(10, 125, 46, 14);
		contentPane.add(file_label);
	}
}
