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
  private static JLabel nameLabel;
  private static JTextField nameField;
  private static JLabel forenameLabel;
  private static JTextField forenameField;
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
  public RegisterView() {
    JFrame frame = new JFrame("Registrieren");
    frame.setSize(300, 205);
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

    nameLabel = new JLabel("Name");
    nameLabel.setBounds(10, 10, 80, 25);
    panel.add(nameLabel);

    nameField = new JTextField(13);
    nameField.setBounds(100, 10, 160, 25);
    panel.add(nameField);
    
    forenameLabel = new JLabel("Vorname");
    forenameLabel.setBounds(10, 40, 80, 25);
    panel.add(forenameLabel);

    forenameField = new JTextField(13);
    forenameField.setBounds(100, 40, 160, 25);
    panel.add(forenameField);

    passwordLabel = new JLabel("Passwort");
    passwordLabel.setBounds(10, 70, 80, 25);
    panel.add(passwordLabel);

    passwordField = new JPasswordField(13);
    passwordField.setBounds(100, 70, 160, 25);
    panel.add(passwordField);

    loginLink = new JLabel("Schon registriert?");
    loginLink.setBounds(10, 100, 120, 25);
    loginLink.setForeground(Color.blue);
    loginLink.addMouseListener(alreadyRegisteredListener);
    panel.add(loginLink);

    registerButton = new JButton("Registrieren");
    registerButton.setBounds(10, 130, 120, 25);
    registerButton.addActionListener(registerActionListener);
    panel.add(registerButton);

    cancelButton = new JButton("Abbrechen");
    cancelButton.setBounds(160, 130, 120, 25);
    cancelButton.addActionListener(registerActionListener);
    panel.add(cancelButton);

  }
  
  public static String getNameField() {
    return nameField.getText();
  }

  public static String getForenameField() {
    return forenameField.getText();
  }

  public static String getPasswordField() {
    return String.valueOf(passwordField.getPassword());
  }

  public static void setBlankAndRequestInFocus() {
    nameField.setText("");
    forenameField.setText("");
    passwordField.setText("");
    nameField.requestFocusInWindow();
  }
  
  public static void main(String[] args){
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new RegisterView();
      }
    });
  }

}
