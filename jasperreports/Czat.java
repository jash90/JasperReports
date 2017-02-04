/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;


import java.sql.Timestamp;

/**
 *
 * @author ZimnY
 */
public class Czat {
    private String czattresc;
    private Timestamp czatdatawyslania;
    private String uzytkownikimie;
    private String uzytkowniknazwisko;

    public String getCzattresc() {
        return czattresc;
    }

    public void setCzattresc(String czattresc) {
        this.czattresc = czattresc;
    }

    public Timestamp getCzatdatawyslania() {
        return czatdatawyslania;
    }

    public void setCzatdatawyslania(Timestamp czatdatawyslania) {
        this.czatdatawyslania = czatdatawyslania;
    }

    public String getUzytkownikimie() {
        return uzytkownikimie;
    }

    public void setUzytkownikimie(String uzytkownikimie) {
        this.uzytkownikimie = uzytkownikimie;
    }

    public String getUzytkowniknazwisko() {
        return uzytkowniknazwisko;
    }

    public void setUzytkowniknazwisko(String uzytkowniknazwisko) {
        this.uzytkowniknazwisko = uzytkowniknazwisko;
    }

    public Czat(String czattresc, Timestamp datawyslania, String uzytkownikimie, String uzytkowniknazwisko) {
        this.czattresc = czattresc;
        this.czatdatawyslania = datawyslania;
        this.uzytkownikimie = uzytkownikimie;
        this.uzytkowniknazwisko = uzytkowniknazwisko;
    }

    @Override
    public String toString() {
        return "Czat{" + "czattresc=" + czattresc + ", datawyslania=" + czatdatawyslania + ", uzytkownikimie=" + uzytkownikimie + ", uzytkowniknazwisko=" + uzytkowniknazwisko + '}';
    }
    
}
