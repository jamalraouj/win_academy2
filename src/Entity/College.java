package Entity;

import com.sun.deploy.security.SessionCertStore;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class College {
    private static final AtomicInteger _ID = new AtomicInteger(0);

    private int id  ;
    private String nom;

    private Directuer directuer;
    private ArrayList<Department> departments = new ArrayList<>();

    public College( String nom ) {
        this.id = _ID.incrementAndGet();
        this.nom = nom;

    }
    public College( ) {
    }
    public  void  addDepartement(Department department){
            this.departments.add(department);
    }
    public Directuer getDirectuer() {
        return directuer;
    }

    public void setDirectuer(Directuer directuer) {
        this.directuer = directuer;
    }

    public void addDepartment(Department department){
        departments.add(department);
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

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
