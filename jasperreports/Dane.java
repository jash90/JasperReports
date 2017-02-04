/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.control.Alert;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZimnY
 */
public class Dane {

    public static ArrayList<Post> raport1(){
        try{
        String zapytanie = "select idposta, imie, nazwisko, tresc, dataposta from posty"
                + " join uzytkownicy on posty.iduzytkownika=uzytkownicy.iduzytkownika "
                + "where posty.iduzytkownika=1;";
        String zapytanie1 = "SELECT emocje.nazwa AS nazwa, COALESCE(n1.ilosc,'0') AS ilosc FROM (SELECT idemocji, "
                + "count(idemocji) AS ilosc FROM interakcje WHERE idposta = ";
        String zapytanie2 = " GROUP BY idemocji) AS n1 RIGHT JOIN emocje ON emocje.idemocji = n1.idemocji;";
        ResultSet rs = JDBC.result(zapytanie);
        ResultSetMetaData rmd = rs.getMetaData();
        ArrayList<Post> posty = new ArrayList<Post>();
        rs.next();
        for (int i = 0; i < rmd.getColumnCount(); i++) {

            posty.add(new Post(rs.getInt("idposta"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("tresc"), rs.getTimestamp("dataposta")));
            rs.next();
        }

        for (Post p : posty) {
            ResultSet rs2 = JDBC.result(zapytanie1 + p.getIdposta().toString() + zapytanie2);
            rs2.next();
            p.setLike(rs2.getInt("ilosc"));
            rs2.next();
            p.setDislike(rs2.getInt("ilosc"));
            rs2.next();
            p.setHappy(rs2.getInt("ilosc"));
            rs2.next();
            p.setSad(rs2.getInt("ilosc"));
            System.out.println(p.toString());
        }

        return posty;
        }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
        return null;
    }

    public static ArrayList<Post> raport2(){
        try{
        Random r = new Random();
        ArrayList<Post> lista = new ArrayList<Post>();
        String zapytanie = "SELECT DISTINCT\n"
                + "posty.idposta,\n"
                + "uzytkownicy.imie,\n"
                + "uzytkownicy.nazwisko,\n"
                + "posty.tresc,\n"
                + "posty.dataposta,\n"
                + "(SELECT COUNT(IDEMOCJI) from interakcje S2 where S2.IDEMOCJI=1 and S2.idposta=posty.idposta) AS \"like\",\n"
                + "(SELECT COUNT(IDEMOCJI) from interakcje S2 where S2.IDEMOCJI=2 and S2.idposta=posty.idposta) AS \"dislike\",\n"
                + "(SELECT COUNT(IDEMOCJI) from interakcje S2 where S2.IDEMOCJI=3 and S2.idposta=posty.idposta) AS \"happy\",\n"
                + "(SELECT COUNT(IDEMOCJI) from interakcje S2 where S2.IDEMOCJI=4 and S2.idposta=posty.idposta) AS \"sad\"\n"
                + "FROM\n"
                + "posty\n"
                + "INNER JOIN uzytkownicy ON posty.iduzytkownika = uzytkownicy.iduzytkownika\n"
                + "LEFT JOIN interakcje AS s1 ON s1.idposta = posty.idposta AND s1.iduzytkownika = uzytkownicy.iduzytkownika\n"
                + "INNER JOIN znajomi ON znajomi.idznajomego = uzytkownicy.iduzytkownika\n"
                + "WHERE NOT posty.iduzytkownika=2 AND znajomi.idznajomego=2 OR znajomi.iduzytkownika=2\n"
                + "ORDER BY dataposta";
        ResultSet rs = JDBC.result(zapytanie);
        ResultSetMetaData rmd = rs.getMetaData();

        while (rs.next()) {
            lista.add(new Post(rs.getInt("idposta"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("tresc"), rs.getTimestamp("dataposta"), rs.getInt("like"), rs.getInt("dislike"), rs.getInt("happy"), rs.getInt("sad")));
        }
        for (Post p : lista) {
            System.out.println(p.toString());
        }

        return lista;
         }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
        return null;

    }

    public static ArrayList<Znajomosc> raport3(){
        try{
        ArrayList<Znajomosc> lista = new ArrayList<Znajomosc>();
        String zapytanie = "SELECT"
                + "     uzytkownicy.\"imie\" AS znajomyimie,\n"
                + "     uzytkownicy.\"nazwisko\" AS znajomynazwisko,\n"
                + "     uzytkownicy.\"dataurodzenia\" AS znajomydataurodzenia,\n"
                + "     uzytkownicy.\"miasto\" AS znajomymiasto,\n"
                + "     uzytkownicy_A.\"imie\" AS uzytkownikimie,\n"
                + "     uzytkownicy_A.\"nazwisko\" AS uzytkowniknazwisko\n"
                + "FROM\n"
                + "     \"public\".\"uzytkownicy\" uzytkownicy INNER JOIN \"public\".\"znajomi\" znajomi ON uzytkownicy.\"iduzytkownika\" = znajomi.\"idznajomego\"\n"
                + "     INNER JOIN \"public\".\"uzytkownicy\" uzytkownicy_A ON znajomi.\"iduzytkownika\" = uzytkownicy_A.\"iduzytkownika\"\n"
                + "WHERE\n"
                + "     znajomi.\"iduzytkownika\" = 1\n"
                + " AND znajomi.\"zaproszenie\" = FALSE";
        ResultSet rs = JDBC.result(zapytanie);
        ResultSetMetaData rmd = rs.getMetaData();

        while (rs.next()) {
            lista.add(new Znajomosc(rs.getString("znajomyimie"), rs.getString("znajomynazwisko"), rs.getDate("znajomydataurodzenia"), rs.getString("znajomymiasto"), rs.getString("uzytkownikimie"), rs.getString("uzytkowniknazwisko")));
        }
        for (Znajomosc z : lista) {
            System.out.println(z.toString());
        }
        return lista;
         }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
        return null;
    }

    public static ArrayList<Czat> raport4(){
        try{
        ArrayList<Czat> lista = new ArrayList<Czat>();
        String zapytanie = "SELECT\n"
                + "     czat.\"tresc\" AS czattresc,\n"
                + "     czat.\"datawyslania\" AS czatdatawyslania,\n"
                + "     uzytkownicy.\"imie\" AS uzytkownikimie,\n"
                + "     uzytkownicy.\"nazwisko\" AS uzytkowniknazwisko\n"
                + "FROM\n"
                + "uzytkownicy INNER JOIN czat ON uzytkownicy.iduzytkownika = czat.idnadawcy INNER JOIN uzytkownicy AS uzytkownicy_A ON uzytkownicy_A.iduzytkownika = czat.idodbiorcy\n"
                + "WHERE\n"
                + "czat.idodbiorcy = 1 AND\n"
                + "czat.idnadawcy = 2 OR\n"
                + "czat.idnadawcy = 1 AND\n"
                + "czat.idodbiorcy = 2\n"
                + "ORDER BY\n"
                + "     czat.\"datawyslania\" ASC";
        ResultSet rs = JDBC.result(zapytanie);
        ResultSetMetaData rmd = rs.getMetaData();

        while (rs.next()) {
            lista.add(new Czat(rs.getString("czattresc"), rs.getTimestamp("czatdatawyslania"), rs.getString("uzytkownikimie"), rs.getString("uzytkowniknazwisko")));
        }
        for (Czat c : lista) {
            System.out.println(c.toString());
        }
        return lista;
         }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
        return null;
    }

    public static ArrayList<Uzytkownik> raport5(){
        try{
        ArrayList<Uzytkownik> lista = new ArrayList<Uzytkownik>();
        String zapytanie = "SELECT\n"
                + "\"public\".uzytkownicy.imie,\n"
                + "\"public\".uzytkownicy.nazwisko,\n"
                + "\"public\".uzytkownicy.dataurodzenia,\n"
                + "\"public\".uzytkownicy.miasto,\n"
                + "\"public\".grupy.nazwa\n"
                + "FROM\n"
                + "\"public\".uzytkownicygrup\n"
                + "INNER JOIN \"public\".uzytkownicy ON \"public\".uzytkownicygrup.iduzytkownika = \"public\".uzytkownicy.iduzytkownika\n"
                + "INNER JOIN \"public\".grupy ON \"public\".uzytkownicygrup.idgrupy = \"public\".grupy.idgrupy\n"
                + "WHERE \"public\".grupy.idgrupy=1";
        ResultSet rs = JDBC.result(zapytanie);
        ResultSetMetaData rmd = rs.getMetaData();

        while (rs.next()) {
            lista.add(new Uzytkownik(rs.getString("imie"), rs.getString("nazwisko"), rs.getDate("dataurodzenia"), rs.getString("nazwa")));
        }
        for (Uzytkownik u : lista) {
            System.out.println(u.toString());
        }
        return lista;
         }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
        return null;
    }

    public static ArrayList<Faktura> raport6(){
        try{
        ArrayList<Faktura> lista = new ArrayList<Faktura>();
        String zapytanie = "SELECT\n"
                + "ROW_NUMBER() OVER( ORDER BY produkt.idprodukt ) AS pozycja,\n"
                + "     produkt.nazwa AS nazwaproduktu,\n"
                + "     produkt.cena AS cena,\n"
                + "     produkt.vat AS vat,\n"
                + "     produkt.jm AS jm,\n"
                + "     firma.nazwa AS nazwafirmy,\n"
                + "     firma.adres AS adresfirmy,\n"
                + "     firma.miejscowosc AS miejscowoscfirmy,\n"
                + "     firma.kodpocztowy AS kodpocztowyfirmy,\n"
                + "     firma.nip AS nipfirmy,\n"
                + "     uzytkownik.nazwa AS nazwauzytkownika,\n"
                + "     uzytkownik.adres AS adresuzytkownika,\n"
                + "     uzytkownik.miejscowosc AS miejscowoscuzytkownika,\n"
                + "     uzytkownik.kodpocztowy AS kodpocztowyuzytkownika,\n"
                + "     uzytkownik.nip AS nipuzytkownika,\n"
                + "     produktfaktura.ilosc AS ilosc,\n"
                + "     faktura.idfaktura AS idfaktura,\n"
                + "     faktura.datawystawienia AS datawystawienia,\n"
                + "(SELECT SUM(produkt.cena*produktfaktura.ilosc) FROM produktfaktura INNER JOIN produkt ON produktfaktura.idprodukt = produkt.idprodukt WHERE produktfaktura.idfaktury=idfaktura)\n"
                + "FROM\n"
                + "     produktfaktura \n"
                + "	INNER JOIN produkt ON produktfaktura.idprodukt = produkt.idprodukt\n"
                + "     INNER JOIN faktura ON produktfaktura.idfaktury = faktura.idfaktura\n"
                + "     INNER JOIN firma ON faktura.idfirma = firma.idfirma\n"
                + "     INNER JOIN uzytkownik uzytkownik ON faktura.iduzytkownik = uzytkownik.iduzytkownika\n"
                + "WHERE\n"
                + "     idfaktury = 2";
        ResultSet rs = JDBC.resultf(zapytanie);
        ResultSetMetaData rmd = rs.getMetaData();

        while (rs.next()) {
            lista.add(new Faktura(rs.getLong("pozycja"), rs.getString("nazwaproduktu"), rs.getFloat("cena"), rs.getInt("vat"), rs.getString("jm"), rs.getString("nazwafirmy"), rs.getString("adresfirmy"), rs.getString("miejscowoscfirmy"), rs.getString("kodpocztowyfirmy"), rs.getString("nipfirmy"), rs.getString("nazwauzytkownika"), rs.getString("adresuzytkownika"), rs.getString("miejscowoscuzytkownika"), rs.getString("kodpocztowyuzytkownika"), rs.getString("nipuzytkownika"), rs.getInt("ilosc"), rs.getInt("idfaktura"), rs.getDate("datawystawienia"), rs.getDouble("sum")));
        }
        for (Faktura f : lista) {
            System.out.println(f.toString());
        }
        return lista;
         }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
      //  System.out.println(System.getProperty("user.dir"));
    }
}
