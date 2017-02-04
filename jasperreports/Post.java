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
public class Post {
    private Integer idposta;
    private String imie;
    private String nazwisko;
    private String tresc;
    private Timestamp dataposta;
    private Integer like;
    private Integer dislike;
    private Integer happy;
    private Integer sad;

    public Post() {
    }

    public Post(Integer idposta, String imie, String nazwisko, String tresc, Timestamp dataposta) {
        this.idposta = idposta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tresc = tresc;
        this.dataposta = dataposta;
    }
    
    public Post( String imie, String nazwisko, String tresc, Timestamp dataposta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tresc = tresc;
        this.dataposta = dataposta;
    }

    public Post(Integer idposta, String imie, String nazwisko, String tresc, Timestamp dataposta, Integer like, Integer dislike, Integer happy, Integer sad) {
        this.idposta = idposta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tresc = tresc;
        this.dataposta = dataposta;
        this.like = like;
        this.dislike = dislike;
        this.happy = happy;
        this.sad = sad;
    }

    public Integer getIdposta() {
        return idposta;
    }

    public void setIdposta(Integer idposta) {
        this.idposta = idposta;
    }

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

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Timestamp getDataposta() {
        return dataposta;
    }

    public void setDataposta(Timestamp dataposta) {
        this.dataposta = dataposta;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getDislike() {
        return dislike;
    }

    public void setDislike(Integer dislike) {
        this.dislike = dislike;
    }

    public Integer getHappy() {
        return happy;
    }

    public void setHappy(Integer happy) {
        this.happy = happy;
    }

    public Integer getSad() {
        return sad;
    }

    public void setSad(Integer sad) {
        this.sad = sad;
    }

    @Override
    public String toString() {
        return "Post{" + "idposta=" + idposta + ", imie=" + imie + ", nazwisko=" + nazwisko + ", tresc=" + tresc + ", dataposta=" + dataposta + ", like=" + like + ", dislike=" + dislike + ", happy=" + happy + ", sad=" + sad + '}';
    }
    
  
}
