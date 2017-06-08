package ch.it.bzz.coolshoes.view;

import javax.swing.*;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */
public class LoginView {

	/**
	 * @param args
	 *            the command line arguments
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
	 * @param panel
	 */
	private static void loginComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(10, 10, 80, 25);
		panel.add(usernameLabel);

		JTextField usernameField = new JTextField(13);
		usernameField.setBounds(100, 10, 160, 25);
		panel.add(usernameField);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordField = new JPasswordField(13);
		passwordField.setBounds(100, 40, 160, 25);
		panel.add(passwordField);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 120, 25);
		panel.add(loginButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(160, 80, 120, 25);
		panel.add(cancelButton);

	}
}