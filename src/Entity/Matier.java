package Entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Matier {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private String nom;

    public Matier(String nom) {
        this.id = _ID.incrementAndGet();
        this.nom = nom;
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
}
