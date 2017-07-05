package ch.it.bzz.coolshoes.model;

import java.sql.Date;

/**
 * @author Luca Lindegger
 * @date 2017-06-29
 * @version 1.0
 */
public class BestellStatus {

  private int BSID;
  private String Bestellnummer;
  private String Status;
  private Date Bearbeitung;
  private Date Lieferunggeplant;

  public int getBSID() {
    return BSID;
  }

  public void setBSID(int bSID) {
    BSID = bSID;
  }

  public String getBestellnummer() {
    return Bestellnummer;
  }

  public void setBestellnummer(String bestellnummer) {
    Bestellnummer = bestellnummer;
  }

  public String getStatus() {
    return Status;
  }

  public void setStatus(String status) {
    Status = status;
  }

  public Date getBearbeitung() {
    return Bearbeitung;
  }

  public void setBearbeitung(Date bearbeitung) {
    Bearbeitung = bearbeitung;
  }

  public Date getLieferunggeplant() {
    return Lieferunggeplant;
  }

  public void setLieferunggeplant(Date lieferunggeplant) {
    Lieferunggeplant = lieferunggeplant;
  }


}
