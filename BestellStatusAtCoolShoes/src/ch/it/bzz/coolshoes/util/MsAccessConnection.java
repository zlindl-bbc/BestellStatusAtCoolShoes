package ch.it.bzz.coolshoes.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ch.it.bzz.coolshoes.exception.CoolShoesException;

/**
 * @author Luca Lindegger
 * @date 2017-06-27
 * @version 1.0
 */

public class MsAccessConnection {
  private static Connection connection;

  /**
   * get Connection to databasefile
   * @return
   */
  public static Connection getConnection() {
    String path = "./Database/CoolShoes.accdb";

    try {
      // Connect database with connector
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      connection = DriverManager.getConnection("jdbc:ucanaccess://" + path);
    } catch (ClassNotFoundException error) {
      // the driver class is currently not available
      throw new CoolShoesException("Treiber kann nicht gelesen werden.", error.toString());
    } catch (SQLException error) {
      // the database cannot be contacted
      // caused of a wrong name, wrong path, wrong driver,...
      throw new CoolShoesException("Verbindung kann nicht aufgebaut werden.", error.toString());
    }
    return connection;
  }

  public static void DoCloseAll(Connection con, PreparedStatement ps, ResultSet rs) {
    try {
      con.close();
      ps.close();
      rs.close();
    } catch (Exception e) {
      throw new CoolShoesException("Fehler beim schliessen der Verbindung.", e.toString());
    }
  }
  
  public static void DoCloseConAndPs(Connection con, PreparedStatement ps) {
    try {
      con.close();
      ps.close();
    } catch (Exception e) {
      throw new CoolShoesException("Fehler beim schliessen der Verbindung.", e.toString());
    }
  }
}
