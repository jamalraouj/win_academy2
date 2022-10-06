import Controller.ControllerMenu;
import Controller.UserController;
import Entity.User;

import java.util.ArrayList;

public class Run {

    public void main(){
        ControllerMenu menu = new ControllerMenu();
        UserController userController = new UserController();
        userController.createDefaultData();
        ArrayList<User> user = userController.auth(userController.login());
        userController.showMenuUser(user);

//        System.out.println(user);
//        user.forEach((g)->{
//            System.out.println(g.getCIN());
//
//        });
    }

}
