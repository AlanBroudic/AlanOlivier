/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author alan
 */
public class Course 
{
    String nom, lieu;
    Date date;
    Time heureDepart;
    Float distance;
    int prix, challenge;
    
    public Course(String pNom, String pLieu, Date pDate, Time pHeureDepart, Float pDistance, int pPrix, int pChallenge)
    {
        nom = pNom;
        lieu = pLieu;
        date = pDate;
        heureDepart = pHeureDepart;
        distance = pDistance;
        prix = pPrix;
        challenge = pChallenge;
    }

    public Course() 
    {
        
    }

    public String getNom() {
        return nom;
    }

    public String getLieu() {
        return lieu;
    }

    public Date getDate() {
        return date;
    }

    public Time getHeureDepart() {
        return heureDepart;
    }

    public Float getDistance() {
        return distance;
    }

    public int getPrix() {
        return prix;
    }

    public int getChallenge() {
        return challenge;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setChallenge(int challenge) {
        this.challenge = challenge;
    }
}
