package Entity;

public class Responsable {
    private int id;
    private Proffeseure proffeseure;
    private Department department;

    public Responsable(int id, Proffeseure proffeseure, Department department) {
        this.id = id;
        this.proffeseure = proffeseure;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proffeseure getProffeseure() {
        return proffeseure;
    }

    public void setProffeseure(Proffeseure proffeseure) {
        this.proffeseure = proffeseure;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
