package Controller;

import Entity.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class UserController extends  DataCrud {


    public String[] login() {
        System.out.println("====================  Login  ====================");
        System.out.println("===========> Entre your email :");
        Scanner scn = new Scanner(System.in);
        String email = scn.nextLine();
        System.out.println("===========> Entre your Password : ");
        String password = scn.nextLine();
        return new String[]{email, password};
    }

    public ArrayList<User> auth(String[] data) {
//        boolean  bool = false;
        ArrayList<User> arr = new ArrayList<>();

        User user;
        Role role = null;
        getDirectuers().forEach((directuer) -> {
            if (directuer.getEmail().equals(data[0]) && directuer.getPassword().equals(data[1])) {

                arr.add(directuer);

            }

        });
        getAdmin().forEach((admin) -> {

            if (admin.getEmail().equals(data[0]) && admin.getPassword().equals(data[1])) {
                arr.add(admin);
            }

        });
        getResponsables().forEach((responsable) -> {
            if (responsable.getProffeseure().getEmail().equals(data[0]) && responsable.getProffeseure().getPassword().equals(data[1])) {
                arr.add(responsable.getProffeseure());
            }

        });
        getProffeseures().forEach((proffeseure) -> {
//            System.out.println(data[0]);
//            System.out.println(directuer.getPassword());
            if (proffeseure.getEmail().equals(data[0]) && proffeseure.getPassword().equals(data[1])) {
                arr.add(proffeseure);

            }

        });
        getStudents().forEach((student) -> {
//            System.out.println(data[0]);
//            System.out.println(directuer.getPassword());
            if (student.getEmail().equals(data[0]) && student.getPassword().equals(data[1])) {
                arr.add(student);

            }

        });
        getParentsDecole().forEach((parent) -> {
//            System.out.println(data[0]);
//            System.out.println(directuer.getPassword());
            if (parent.getEmail().equals(data[0]) && parent.getPassword().equals(data[1])) {
                arr.add(parent);

            }

        });

        return arr;
    }

    public void showMenuUser(ArrayList<User> users) {

        ControllerMenu controllerMenu = new ControllerMenu();
        switch (users.get(0).getRole()) {
            case ADMIN: {
                int i;
                Scanner scn = new Scanner(System.in);

                AtomicReference<Admin> this_admin = new AtomicReference<>();
                getAdmin().forEach((admin) -> {
                    if(users.get(0).getCIN().equals(admin.getCIN())){
                        this_admin.set(admin);
                    }
                });
                switch (controllerMenu.showMenuAdmin()){
                    case 0:{
                        this_admin.get().getColleges().forEach((college -> {
                            System.out.println("====> ID: "+this_admin.get().getColleges().indexOf(college)+"- NAME: "+college.getNom());
                            System.out.println("      FULL NAME OF DIRECTOR: "+college.getDirectuer().getNom()+" "+college.getDirectuer().getPrenom()+"- PHONE: "+college.getDirectuer().getTelephone());
                        }));
                        System.out.println("IF YOU WANT TO SHOW ONE COLLEGE WITH ANALYSIS");
                        System.out.println("0 NO");
                        System.out.println("1 YES");
                        i = scn.nextInt();
                        if(i==1){
                            System.out.println("ENTRE A NUMBER OF COLLEGES");
                            i = scn.nextInt();
                            College college = this_admin.get().getColleges().get(i);
                            System.out.println("- NAME: "+college.getNom());
                            System.out.println("      FULL NAME OF DIRECTOR: "+college.getDirectuer().getNom()+" "+college.getDirectuer().getPrenom()+"- PHONE: "+college.getDirectuer().getTelephone());
                            System.out.println("NUMBER OF DEPARTMENTS: "+college.getDepartments().size());
                            college.getDepartments().forEach((department -> {
                                System.out.println("THIS DEPARTMENT<"+department.getNom()+"> HAS A NUMBER OF SALES: "+department.getSalles().size());
                            }));
                            AtomicInteger sizeOfStudents = new AtomicInteger();
                            college.getDepartments().forEach((department -> {
                                department.getSalles().forEach((salle)->{
                                    salle.getProffeseures().forEach((prof)->{
                                        prof.getClasses().forEach((classe)->{
                                            sizeOfStudents.addAndGet(classe.getEtudents().size());
                                        });
                                    });
                                });
                            }));
                            System.out.println("TOTAL OF STUDENTS IN THIS COLLEGE: "+sizeOfStudents);


                        }
                        break;
                    }
                    case 1:{
                        System.out.println("---ADD COLLEGE");
                        System.out.println("ENTRE NAME OF COLLEGE");
                        String name =scn.nextLine();
                        this_admin.get().addCollege(new College(name));
                        System.out.println("DO YOU WANT TO ADD DIRECTOR: ");
                        System.out.println("0 NO");
                        System.out.println("1 YES");
                        i = scn.nextInt();
                        if(i == 1){
                            System.out.println("ENTRE NUMBER OF DIRECTOR");
                            i = scn.nextInt();

                        }

                    }

                }

                break;
            }
            case PROFFESEURE:
            case RESPONSABLE:{


                AtomicReference<Proffeseure> this_proffeseure = new AtomicReference<>();
                getProffeseures().forEach((proffeseure) -> {
                    if(users.get(0).getCIN().equals(proffeseure.getCIN())){
                        this_proffeseure.set(proffeseure);
                    }
                });
                AtomicReference<Responsable> this_responsable = new AtomicReference<>(new Responsable());
                getResponsables().forEach((responsable) -> {
                    if(users.get(0).getCIN().equals(responsable.getProffeseure().getCIN())){
                        this_responsable.set(responsable);
                    }
                });
                switch (controllerMenu.showMenuProf()) {

                    case 0: {
                        System.out.println("======> Entre a number of classes for show students class");
                        this_proffeseure.get().getClasses().forEach((classe)->{
                            System.out.println("======> "+getClasses().indexOf(classe)+"  " +classe.getNom()+" "+classe.getAnnee());

                        });
                        Scanner scn = new Scanner(System.in);

                        int i = scn.nextInt();
                        int finalI = i;
                        getClasses().get(i).getEtudents().forEach((student)->{
                            System.out.println("======> "+getClasses().get(finalI).getEtudents().indexOf(student)+"  CIN:"+student.getCIN() + " - Name: " +student.getNom()+ " - Last name: " +student.getPrenom()
                                    + " - Email: " +student.getEmail()+ " - Phone: " +student.getTelephone() + " < Parent of Student "+student.getParentDecole().getNom()+" - "+student.getParentDecole().getPrenom()+" - "+student.getParentDecole().getEmail()+" >");

                        });
                        System.out.println("0 for show one of students:");
                        System.out.println("1 Add student into this class:");
                        System.out.println("2 update student from this class:");
                        i = scn.nextInt();
                        if(i == 0){
                            // method for show one of student and add note
                            this.showOneStudentFromUser(finalI);

                        }
                        else if(i == 1){
                            getClasses().get(finalI).addEtudient(addStudentFromUser());
                        }
                        else if(i ==2){
                            updateStudentFromUser(finalI);
                        }


                    }
                }


                break;
            }
            case DIRECTUER: {
                int i;
                Scanner scn = new Scanner(System.in);
                AtomicReference<Directuer> this_directuer = new AtomicReference<>();
                getDirectuers().forEach((directuer) -> {
                    if(users.get(0).getCIN().equals(directuer.getCIN())){
                        this_directuer.set(directuer);
                    }
                });
                switch(controllerMenu.showMenuDirector()){
                    case 0:{
                        this_directuer.get().getProffeseures().forEach((proffeseure -> {
                            System.out.println(proffeseure.toString());
                        }));

                    }
                    case 1:{
                        this_directuer.get().getProffeseures().forEach(proffeseure -> {
                            System.out.println(proffeseure.getClasses().toString());
                        });

                    }
                    case 2:{
                        this_directuer.get().getProffeseures().forEach(proffeseure -> {
                            proffeseure.getClasses().forEach((classe->{
                                System.out.print("====> : "+getClasses().indexOf(classe)+"  ");System.out.println( classe.getEtudents().toString());
                            }));

                        });
                        System.out.println("Do you want to add student into class");
                        System.out.println("0 NO");
                        System.out.println("1 YES");
                        i =scn.nextInt();
                        if(i == 1){
                            System.out.println("Select number of classes do you want to add student:");
                            i =scn.nextInt();
                            getClasses().get(i).addEtudient(addStudentFromUser());

                        }


                    }
                }

                break;
            }
            case PARENT_DECOLE: {
                int i;
                Scanner scn = new Scanner(System.in);
                AtomicReference<ParentDecole> this_parent = new AtomicReference<>();
                getParentsDecole().forEach((parentDecole) -> {
                    if(users.get(0).getCIN().equals(parentDecole.getCIN())){
                        this_parent.set(parentDecole);
                    }
                });
                System.out.println("Show her Son with notes");
                getStudents().forEach((student->{
                    if(student.getParentDecole().getCIN() == this_parent.get().getCIN()){
                        System.out.println(student.toString());
                        student.getNotes().forEach((note-> {
                            System.out.println(note.toString());
                        }));
                    }

                }));
                System.out.println("entre 0 for return");
                if(scn.nextInt()==0){

                }
                break;
            }
        }
        showMenuUser(users);
}


        }

