package Entity;

import java.util.ArrayList;

public class Admin extends  User {
    private ArrayList<College> colleges;

    public Admin(String CIN, String nom, String prenom, String telephone, String email, String password, int age,  Role role) {
        super(CIN, nom, prenom, telephone, email, password, age, role);
        colleges = new ArrayList<>();
    }

    public ArrayList<College> getColleges() {
        return colleges;
    }

    public void addCollege(College college) {
        this.colleges.add(college);
    }
    public void setColleges(ArrayList<College> colleges) {
        this.colleges = colleges;
    }
}