package Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Etudient  extends User{

    private ParentDecole parentDecole;
    ArrayList<Note> notes = new ArrayList<>();

    public Etudient(String CIN, String nom, String prenom, String telephone, String email, String password, int age, Role role,  ParentDecole parentDecole) {
        super(CIN, nom, prenom, telephone, email, password, age, role);
        this.parentDecole = parentDecole;
    }
    public Etudient(String CIN, String nom, String prenom, String telephone, String email, String password, int age, Role role) {
        super(CIN, nom, prenom, telephone, email, password, age, role);
    }
    public void addAddress(Adresse adresse){
        this.getAdresse().add(adresse);

    }

    public ParentDecole getParentDecole() {
        return parentDecole;
    }

    public void setParentDecole(ParentDecole parentDecole) {
        this.parentDecole = parentDecole;
    }
    public void addNote(Note note){
        this.notes.add(note);
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Etudient{" +
                "parentDecole=" + parentDecole +
                ", notes=" + notes +
                '}';
    }
}
