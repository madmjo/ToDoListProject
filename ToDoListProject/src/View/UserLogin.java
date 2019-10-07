package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTree;

import Controller.UserController;

import java.awt.List;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin {

	private JFrame frame;
	private JTextField textUser;
	private JTextField textPassword;
	private UserController userController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 385, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		userController=new UserController();
		
		JLabel lblNewLabel = new JLabel("          Remember");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(53, 69, 252, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(64, 146, 81, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textUser = new JTextField();
		textUser.setBounds(157, 141, 130, 26);
		frame.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(64, 189, 81, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textPassword = new JTextField();
		textPassword.setBounds(157, 185, 130, 26);
		frame.getContentPane().add(textPassword);
		textPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Login ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = textUser.getText();
				String password = textPassword.getText();
				
				try {
				if(userController.loginMethod(userName, password)) {
					
					  ToDoList window = new ToDoList();
					  window.toDoListFrame.setVisible(true);
				}
				else
					
					JOptionPane.showMessageDialog(null, "User is not exist!", 
				            "PopUp4", JOptionPane.CLOSED_OPTION);
			    
				 }
				
				catch (Exception ex){
					//throw e;
				}
			}
			
		});
		btnNewButton.setBounds(123, 242, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
