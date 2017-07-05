package ch.it.bzz.coolshoes.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.apache.commons.lang.StringUtils;

import ch.it.bzz.coolshoes.dbconnection.MitarbeiterDAO;
import ch.it.bzz.coolshoes.dbconnection.MitarbeiterJdbcDAO;
import ch.it.bzz.coolshoes.view.LoginView;
import ch.it.bzz.coolshoes.view.MainView;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */

public class LoginController implements ActionListener, MouseListener {

	private MitarbeiterDAO mitarbeiterDAO = new MitarbeiterJdbcDAO();
	MainView mainView = new MainView();
	LoginView loginView = new LoginView();

	/**
	 * Actionlistener when Button is clicked in LoginView
	 */
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if (source.getText().equals("Login")) {
			String forename = LoginView.getForenameField();
			String password = LoginView.getPasswordField();

			if (StringUtils.isBlank(forename) || StringUtils.isBlank(password)) {
				JOptionPane.showMessageDialog(null, "Bitte füllen sie alle Felder aus...", "Felder leer",
						JOptionPane.WARNING_MESSAGE);
			} else {
				if (mitarbeiterDAO.doesExist(forename)) {
					String dbPassword = mitarbeiterDAO.getPassword(forename);
					if (password.equals(dbPassword)) {
						// open Main (logged-in part)
						mainView.initGUI();

					} else {
						JOptionPane.showMessageDialog(null, "Passwort falsch!", "Login-Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Benutzer wurde nicht gefunden!", "Login-Error",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		} else {
			LoginView.setBlankAndRequestInFocus();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// open Register view

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
