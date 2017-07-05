package ch.it.bzz.coolshoes.dbconnection;

/**
 * @author Luca Lindegger
 * @date 2017-06-29
 * @version 1.0
 */
public interface MitarbeiterDAO {

  boolean doesExist(String forename);

  String getPassword(String forename);

  boolean createUser(String name, String forename, String password);
}
