package ch.it.bzz.coolshoes.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import ch.it.bzz.coolshoes.exception.CoolShoesException;

/**
 * @author Luca Lindegger
 * @date 2017-06-27
 * @version 1.0
 */

public class MySqlConnection {

  public static Connection con;

  // Host
  private static String dbHost = "jdbc:mysql://sql11.freesqldatabase.com";

  // Port
  private static String dbPort = "3306";

  // Databasename
  private static String database = "sql11182658";

  // Databaseuser
  private static String dbUser = "sql11182658";

  // Databasepassword
  private static String dbPassword = "tLwKwj9l3k";

  public MySqlConnection() {
    try {
      // Load driver
      Class.forName("com.mysql.jdbc.Driver");

      // create connection
      con = DriverManager.getConnection(
          dbHost + "/" + database + "?" + "user=" + dbUser + "&password=" + dbPassword);
      setCon(con);
    } catch (ClassNotFoundException e) {
      throw new CoolShoesException("Treiber kann nicht gelesen werden.", e.toString());
    } catch (SQLException e) {
      throw new CoolShoesException("Treiber kann nicht gelesen werden.", e.toString());
    }
  }

  public static Connection getInstance() {
    if (con == null)
      new MySqlConnection();
    return con;
  }

  public static void setCon(Connection con) {
    MySqlConnection.con = con;
  }

}
