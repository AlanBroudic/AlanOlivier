/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail;

import java.sql.Time;

/**
 *
 * @author Olivier
 */
public class Courir {
    private Course laCourse;
    private Coureur leCoureurNom;
    private Coureur leCoureurPrenom;
    private int place;
    private Time temps;
    
    public Courir(Course pLaCourse, Coureur pCoureurNom, Coureur pCoureurPrenom, int pPlace, Time pTemps)
    {
        laCourse = pLaCourse;
        leCoureurNom = pCoureurNom;
        leCoureurPrenom = pCoureurPrenom;
        place = pPlace;
        temps = pTemps;
    }
    public Courir(){
        
    }

    public Course getLaCourse() {
        return laCourse;
    }

    public Coureur getLeCoureurNom() {
        return leCoureurNom;
    }

    public Coureur getLeCoureurPrenom() {
        return leCoureurPrenom;
    }

    public int getPlace() {
        return place;
    }

    public Time getTemps() {
        return temps;
    }

    public void setLaCourse(Course laCourse) {
        this.laCourse = laCourse;
    }

    public void setLeCoureurNom(Coureur leCoureurNom) {
        this.leCoureurNom = leCoureurNom;
    }

    public void setLeCoureurPrenom(Coureur leCoureurPrenom) {
        this.leCoureurPrenom = leCoureurPrenom;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setTemps(Time temps) {
        this.temps = temps;
    }
    
    
}
