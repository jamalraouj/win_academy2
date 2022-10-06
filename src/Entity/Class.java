package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Class {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private  int id ;
    private String nom;
    private String annee;
    private ArrayList<Etudient> etudents = new ArrayList<>();


    public Class( String nom, String annee) {
        this.id = _ID.incrementAndGet();
        this.nom = nom;
        this.annee = annee;
    }

    public void addEtudient(Etudient etudient){
        etudents.add(etudient);
    }
    public ArrayList<Etudient> getEtudents() {
        return etudents;
    }

    public void setEtudents(ArrayList<Etudient> etudents) {
        this.etudents = etudents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nom='" + nom + '\'' +
                ", annee='" + annee + '\'' +
                ", etudents=" + etudents +
                '}';
    }
}
