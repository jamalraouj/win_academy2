package Controller;

import Entity.*;

import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class DataCrud extends Data{

    public void addCollege(College college){
        getColleges().add(college);
    }



    public Etudient addStudentFromUser(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre student name");
        String nom = scn.nextLine();
        System.out.println("Entre student last name");
        String prenom = scn.nextLine();
        System.out.println("Entre student CIN");
        String CIN = scn.nextLine();
        System.out.println("Entre student Phone");
        String telephone = scn.nextLine();
        System.out.println("Entre student email");
        String email = scn.nextLine();
        System.out.println("Entre student password");
        String password = scn.nextLine();
        System.out.println("Entre student age");
        int age = scn.nextInt();
        Role role = Role.ETUDIENT;
        Etudient etudient = new Etudient(CIN , nom , prenom , telephone , email , password , age , role );
        System.out.println("Do you want to adding a address of student:");
        System.out.println("0 No:");
        System.out.println("1 Yes:");
        int i = scn.nextInt();
        if(i == 1){
            System.out.println("do you want to adding an Address for student");
            System.out.println("Entre Country of student");
            String pays = scn.nextLine() ;
            System.out.println("Entre City of student ");
            String ville = scn.nextLine() ;
            System.out.println("Entre personal Address of student");
            String adresse_personnelle = scn.nextLine() ;

            etudient.addAddress(new Adresse(pays , ville , adresse_personnelle));
        }
        System.out.println("Do you want to adding a parent of student:");
        System.out.println("0 No:");
        System.out.println("1 Yes:");
        i = scn.nextInt();



        if(i ==1){
            System.out.println("Entre parent name");
            String nomp = scn.nextLine();
            System.out.println("Entre parent last name");
            String prenomp = scn.nextLine();
            System.out.println("Entre parent CIN");
            String CINp = scn.nextLine();
            System.out.println("Entre parent Phone");
            String telephonep = scn.nextLine();
            System.out.println("Entre parent email");
            String emailp = scn.nextLine();
            System.out.println("Entre parent password");
            String passwordp = scn.nextLine();
            System.out.println("Entre parent age");
            int agep = scn.nextInt();

            etudient.setParentDecole(new ParentDecole(CINp , nomp , prenomp ,telephonep , emailp , passwordp , agep , Role.PARENT_DECOLE ));
        }
        return  etudient;
    }
    public void updateStudentFromUser(int finalI){
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre number of student for update:");
        int i = scn.nextInt();
        Etudient etudient = getClasses().get(finalI).getEtudents().get(i);
        do{
            System.out.println("========> Update Student :");

            AtomicInteger j = new AtomicInteger();
            System.out.println("----- "+j.getAndIncrement()+"- Nothing");
            System.out.println("      "+j.getAndIncrement()+"- name: "+etudient.getNom());
            System.out.println("      "+j.getAndIncrement()+"- last name: "+etudient.getPrenom());
            System.out.println("      "+j.getAndIncrement()+"- CIN: "+etudient.getCIN());
            System.out.println("      "+j.getAndIncrement()+"- Email: "+etudient.getEmail());
            System.out.println("      "+j.getAndIncrement()+"- Phone: "+etudient.getTelephone());
            System.out.println("      "+j.getAndIncrement()+"- Age: "+etudient.getAge());
            System.out.println("      "+j.getAndIncrement()+"- Country: " +etudient.getAdresse().get(0).getPays());
            System.out.println("      "+j.getAndIncrement()+"- City: " +etudient.getAdresse().get(0).getVille());
            System.out.println("      "+j.getAndIncrement()+"- Address personnel: " +etudient.getAdresse().get(0).getAdresse_personnelle());


            System.out.println("   what do you want to update:");
            i = scn.nextInt();
            switch (i){
                case 1:{
                    System.out.println("name: "+etudient.getNom());
                    String name = scn.nextLine();
                    if (!name.isEmpty()){
                        etudient.setNom(name);
                    }
                }
                case 2:{
                    System.out.println("last name: "+etudient.getPrenom());
                    String lastname = scn.nextLine();
                    if (!lastname.isEmpty()){
                        etudient.setPrenom(lastname);
                    }
                    break;
                }
                case 3:{
                    System.out.println("CIN: "+etudient.getCIN());
                    System.out.println("Cannot update CIN");
                    break;
                }
                case 4:{
                    System.out.println("Email: "+etudient.getEmail());

                    scn.nextLine();
                    String email = scn.nextLine();
                    if (!email.isEmpty()){
                        etudient.setEmail(email);

                    }
                    break;
                }//"- Phone: "+etudient.getTelephone()
                case 5:{
                    System.out.println("Phone: "+etudient.getTelephone());
                    String phone = scn.nextLine();
                    if (!phone.isEmpty()){
                        etudient.setTelephone(phone);
                    }
                    break;
                }
                case 6:{
                    System.out.println("Age: "+etudient.getAge());
                    System.out.println("14 <= age <= 33");
                    int age = scn.nextInt();
                    if (age >=14 && age<=33){
                        etudient.setAge(age);
                    }
                    break;

                }
                case 7:{
                    System.out.println("country: "+etudient.getAdresse().get(0).getPays());
                    String country = scn.nextLine();
                    if (!country.isEmpty()){
                        etudient.getAdresse().get(0).setPays(country);
                    }
                    break;

                }
                case 8:{
                    System.out.println("City: "+etudient.getAdresse().get(0).getVille());
                    String city = scn.nextLine();
                    if (!city.isEmpty()){
                        etudient.getAdresse().get(0).setVille(city);
                    }
                    break;

                }
                case 9:{
                    System.out.println("Address personnel: "+etudient.getAdresse().get(0).getAdresse_personnelle());
                    String address_p = scn.nextLine();
                    if (!address_p.isEmpty()){
                        etudient.getAdresse().get(0).setAdresse_personnelle(address_p);
                    }
                    break;

                }


            }
        }
        while (i !=0 );

    }
    public Note addNoteFromUser(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select number of any subject you want to add note :");
        getMatiers().forEach((matier -> {
            System.out.println("=====> "+matier.getId()+" - "+matier.getNom());
        }));
        int id_matier = scn.nextInt();
        System.out.println("Entre Note:");
        int note = scn.nextInt();
        System.out.println("Entre name or title of Note:");
        String nom = scn.nextLine();
        System.out.println("Entre year:");
        String annee = scn.nextLine();
        System.out.println("Entre sprint:");
        String sprint = scn.nextLine();
        return  new Note(nom , note , annee , sprint , id_matier);
    }

    public void showOneStudentFromUser(int finalI){
        Scanner scn = new Scanner(System.in);
        System.out.println("choose number of student for showing:");
        int i = scn.nextInt();
        Etudient etudient = getClasses().get(finalI).getEtudents().get(i);
        System.out.println("======> "+i+" CIN:"+etudient.getCIN() + " - Name: " +etudient.getNom()+ " - Last name: " +etudient.getPrenom()
                + " - Email: " +etudient.getEmail()+ " - Phone: " +etudient.getTelephone() );
        etudient.getNotes().forEach((note)->{
            System.out.println("==========> Notes  id: "+note.getId()+" note: "+note.getNote()+" name/title: "+note.getNom() +" Year: "+note.getAnnee());
                    getMatiers().forEach((matier)->{
                        if(matier.getId() == note.getFk_matier()){
                            System.out.print("- subject: "+matier.getId()+" - "+matier.getNom());
                        }
                            }
                            );
        });
//        System.out.println(etudient.getNotes());
        System.out.println(" < Parent of Student "+etudient.getParentDecole().getNom()+" - "+etudient.getParentDecole().getPrenom()+" - "+etudient.getParentDecole().getEmail()+etudient.getParentDecole().getCIN()+" >");
        //into Note
        System.out.println("if you want to add Note to this student: ");
        System.out.println("0 No");
        System.out.println("1 Yes");
        i = scn.nextInt();
        if(i ==1){

            etudient.addNote(addNoteFromUser());

        }
        System.out.println("if you want to update Note into this student: ");
        System.out.println("0 No");
        System.out.println("1 Yes");
        i = scn.nextInt();
        if(i == 1){

        }

    }
    public void showAllProff(){
        getProffeseures().forEach((proffeseure -> {
            System.out.println(proffeseure.toString());
        }));
    }


}
