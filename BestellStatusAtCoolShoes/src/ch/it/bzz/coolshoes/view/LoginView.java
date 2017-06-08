package ch.it.bzz.coolshoes.view;

import java.awt.event.ActionListener;

import javax.swing.*;

import ch.it.bzz.coolshoes.controller.LoginActionListener;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */
public class LoginView {
	private static JLabel usernameLabel;
	private static JTextField usernameField;
	private static JLabel passwordLabel;
	private static JPasswordField passwordField;
	private static JButton loginButton;
	private static JButton cancelButton;

	static ActionListener loginActionListener = new LoginActionListener();

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Login");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		loginComponents(panel);
		LoginView loginView = new LoginView();

		frame.setVisible(true);

	}

	/**
	 * Initialize components for Login Panel
	 * 
	 * @param panel
	 */
	private static void loginComponents(JPanel panel) {
		panel.setLayout(null);

		usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(10, 10, 80, 25);
		panel.add(usernameLabel);

		usernameField = new JTextField(13);
		usernameField.setBounds(100, 10, 160, 25);
		panel.add(usernameField);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		passwordField = new JPasswordField(13);
		passwordField.setBounds(100, 40, 160, 25);
		panel.add(passwordField);

		loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 120, 25);
		loginButton.addActionListener(loginActionListener);
		panel.add(loginButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(160, 80, 120, 25);
		cancelButton.addActionListener(loginActionListener);
		panel.add(cancelButton);

	}

	public static String getUsernameField() {
		return usernameField.getText();
	}

	public static String getPasswordField() {
		return String.valueOf(passwordField.getPassword());
	}
	
	public static void setBlankAndRequestInFocus() {
		usernameField.setText("");
		passwordField.setText("");
		usernameField.requestFocusInWindow();
	}
	
}