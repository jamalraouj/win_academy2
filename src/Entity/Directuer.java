package Entity;

public class Directuer {
    private int id;
    private User user;
    private College college;

    public Directuer(int id, User user, College college) {
        this.id = id;
        this.user = user;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
