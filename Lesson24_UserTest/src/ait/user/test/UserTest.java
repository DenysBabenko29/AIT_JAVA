package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    User user;
    final String email = "Petya@gmail.com";
    final String password = "12345QwE!";

    @BeforeEach
     void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidPasswordLength(){
        String validPassword = "qWr123@";
        user.setPassword(validPassword);
        assertEquals(password, user.getPassword());
    }
    @Test
    void testValidPassword(){
        String validPassword = "qWer123@";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }

    @Test
    void testPasswordLength(){
        String invalidPassword = "123Weu!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }
    @Test
    void testPasswordUpperCase(){
        String upperCase = "123ffdhk%";
        user.setPassword(upperCase);
        assertEquals(password, user.getPassword());
    }
    @Test
    void testPasswordLowerCase(){
        String lowerCase = "123ZIUJD%";
        user.setPassword(lowerCase);
        assertEquals(password, user.getPassword());
    }
    @Test
    void testPasswordDigit(){
        String invalidPassword = "dsffZIUJD%";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }
    @Test
    void testPasswordSpecialSymbol(){
        String invalidPassword = "dsffZIUJD1";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    //  test validEmail


    @Test
    void testEmailCorrect(){
        user.setEmail("Petya23@gmail.com");
        assertEquals("Petya23@gmail.com", user.getEmail());
    }

    @Test
    void testAtMany(){
        user.setEmail("Petya@gma@il.com");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testDotPresence(){
        user.setEmail("Petya@gmailcom");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testDotLast(){
        user.setEmail("Petya.gmail.com.");
        assertEquals(email, user.getEmail());
        user.setEmail("Petya.gmail.co.m");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testCorrectSymbol(){
        user.setEmail("Pet%ya@gmail.com");
        assertEquals(email, user.getEmail());
        user.setEmail("Petya@gma!il.com");
        assertEquals(email, user.getEmail());
    }
}