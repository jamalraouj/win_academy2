import Controller.ControllerMenu;
import Controller.Data;
import Controller.DataCrud;
import Controller.UserController;
import Entity.*;

import java.util.ArrayList;

public class Main {

//    public static void menu(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("====================  Select an operations  ====================");
//        System.out.println("=====> ");
//
//        int i = scanner.nextInt();
//        System.out.println("Your result : "+ this->listOfmenu);
//
//    }

    public static void main(String[] args) {


        ControllerMenu menu = new ControllerMenu();
        UserController userController = new UserController();
        userController.createDefaultData();
//        System.exit(0);
        ArrayList<User> user = userController.auth(userController.login());
         userController.showMenuUser(user);
        System.out.println(user);

        user.forEach((g)->{
            System.out.println(g.getCIN());
        });
        System.out.println(user);
        ArrayList<ParentDecole> parentsDecole = new ArrayList<ParentDecole>() ;// data.createDefaultData();

        parentsDecole.add(new ParentDecole("EE2" , "fdfdg" , "dsfjnsd",
                "+212 65438760", "sidjsc@gmail.com" ,"52625" , 30
                ,Role.PARENT_DECOLE ));

//        Adresse add = new Adresse(1,"sds","sdsd","dgrg");
//        parentsDecole.get(0).addAdress( new Adresse("sdfcs3t(0).getVille());

//        System.out.println(users.get(0).addAdress(add));
//        System.exit(0);
//        users.get(0).getAdresse().forEach(address -> {
//            System.out.println(address.getVille());
//        });
//        for(users : user) {
//            System.out.println(room);
//        }

//        System.out.println(users.get(0).getAdresse().get(0).getId());
//        System.out.println(users.get(0).getAdresse().get(0).getId());

















//        ControllerMenu menu = new ControllerMenu();
//        menu.showMenu();
//        System.out.println(LocalDateTime.now());
//        ArrayList<ParentDecole> parentDecole = new ArrayList<>();
//        parentDecole.add(new ParentDecole(1 , new User("FR3535" ,"amine" , "sami" , "+212 654387605" , "amine352sami@gmail.com" ,"52625" , 30 ,
//                new ArrayList<Adresse>(){{add(new Adresse(1,"MAR","bani malal" ,"Street 12 - dar 34" ));} } )));
//
//        ArrayList<Admin> admin = new ArrayList<>();
//        admin.add(new Admin(1 , new User("EE1111" ,"youssef" , "raouj" , "+212 648876695" , "youssef47@gmail.com" ,"1234" , 23 , new ArrayList<Adresse>(){{add(new Adresse(2,"MAR","bani malal" ,"Street 12 - dar 45" ));} } )));
//
//        System.out.println(admin.get(0).getUser().getCIN());
//        admin.stream();

//        ArrayList<Integer> a = new ArrayList<Integer>();




//        ArrayList<Etudient> students = new ArrayList<>();
//
//        students.add(new Etudient(1 , new User("EE1111" ,"youssef" , "raouj" , "+212 648876695" , "youssef47@gmail.com" ,"1234" ,
//                23 , new ArrayList<Adresse>(){{add(new Adresse(1,"USA","bani malal" ,"Street 12 - dar 34" ));} } ,))); //  id, String pays, String ville, String adresse_personnelle) {      //    ArrayList<Adresse> adresse
//        ArrayList<Integer> a = new ArrayList<Integer>();




    }


}
