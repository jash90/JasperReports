/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;

import java.util.Date;



/**
 *
 * @author ZimnY
 */
public class Znajomosc {
    private String znajomyimie;
    private String znajomynazwisko;
    private Date znajomydataurodzenia;
    private String znajomymiasto;
    private String uzytkownikimie;
    private String uzytkowniknazwisko;

    public String getZnajomyimie() {
        return znajomyimie;
    }

    public void setZnajomyimie(String znajomyimie) {
        this.znajomyimie = znajomyimie;
    }

    public String getZnajomynazwisko() {
        return znajomynazwisko;
    }

    public void setZnajomynazwisko(String znajomynazwisko) {
        this.znajomynazwisko = znajomynazwisko;
    }

    public Date getZnajomydataurodzenia() {
        return znajomydataurodzenia;
    }

    public void setZnajomydataurodzenia(Date znajomydataurodzenia) {
        this.znajomydataurodzenia = znajomydataurodzenia;
    }

    public String getZnajomymiasto() {
        return znajomymiasto;
    }

    public void setZnajomymiasto(String znajomymiasto) {
        this.znajomymiasto = znajomymiasto;
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

    public Znajomosc(String znajomyImie, String znajomyNazwisko, Date znajomyDataUrodzenia, String znajomymiasto, String uzytkownikimie, String uzytkowniknazwisko) {
        this.znajomyimie = znajomyImie;
        this.znajomynazwisko = znajomyNazwisko;
        this.znajomydataurodzenia = znajomyDataUrodzenia;
        this.znajomymiasto = znajomymiasto;
        this.uzytkownikimie = uzytkownikimie;
        this.uzytkowniknazwisko = uzytkowniknazwisko;
    }

    @Override
    public String toString() {
        return "Znajomosc{" + "znajomyImie=" + znajomyimie + ", znajomyNazwisko=" + znajomynazwisko + ", znajomyDataUrodzenia=" + znajomydataurodzenia + ", znajomymiasto=" + znajomymiasto + ", uzytkownikimie=" + uzytkownikimie + ", uzytkowniknazwisko=" + uzytkowniknazwisko + '}';
    }
    
}
