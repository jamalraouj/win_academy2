package Entity;

import java.util.ArrayList;
import java.util.Set;


public class Proffeseure extends  User{



    private int id_matier;
    private ArrayList<Class> classes;

    public Proffeseure(String CIN, String nom, String prenom, String telephone, String email, String password, int age,  Role role, int matier) {
        super(CIN, nom, prenom, telephone, email, password, age, role);
        this.id_matier = matier;
        classes = new ArrayList<>();
    }


    public int getMatier() {
        return id_matier;
    }

    public void setMatier(int matier) {
        this.id_matier = matier;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }
    public void addClass(Class classe){
        this.classes.add(classe);

    }
}
