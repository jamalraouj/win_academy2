package Entity;

public class Department {
    private int id;
    private String nom;
    private College college;

    public Department(int id, String nom, College college) {
        this.id = id;
        this.nom = nom;
        this.college = college;
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
