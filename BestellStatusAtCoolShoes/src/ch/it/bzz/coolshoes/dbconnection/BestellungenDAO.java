package ch.it.bzz.coolshoes.dbconnection;

import java.util.List;

import ch.it.bzz.coolshoes.model.Bestellungen;

/**
 * @author Luca Lindegger
 * @date 2017-06-29
 * @version 1.0
 */
public interface BestellungenDAO {

  List<Bestellungen> getAllData();

  String getBestellnummer();

}
