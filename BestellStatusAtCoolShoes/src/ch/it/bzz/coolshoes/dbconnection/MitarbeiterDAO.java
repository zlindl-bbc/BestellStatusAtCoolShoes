package ch.it.bzz.coolshoes.dbconnection;

public interface MitarbeiterDAO {

  boolean doesExist(String forename);
  
  String getPassword(String forename);
  
  boolean createUser(String name, String forename, String password);
}
