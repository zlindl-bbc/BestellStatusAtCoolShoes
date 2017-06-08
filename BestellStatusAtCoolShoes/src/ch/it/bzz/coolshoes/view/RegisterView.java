package ch.it.bzz.coolshoes.view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ch.it.bzz.coolshoes.controller.RegisterListener;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */
public class RegisterView {
  private static JLabel usernameLabel;
  private static JTextField usernameField;
  private static JLabel passwordLabel;
  private static JPasswordField passwordField;
  private static JLabel loginLink;
  private static JButton registerButton;
  private static JButton cancelButton;

  static ActionListener registerActionListener = new RegisterListener();
  static MouseListener alreadyRegisteredListener = new RegisterListener();

  /**
   * Main method
   * 
   * @param args
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Register");
    frame.setSize(300, 175);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    frame.add(panel);
    loginComponents(panel);
    RegisterView loginView = new RegisterView();

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

    loginLink = new JLabel("Already registered yet?");
    loginLink.setBounds(10, 70, 120, 25);
    loginLink.setForeground(Color.blue);
    loginLink.addMouseListener(alreadyRegisteredListener);
    panel.add(loginLink);

    registerButton = new JButton("Register");
    registerButton.setBounds(10, 100, 120, 25);
    registerButton.addActionListener(registerActionListener);
    panel.add(registerButton);

    cancelButton = new JButton("Cancel");
    cancelButton.setBounds(160, 100, 120, 25);
    cancelButton.addActionListener(registerActionListener);
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