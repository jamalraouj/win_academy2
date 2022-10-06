package Entity;

public class Responsable {
    private static int id;
    private Proffeseure proffeseure;


    public Responsable( Proffeseure proffeseure) {
        this.id++;
        proffeseure.setRole(Role.RESPONSABLE);
        this.proffeseure = proffeseure;
    }
    public Responsable() {
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


}
