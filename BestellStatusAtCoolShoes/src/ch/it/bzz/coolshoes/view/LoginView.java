package ch.it.bzz.coolshoes.view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;

import ch.it.bzz.coolshoes.controller.LoginController;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */
public class LoginView {
  private static JLabel forenameLabel;
  private static JTextField forenameField;
  private static JLabel passwordLabel;
  private static JPasswordField passwordField;
  private static JLabel registerLink;
  private static JButton loginButton;
  private static JButton cancelButton;

  static ActionListener loginActionListener = new LoginController();
  static MouseListener notRegisteredListener = new LoginController();

  /**
   * Main method
   * 
   * @param args
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login");
    frame.setSize(300, 175);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    frame.add(panel);
    loginComponents(panel);

    frame.setVisible(true);

  }

  /**
   * Initialize components for Login Panel
   * 
   * @param panel
   */
  private static void loginComponents(JPanel panel) {
    panel.setLayout(null);

    forenameLabel = new JLabel("Vorname");
    forenameLabel.setBounds(10, 10, 80, 25);
    panel.add(forenameLabel);

    forenameField = new JTextField(13);
    forenameField.setBounds(100, 10, 160, 25);
    panel.add(forenameField);

    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 40, 80, 25);
    panel.add(passwordLabel);

    passwordField = new JPasswordField(13);
    passwordField.setBounds(100, 40, 160, 25);
    panel.add(passwordField);

    registerLink = new JLabel("Nicht registriert?");
    registerLink.setBounds(10, 70, 120, 25);
    registerLink.setForeground(Color.blue);
    registerLink.addMouseListener(notRegisteredListener);
    panel.add(registerLink);

    loginButton = new JButton("Login");
    loginButton.setBounds(10, 100, 120, 25);
    loginButton.addActionListener(loginActionListener);
    panel.add(loginButton);

    cancelButton = new JButton("Abbrechen");
    cancelButton.setBounds(160, 100, 120, 25);
    cancelButton.addActionListener(loginActionListener);
    panel.add(cancelButton);

  }

  public static String getForenameField() {
    return forenameField.getText();
  }

  public static String getPasswordField() {
    return String.valueOf(passwordField.getPassword());
  }

  public static void setBlankAndRequestInFocus() {
    forenameField.setText("");
    passwordField.setText("");
    forenameField.requestFocusInWindow();
  }

}
