package Entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Note {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private  String nom;
    private int note;
    private String annee;
    private String sprint;
    private int fk_matier;

    public Note(String nom, int note, String annee, String sprint, int fk_matier) {
        this.nom = nom;
        this.note = note;
        this.annee = annee;
        this.sprint = sprint;
        this.fk_matier = fk_matier;
        this.id = _ID.incrementAndGet();
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

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public int getFk_matier() {
        return fk_matier;
    }

    public void setFk_matier(int fk_matier) {
        this.fk_matier = fk_matier;
    }

}
