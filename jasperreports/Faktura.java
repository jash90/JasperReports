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
public class Faktura {
    private Long pozycja;
    private String nazwaproduktu;
    private Float cena;
    private Integer vat;
    private String jm;
    private String nazwafirmy;
    private String adresfirmy;
    private String miejscowoscfirmy;
    private String kodpocztowyfirmy;
    private String nipfirmy;
    private String nazwauzytkownika;
    private String adresuzytkownika;
    private String miejscowoscuzytkownika;
    private String kodpocztowyuzytkownika;
    private String nipuzytkownika;
    private Integer ilosc;
    private Integer idfaktura;
    private Date datawystawienia;
    private Double sum;

    public Long getPozycja() {
        return pozycja;
    }

    public void setPozycja(Long pozycja) {
        this.pozycja = pozycja;
    }

    public String getNazwaproduktu() {
        return nazwaproduktu;
    }

    public void setNazwaproduktu(String nazwaproduktu) {
        this.nazwaproduktu = nazwaproduktu;
    }

    public Float getCena() {
        return cena;
    }

    public void setCena(Float cena) {
        this.cena = cena;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public String getJm() {
        return jm;
    }

    public void setJm(String jm) {
        this.jm = jm;
    }

    public String getNazwafirmy() {
        return nazwafirmy;
    }

    public void setNazwafirmy(String nazwafirmy) {
        this.nazwafirmy = nazwafirmy;
    }

    public String getAdresfirmy() {
        return adresfirmy;
    }

    public void setAdresfirmy(String adresfirmy) {
        this.adresfirmy = adresfirmy;
    }

    public String getMiejscowoscfirmy() {
        return miejscowoscfirmy;
    }

    public void setMiejscowoscfirmy(String miejscowoscfirmy) {
        this.miejscowoscfirmy = miejscowoscfirmy;
    }

    public String getKodpocztowyfirmy() {
        return kodpocztowyfirmy;
    }

    public void setKodpocztowyfirmy(String kodpocztowyfirmy) {
        this.kodpocztowyfirmy = kodpocztowyfirmy;
    }

    public String getNipfirmy() {
        return nipfirmy;
    }

    public void setNipfirmy(String nipfirmy) {
        this.nipfirmy = nipfirmy;
    }

    public String getNazwauzytkownika() {
        return nazwauzytkownika;
    }

    public void setNazwauzytkownika(String nazwauzytkownika) {
        this.nazwauzytkownika = nazwauzytkownika;
    }

    public String getAdresuzytkownika() {
        return adresuzytkownika;
    }

    public void setAdresuzytkownika(String adresuzytkownika) {
        this.adresuzytkownika = adresuzytkownika;
    }

    public String getMiejscowoscuzytkownika() {
        return miejscowoscuzytkownika;
    }

    public void setMiejscowoscuzytkownika(String miejscowoscuzytkownika) {
        this.miejscowoscuzytkownika = miejscowoscuzytkownika;
    }

    public String getKodpocztowyuzytkownika() {
        return kodpocztowyuzytkownika;
    }

    public void setKodpocztowyuzytkownika(String kodpocztowyuzytkownika) {
        this.kodpocztowyuzytkownika = kodpocztowyuzytkownika;
    }

    public String getNipuzytkownika() {
        return nipuzytkownika;
    }

    public void setNipuzytkownika(String nipuzytkownika) {
        this.nipuzytkownika = nipuzytkownika;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public Integer getIdfaktura() {
        return idfaktura;
    }

    public void setIdfaktura(Integer idfaktura) {
        this.idfaktura = idfaktura;
    }

    public Date getDatawystawienia() {
        return datawystawienia;
    }

    public void setDatawystawienia(Date datawystawienia) {
        this.datawystawienia = datawystawienia;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Faktura(Long pozycja, String nazwaproduktu, Float cena, Integer vat, String jm, String nazwafirmy, String adresfirmy, String miejscowoscfirmy, String kodpocztowyfirmy, String nipfirmy, String nazwauzytkownika, String adresuzytkownika, String miejscowoscuzytkownika, String kodpocztowyuzytkownika, String nipuzytkownika, Integer ilosc, Integer idfaktura, Date datawystawienia, Double sum) {
        this.pozycja = pozycja;
        this.nazwaproduktu = nazwaproduktu;
        this.cena = cena;
        this.vat = vat;
        this.jm = jm;
        this.nazwafirmy = nazwafirmy;
        this.adresfirmy = adresfirmy;
        this.miejscowoscfirmy = miejscowoscfirmy;
        this.kodpocztowyfirmy = kodpocztowyfirmy;
        this.nipfirmy = nipfirmy;
        this.nazwauzytkownika = nazwauzytkownika;
        this.adresuzytkownika = adresuzytkownika;
        this.miejscowoscuzytkownika = miejscowoscuzytkownika;
        this.kodpocztowyuzytkownika = kodpocztowyuzytkownika;
        this.nipuzytkownika = nipuzytkownika;
        this.ilosc = ilosc;
        this.idfaktura = idfaktura;
        this.datawystawienia = datawystawienia;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Faktura{" + "pozycja=" + pozycja + ", nazwaproduktu=" + nazwaproduktu + ", cena=" + cena + ", vat=" + vat + ", jm=" + jm + ", nazwafirmy=" + nazwafirmy + ", adresfirmy=" + adresfirmy + ", miejscowoscfirmy=" + miejscowoscfirmy + ", kodpocztowyfirmy=" + kodpocztowyfirmy + ", nipfirmy=" + nipfirmy + ", nazwauzytkownika=" + nazwauzytkownika + ", adresuzytkownika=" + adresuzytkownika + ", miejscowoscuzytkownika=" + miejscowoscuzytkownika + ", kodpocztowyuzytkownika=" + kodpocztowyuzytkownika + ", nipuzytkownika=" + nipuzytkownika + ", ilosc=" + ilosc + ", idfaktura=" + idfaktura + ", datawystawienia=" + datawystawienia + ", sum=" + sum + '}';
    }
              
}
