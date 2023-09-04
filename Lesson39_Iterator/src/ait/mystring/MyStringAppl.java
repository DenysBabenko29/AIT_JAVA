package ait.mystring;

import ait.mystring.model.MyString;
import ait.mystring.model.MyStringIterator;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        MyString myString = new MyString("Two beer, or not two beer");
        System.out.println(myString);


        Iterator<Character> iterator = myString.iterator();
        while (iterator.hasNext()) {
            char c = iterator.next();
            if (c == 'e'){
                iterator.remove();
            }
        }
        System.out.println(myString);
/*
        // Wrong way!!

        for (char c : myString) {
            if (c == 'e') {
                myString.removeChar(c);
            }
        }

 */
//


/*
        for (Character c : myString){
            System.out.println(Character.toUpperCase(c));
        }
//
       myString.addChar('!');
        System.out.println(myString);
        myString.removeChar('b');
        System.out.println(myString);

        StringBuilder bilder = myString.getStr();
        for (int i = 0; i < bilder.length(); i++) {
            System.out.println(Character.toUpperCase(bilder.charAt(i)));
        }
        bilder.setLength(3);
        System.out.println(bilder);
        System.out.println(myString);

  */
    }
}
