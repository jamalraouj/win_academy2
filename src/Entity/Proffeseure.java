package Entity;

import java.util.ArrayList;
import java.util.Set;


public class Proffeseure {
    private int id;
    private User user;
    private Directuer directuer;
    private Salle salle;
    private Matier matier;
    private ArrayList<Class> classes;

    public Proffeseure(int id, User user, Directuer directuer, Salle salle, Matier matier, ArrayList<Class> classes) {
        this.id = id;
        this.user = user;
        this.directuer = directuer;
        this.salle = salle;
        this.matier = matier;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Directuer getDirectuer() {
        return directuer;
    }

    public void setDirectuer(Directuer directuer) {
        this.directuer = directuer;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Matier getMatier() {
        return matier;
    }

    public void setMatier(Matier matier) {
        this.matier = matier;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }
}
