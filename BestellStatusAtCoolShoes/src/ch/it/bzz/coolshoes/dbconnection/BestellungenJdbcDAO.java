package ch.it.bzz.coolshoes.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.it.bzz.coolshoes.exception.CoolShoesException;
import ch.it.bzz.coolshoes.model.Bestellungen;
import ch.it.bzz.coolshoes.util.MySqlConnection;

public class BestellungenJdbcDAO implements BestellungenDAO {

  @Override
  public List<Bestellungen> getAllData() {
    String sql = "SELECT FKKunde, FKStatus, FKMitarbeiter FROM Bestellungen ORDER BY BID";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      con = MySqlConnection.getInstance();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      
      List<Bestellungen> allBestellungen = new ArrayList<Bestellungen>();
      
      while (rs.next()) {
        Bestellungen bestellungen = new Bestellungen();
        bestellungen.setFKKunde(rs.getInt("FKKunde"));
        bestellungen.setFKStatus(rs.getInt("FKStatus"));
        bestellungen.setFKMitarbeiter(rs.getInt("FKMitarbeiter"));
        
        allBestellungen.add(bestellungen);
      }
    }
    catch (SQLException e) {
      throw new CoolShoesException("Es hat einen Fehler bei einer Datenbankabfrage gegeben.",
          e.toString());
    }
    
    return null;
  }
  
  public String getBestellnummer(){
	  String sql = "SELECT Bestellnummer from BestellStatus";
	  Connection con = null;
	  PreparedStatement ps = null;
	  ResultSet rs = null;
	  
	  try {
	      con = MySqlConnection.getInstance();
	      ps = con.prepareStatement(sql);
	      rs = ps.executeQuery();

	      rs.first();
	      String dbBestellnummer = rs.getString("MAPasswort");
	      return dbBestellnummer;
	    } catch (SQLException e) {
	      throw new CoolShoesException("Es hat einen Fehler bei einer Datenbankabfrage gegeben.",
	          e.toString());
	    } finally {
	      MySqlConnection.closePsRs(ps, rs);
	    }
	  
  }

}
