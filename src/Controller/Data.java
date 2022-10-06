package Controller;

import Entity.*;
import Entity.Class;


import java.util.ArrayList;
import java.util.Random;

public class Data {

    private ArrayList<ParentDecole> parentsDecole = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<College> colleges = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Etudient> students = new ArrayList<>();
    private ArrayList<Adresse> adresses = new ArrayList<>();
    private  ArrayList<Proffeseure> proffeseures = new ArrayList<>();
    private ArrayList<Responsable> responsables = new ArrayList<>();
    private ArrayList<Directuer> directuers = new ArrayList<>();
    private ArrayList<Note> notes = new ArrayList<>();
    private ArrayList<Class> classes =new ArrayList<>();
    ArrayList<Matier>  matiers = new ArrayList<>();
    private ArrayList<Salle> salles = new ArrayList<>();
//    private ArrayList<Admin> admin = new ArrayList<>();




    public void createDefaultData(){
        Random rand = new Random();

         String[] names =  {"Aaran", "Aaren", "Aarez", "Aarman", "Aaron", "Aaron-James", "Aarron", "Aaryan", "Aaryn", "Aayan", "Aazaan", "Abaan", "Abbas", "Abdallah", "Abdalroof", "Abdihakim", "Abdirahman", "Abdisalam", "Abdul", "Abdul-Aziz", "Abdulbasir", "Abdulkadir", "Abdulkarem", "Abdulkhader", "Abdullah", "Abdul-Majeed", "Abdulmalik", "Abdul-Rehman", "Abdur", "Abdurraheem", "Abdur-Rahman", "Abdur-Rehmaan", "Abel", "Abhinav", "Abhisumant", "Abid", "Abir", "Abraham", "Abu", "Abubakar", "Ace", "Adain", "Adam", "Adam-James", "Addison", "Addisson", "Adegbola", "Adegbolahan", "Aden", "Adenn", "Adie", "Adil", "Aditya", "Adnan", "Adrian", "Adrien", "Aedan", "Aedin", "Aedyn", "Aeron", "Afonso", "Ahmad", "Ahmed", "Ahmed-Aziz", "Ahoua", "Ahtasham", "Aiadan", "Aidan", "Aiden", "Aiden-Jack", "Aiden-Vee", "Aidian", "Aidy", "Ailin", "Aiman", "Ainsley", "Ainslie", "Airen", "Airidas", "Airlie", "AJ", "Ajay", "A-Jay", "Ajayraj", "Akan", "Akram", "Al", "Ala", "Alan", "Alanas", "Alasdair", "Alastair", "Alber", "Albert", "Albie", "Aldred", "Alec", "Aled", "Aleem", "Aleksandar", "Aleksander", "Aleksandr", "Aleksandrs", "Alekzander", "Alessandro", "Alessio", "Alex", "Alexander", "Alexei", "Alexx", "Alexzander", "Alf", "Alfee", "Alfie", "Alfred", "Alfy", "Alhaji", "Al-Hassan", "Ali", "Aliekber", "Alieu", "Alihaider", "Alisdair", "Alishan", "Alistair", "Alistar", "Alister"};
        String[] cities = {"Afourar","Agadir","Settat","Oulad Sidi Ben Daoud","El Borouj","Bouznika","Boulanouare","Boujniba","Agadir","Settat","Oulad Sidi Ben Daoud"};

        admins.add(new Admin("EE223" , "jamal" , "raouj",
                "+212 654383225" , "jamal22@gmail.com" ,"1234" , 33
                ,Role.ADMIN ));
        for (int i = 0 ; i<10; i++){
            int n = rand.nextInt(900 - 100)+100;
            int age = rand.nextInt(85 - 32)+32;
            admins.add(new Admin("EE2"+n , names[i] , names[i+5],
                    "+212 65438"+n+""+n , names[i]+n+"@gmail.com" ,"52625" , age
                    ,Role.ADMIN ));

        }


        for (int i = 0 ; i<10; i++){
            int n = rand.nextInt(900 - 100)+100;
            int age = rand.nextInt(85 - 32)+32;
            parentsDecole.add(new ParentDecole("EE2"+n , names[i] , names[i+5],
                    "+212 65438"+n+""+n , names[i]+n+"@gmail.com" ,"12345" , age
                    ,Role.PARENT_DECOLE ));
                    parentsDecole.get(i).addAdress( new Adresse("morocco",cities[i],"Street "+i+ "- dar "+i));

        }
        colleges.add(new College("safi college" ));
        colleges.add(new College("casa college" ));
        colleges.add(new College("kech college" ));

        departments.add(new Department("JS"));
        departments.add(new Department("C#"));
        departments.add(new Department("java"));
        colleges.get(0).addDepartement(departments.get(0));
        colleges.get(0).addDepartement(departments.get(1));
        matiers.add(new Matier("Java"));
        matiers.add(new Matier("JS"));
        matiers.add(new Matier("C#"));
        students.add(new Etudient("RS3434" ,"Jamal" ,"raouj" ,"0647386584" ,
                "jamal35@gmail.com","1234",23,Role.ETUDIENT ,parentsDecole.get(0) ));
                students.get(0).addAddress(new Adresse("Marocc", "Asfi" , "Street 10 - dar 33"));
                students.get(0).addNote(new Note("first" , 17 , "2022" , "sprint 2" ,getMatiers().get(0).getId()));
                students.get(0).addNote(new Note("second" , 16 , "2022" , "sprint 2" ,getMatiers().get(0).getId()));
        students.get(0).getNotes().forEach((note)->{
            System.out.println(note.getId());
        });
        students.add(new Etudient("RS5262" ,"yassine" ,"raouj" ,"0648486584" ,
                "yassine925@gmail.com","1234",23,Role.ETUDIENT ,parentsDecole.get(0) ));
        students.add(new Etudient("RW2435" ,"Abde" ,"Boukri" ,"0648736584" ,
                "abde385@gmail.com","1234",23,Role.ETUDIENT ,parentsDecole.get(1) ));
        students.add(new Etudient("UJ6772" ,"sabir" ,"sabir" ,"0647386584" ,
                "sabir8347@gmail.com","1234",23,Role.ETUDIENT ,parentsDecole.get(1) ));
        classes.add(new Class("Namik" , "2020-03-02"));
        classes.add(new Class("JEE" , "2020-10-02"));
        classes.add(new Class("JS" , "2020-10-03"));
        classes.add(new Class("DATA" , "2020-10-09"));
        classes.get(0).addEtudient(students.get(0));
        classes.get(0).addEtudient(students.get(1));
        classes.get(0).addEtudient(students.get(2));
        classes.get(1).addEtudient(students.get(3));

        directuers.add(new Directuer("HG4253" ,"mohammed" ,"agha" ,"0647387629" ,
                "mohammed7348@gmail.com","1234",39,Role.DIRECTUER ));
        directuers.add(new Directuer("GH5237" ,"jamal" ,"anim" ,"0647927629" ,
                "jamal@gmail.com","1234",43,Role.DIRECTUER ));
        colleges.get(0).setDirectuer(directuers.get(0));
        colleges.get(1).setDirectuer(directuers.get(1));

        proffeseures.add(new Proffeseure("KD4253" ,"anas" ,"anas" ,"0647927872" ,
                "anas23@gmail.com","1234",29,Role.PROFFESEURE ,0));
                    proffeseures.get(0).addClass(classes.get(0));
        proffeseures.add(new Proffeseure("KJ6247" ,"kamal" ,"anas" ,"0647927872" ,
                "kamal78@gmail.com","1234",29,Role.PROFFESEURE ,1));

        proffeseures.add(new Proffeseure("KD726" ,"jalil" ,"anas" ,"0647927872" ,
                "jalil78@gmail.com","1234",29,Role.PROFFESEURE ,1));
        proffeseures.get(0).setMatier(0);
        proffeseures.get(0).addClass(classes.get(0));
        proffeseures.get(1).setMatier(1);
        proffeseures.get(2).setMatier(2);
        salles.add(new Salle("ES43523"));
        salles.add(new Salle("HG7348"));
        salles.add(new Salle("KL6482"));
        salles.get(0).addProff(proffeseures.get(0));
        salles.get(1).addProff(proffeseures.get(1));
        salles.get(0).addProff(proffeseures.get(2));
        departments.get(0).addSalle(salles.get(0));
        departments.get(0).addSalle(salles.get(1));

        responsables.add(new Responsable(proffeseures.get(0)));
        responsables.add(new Responsable(proffeseures.get(1)));
//        responsables.add(new Responsable(i,"morocco",cities[i],"Street "+i+ "- dar "+i))
//        salles.add(new Salle("ES43523"));

        admins.get(1).addCollege(colleges.get(1));
        admins.get(0).addCollege(colleges.get(0));
        admins.get(2).addCollege(colleges.get(2));




    }

