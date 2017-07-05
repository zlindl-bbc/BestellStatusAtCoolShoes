package ch.it.bzz.coolshoes.controller;

import java.util.List;

import ch.it.bzz.coolshoes.dbconnection.BestellungenDAO;
import ch.it.bzz.coolshoes.dbconnection.BestellungenJdbcDAO;
import ch.it.bzz.coolshoes.model.Bestellungen;

public class BestellungenController {

  private BestellungenDAO bestellungenDAO = new BestellungenJdbcDAO();
  
  public List<Bestellungen> getAllData() {
    return bestellungenDAO.getAllData();
  }
}
