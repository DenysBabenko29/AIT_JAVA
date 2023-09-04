package ait.user.model;

import java.util.Objects;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " - Email isn't valid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println(password + " password isn't valid");
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
    public boolean validateEmail(String email) {
        int indexEt = email.indexOf('@');
        if (indexEt == -1 || email.indexOf('@', indexEt + 1) >= 0) {
            // или indexEt != email.lastIndexOf('@')
            return false;
        }
        if (email.indexOf('.', indexEt) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            // еслт число будет больше чем lenght - 2 то фальш
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' ||
                    c == '_' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public boolean validatePassword(String password){
        if (password.length() < 8){
            return false;
        }
        int upperCase = 0, lowerCase = 0, digit = 0, specSymb = 0;
        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if (x >= 'a' && x <= 'z'){
                lowerCase++;
            } else if (x >= 'A' && x <= 'Z') {
                upperCase++;
            } else if (x >= '0' && x <= '9') {
                digit++;
            } else if (x == '!' || x == '%' || x == '@' || x == '*' || x == '&') {
                specSymb++;
            } else {
                return false;
            }
        }
        if (upperCase == 0 || lowerCase == 0 || digit == 0 || specSymb == 0){
            return false;
        }
        return true;
    }

}
