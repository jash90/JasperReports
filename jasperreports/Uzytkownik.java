/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;

import java.sql.Date;

/**
 *
 * @author ZimnY
 */
public class Uzytkownik {
    private String imie;
    private String nazwisko;
    private Date dataurodzenia;
    private String nazwa;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(Date dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Uzytkownik(String imie, String nazwisko, Date dataurodzenia, String nazwa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", dataurodzenia=" + dataurodzenia + ", nazwa=" + nazwa + '}';
    }
    
}
