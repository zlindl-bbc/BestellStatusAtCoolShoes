package ch.it.bzz.coolshoes.model;

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
