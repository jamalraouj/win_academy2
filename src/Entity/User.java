package Entity;

//import javax.management.relation.Role;


import java.time.LocalDateTime;
import java.util.*;

public class User {
    private String CIN ;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String password;
    private int age;
    private ArrayList<Adresse> adresse;
    private Role role;
    private LocalDateTime date_dinscription ;

    public User(String CIN, String nom, String prenom, String telephone, String email, String password, int age, Role role) {
        this.adresse = new ArrayList<>();
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.age = age;
        this.role = role;
        this.date_dinscription = LocalDateTime.now();
    }


    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void addAdress(Adresse adresse){

         this.adresse.add(adresse);


    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Adresse> getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse.add(adresse);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getDate_dinscription() {
        return date_dinscription;
    }

    public void setDate_dinscription(LocalDateTime date_dinscription) {
        this.date_dinscription = date_dinscription;
    }

    @Override
    public String toString() {
        return "User{" +
                "CIN='" + CIN + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", adresse=" + adresse +
                ", role=" + role +
                ", date_dinscription=" + date_dinscription +
                '}';
    }
}
