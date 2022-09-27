package Entity;

import java.util.ArrayList;

public class Etudient {
    private int id;
    private ParentDecole parentDecole;
    private User user;
    private ArrayList<Class> classes;

    public Etudient(int id, ParentDecole parentDecole, User user, ArrayList<Class> classes) {
        this.id = id;
        this.parentDecole = parentDecole;
        this.user = user;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParentDecole getParentDecole() {
        return parentDecole;
    }

    public void setParentDecole(ParentDecole parentDecole) {
        this.parentDecole = parentDecole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }
}
