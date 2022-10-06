package Entity;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Salle {
    private static final AtomicInteger _ID = new AtomicInteger(0);

    private int id;
    private  String matricule;
    ArrayList<Proffeseure> proffeseures = new ArrayList<>();

    public Salle( String matricule) {
        this.id = _ID.incrementAndGet();
        this.matricule = matricule;
    }

    public void addProff(Proffeseure proffeseure){
        proffeseures.add(proffeseure);
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

    public ArrayList<Proffeseure> getProffeseures() {
        return proffeseures;
    }

    public void setProffeseures(ArrayList<Proffeseure> proffeseures) {
        this.proffeseures = proffeseures;
    }
}
