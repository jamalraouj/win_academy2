package Entity;

public class Adresse {
    private int id;
    private String pays;
    private String ville;
    private String adresse_personnelle;

    public Adresse(int id, String pays, String ville, String adresse_personnelle) {
        this.id = id;
        this.pays = pays;
        this.ville = ville;
        this.adresse_personnelle = adresse_personnelle;
    }
    public Adresse( String pays, String ville, String adresse_personnelle) {
        this.pays = pays;
        this.ville = ville;
        this.adresse_personnelle = adresse_personnelle;
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
}
