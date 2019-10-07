package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import datechooser.beans.DateChooserCombo;

public class ToDoList {

	public JFrame toDoListFrame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToDoList window = new ToDoList();
					window.toDoListFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ToDoList() {
		initialize();
	}

	/**
	 * Initialize the contents of the toDoListFrame.
	 */
	private void initialize() {
		toDoListFrame = new JFrame();
		toDoListFrame.getContentPane().setBackground(new Color(153, 204, 255));
		toDoListFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" List");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 34, 112, 22);
		toDoListFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Title");
		lblNewLabel_1.setBounds(35, 94, 61, 16);
		toDoListFrame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(118, 89, 145, 26);
		toDoListFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setBounds(35, 132, 61, 16);
		toDoListFrame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add  Lines");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(89, 169, 181, 29);
		toDoListFrame.getContentPane().add(btnNewButton);
		
		DateChooserCombo dateChooserCombo = new DateChooserCombo();
		dateChooserCombo.setBounds(118, 122, 145, 26);
		toDoListFrame.getContentPane().add(dateChooserCombo);
		toDoListFrame.setBounds(100, 100, 393, 293);
		toDoListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
