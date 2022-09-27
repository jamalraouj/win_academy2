package Entity;

import java.util.Date;
import java.util.Set;

public class Class {
    private int id;
    private String nom;
    private Date annee;
    private Set<Proffeseure> proffeseures;

    public Class(int id, String nom, Date annee, Set<Proffeseure> proffeseures) {
        this.id = id;
        this.nom = nom;
        this.annee = annee;
        this.proffeseures = proffeseures;
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

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public Set<Proffeseure> getProffeseures() {
        return proffeseures;
    }

    public void setProffeseures(Set<Proffeseure> proffeseures) {
        this.proffeseures = proffeseures;
    }
}