    public ArrayList<ParentDecole> getParentsDecole() {
        return parentsDecole;
    }

    public void setParentsDecole(ArrayList<ParentDecole> parentsDecole) {
        this.parentsDecole = parentsDecole;
    }

    public ArrayList<Admin> getAdmin() {
        return admins;
    }

    public void setAdmin(ArrayList<Admin> admin) {
        this.admins = admin;
    }

    public ArrayList<College> getColleges() {
        return colleges;
    }

    public void setColleges(ArrayList<College> colleges) {
        this.colleges = colleges;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public ArrayList<Etudient> getStudents() {
        return students;
    }
    public void addStudent(Etudient etudient){
        this.students.add(etudient);

    }

    public void setStudents(ArrayList<Etudient> students) {
        this.students = students;
    }

    public ArrayList<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<Adresse> adresses) {
        this.adresses = adresses;
    }

    public ArrayList<Proffeseure> getProffeseures() {
        return proffeseures;
    }

    public void setProffeseures(ArrayList<Proffeseure> proffeseures) {
        this.proffeseures = proffeseures;
    }

    public ArrayList<Responsable> getResponsables() {
        return responsables;
    }

    public void setResponsables(ArrayList<Responsable> responsables) {
        this.responsables = responsables;
    }

    public ArrayList<Directuer> getDirectuers() {
        return directuers;
    }

    public void setDirectuers(ArrayList<Directuer> directuers) {
        this.directuers = directuers;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public ArrayList<Matier> getMatiers() {
        return matiers;
    }

    public void setMatiers(ArrayList<Matier> matiers) {
        this.matiers = matiers;
    }

    public ArrayList<Salle> getSalles() {
        return salles;
    }

    public void setSalles(ArrayList<Salle> salles) {
        this.salles = salles;
    }
}
