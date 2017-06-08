package ch.it.bzz.coolshoes.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ch.it.bzz.coolshoes.view.LoginView;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */

public class LoginActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if (source.getText().equals("Login")) {
			JOptionPane.showMessageDialog(null, "Login-Button clicked!! Username: '" + LoginView.getUsernameField()
					+ "', Password: '" + LoginView.getPasswordField() + "'.");
		} else {
			LoginView.setBlankAndRequestInFocus();
		}
	}

}