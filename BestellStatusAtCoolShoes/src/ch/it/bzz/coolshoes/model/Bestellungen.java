package ch.it.bzz.coolshoes.model;

/**
 * @author Luca Lindegger
 * @date 2017-06-29
 * @version 1.0
 */
public class Bestellungen {

  private int BID;
  private int FKKunde;
  private int FKStatus;
  private int FKMitarbeiter;
  public int getBID() {
    return BID;
  }
  public void setBID(int bID) {
    BID = bID;
  }
  public int getFKKunde() {
    return FKKunde;
  }
  public void setFKKunde(int fKKunde) {
    FKKunde = fKKunde;
  }
  public int getFKStatus() {
    return FKStatus;
  }
  public void setFKStatus(int fKStatus) {
    FKStatus = fKStatus;
  }
  public int getFKMitarbeiter() {
    return FKMitarbeiter;
  }
  public void setFKMitarbeiter(int fKMitarbeiter) {
    FKMitarbeiter = fKMitarbeiter;
  }
  
  
}
