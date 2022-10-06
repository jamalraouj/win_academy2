package Controller;

import Entity.College;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerMenu {
    private String[] listOfmenu = new String[]{"Show all students","Show all professors" ,"Insert Student" , "Get profile student" , "Add College"} ;
    private ArrayList<String> prffeseurMenu ;//= new ArrayList<>();
//    prffeseurMenu.
//    {"Show Students" , "Show student By CIN"};
//            new String[]{"Show Students" , "Show student By CIN"};
    private String[] responsableMenu = new String[]{"show department","show sales"};
    public void showMenu(){
        System.out.println("====================  Select an operations  ====================");
        for(int i = 0; i<listOfmenu.length ; i++){
            System.out.println("=====>    "+i +" : "+listOfmenu[i]);

        }
    }
    public int showMenuAdmin(){
        System.out.println("ADMIN====================  Select an operations  ====================");
        Scanner scn = new Scanner(System.in);
        System.out.println("=====>    "+0+" : "+"Show Colleges");
//        System.out.println("=====>    "+1+" : "+"Show One Of Colleges With Dashboard");
        System.out.println("=====>    "+1+" : "+"Add Colleges");
        System.out.println("=====>    "+2+" : "+"Update Colleges");
        System.out.println("=====>    "+3+" : "+"Show Profile");
        return scn.nextInt();
    }
    public void showResponsableMenu(){
        System.out.println("====================  Select an operations  ====================");

        System.out.println("=====>    "+0+" : "+"Show Students");
        System.out.println("=====>    "+1+" : "+"Show student By CIN");
        System.out.println("=====>    "+2+" : "+"Show Students");
        System.out.println("=====>    "+3+" : "+"Show Salles");

    }
    public int showMenuProf(){
        Scanner scn = new Scanner(System.in);
        System.out.println("=====>    "+0+" : "+"Show Your classes");
        System.out.println("=====>    "+1+" : "+"Show student By CIN");
        System.out.println("=====>    "+2+" : "+"Show Students");

        return scn.nextInt();
    }
    public int showMenuDirector(){
        Scanner scn = new Scanner(System.in);
        System.out.println("=====>    "+0+" : "+"Show All Professors");
        System.out.println("=====>    "+1+" : "+"Show All classes");
        System.out.println("=====>    "+2+" : "+"Show All Students");

        return scn.nextInt();
    }

    public int chooseMenu(int  choose){
        Scanner scn = new Scanner(System.in);
        switch (choose){
            case 1:{
                DataCrud dataCrud = new DataCrud();
                System.out.println("Entre Name of College:");
                String name = scn.nextLine();
                College college = new College(name);
                System.out.println("Set director");


            }
        }
return  0;
    }
    public String[] getListOfmenu() {
        return listOfmenu;
    }

    public void setListOfmenu(String[] listOfmenu) {
        this.listOfmenu = listOfmenu;
    }
}
