package Entity;

import java.util.ArrayList;

public class Directuer extends User {


ArrayList<Proffeseure> proffeseures = new ArrayList<>();

    public Directuer(String CIN, String nom, String prenom, String telephone, String email, String password, int age,  Role role) {
        super(CIN, nom, prenom, telephone, email, password, age, role);
    }

    public void addProffesseur(Proffeseure proffeseure){
        proffeseures.add(proffeseure);
    }
    public ArrayList<Proffeseure> getProffeseures() {
        return proffeseures;
    }

    public void setProffeseures(ArrayList<Proffeseure> proffeseures) {
        this.proffeseures = proffeseures;
    }
}
