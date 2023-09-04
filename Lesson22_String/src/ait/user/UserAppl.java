package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user1 = new User("Petya@gmail.c.om", "12345");
        System.out.println(user1);
        user1.setEmail("Pety@a@gmail.c.om");
        System.out.println(user1);
        System.out.println("======================");
        user1.setPassword("12arRT%jjir");
        System.out.println(user1);
        user1.setPassword("hfjIj&&dksalOP");
        user1.setPassword("dfdj78NMIiio");
        user1.setPassword("67asdHJK_&%");
    }
}
