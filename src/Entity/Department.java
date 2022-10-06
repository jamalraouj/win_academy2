package Entity;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Department {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private  int id ;
    private String nom;
    private College college;
    private Responsable responsable;
    private ArrayList<Salle> salles = new ArrayList<>();


    public Department( String nom) {
        this.id = _ID.incrementAndGet();
        this.nom = nom;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public void addSalle(Salle salle){
        salles.add(salle);
    }

    public ArrayList<Salle> getSalles() {
        return salles;
    }

    public void setSalles(ArrayList<Salle> salles) {
        this.salles = salles;
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

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
