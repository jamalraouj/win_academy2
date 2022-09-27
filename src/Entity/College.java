package Entity;

public class College {
    private int id;
    private String nom;
    private Admin admin;

    public College(int id, String nom, Admin admin) {
        this.id = id;
        this.nom = nom;
        this.admin = admin;
    }
    public College( String nom, Admin admin) {
        this.nom = nom;
        this.admin = admin;
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

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
