package ch.it.bzz.coolshoes.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ch.it.bzz.coolshoes.view.LoginView;

/**
 * @author Luca Lindegger
 * @date 2017-06-08
 * @version 1.0
 */

public class RegisterListener implements ActionListener, MouseListener {

  public void actionPerformed(ActionEvent e) {
    JButton source = (JButton) e.getSource();
    if (source.getText().equals("Register")) {
      JOptionPane.showMessageDialog(null, "Register-Button clicked!! Username: '"
          + LoginView.getForenameField() + "', Password: '" + LoginView.getPasswordField() + "'.");
    } else {
      LoginView.setBlankAndRequestInFocus();
    }
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    JOptionPane.showMessageDialog(null, "Already Registered link has been clicked! ");

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
