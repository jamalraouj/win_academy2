package Entity;

public class Salle {
    private  int id;
    private  String matricule;
    private Department department;

    public Salle(int id, String matricule, Department department) {
        this.id = id;
        this.matricule = matricule;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
