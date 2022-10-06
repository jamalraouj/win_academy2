package Entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Adresse {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private  int id ;
    private String pays;
    private String ville;
    private String adresse_personnelle;



    public Adresse( String pays, String ville, String adresse_personnelle) {
        this.pays = pays;
        this.ville = ville;
        this.adresse_personnelle = adresse_personnelle;
        this.id = _ID.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse_personnelle() {
        return adresse_personnelle;
    }

    public void setAdresse_personnelle(String adresse_personnelle) {
        this.adresse_personnelle = adresse_personnelle;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "pays='" + pays + '\'' +
                ", ville='" + ville + '\'' +
                ", adresse_personnelle='" + adresse_personnelle + '\'' +
                '}';
    }
}
