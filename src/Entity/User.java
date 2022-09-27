package Entity;

//import javax.management.relation.Role;


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
    private Date date_dinscription;

    public User(String CIN, String nom, String prenom, String telephone, String email, String password, int age, ArrayList<Adresse> adresse, Role role, Date date_dinscription) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.age = age;
        this.adresse = adresse;
        this.role = role;
        this.date_dinscription = date_dinscription;
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

    public void setAdresse(ArrayList<Adresse> adresse) {
        this.adresse = adresse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getDate_dinscription() {
        return date_dinscription;
    }

    public void setDate_dinscription(Date date_dinscription) {
        this.date_dinscription = date_dinscription;
    }
}
