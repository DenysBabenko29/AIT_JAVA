package ait.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareAppl {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream(args[0]); FileInputStream fin2 = new FileInputStream(args[0]);) {
            if (args[0].length() != args[1].length()){
                System.err.println("Файлы не равны");
                return;
            }
            int a = fin.read();
            int b = fin2.read();
            while (a != -1 && b != -1){
                if (a != b){
                    System.err.println("Файлы не равны");
                    return;
                }
                a = fin.read();
                b = fin2.read();
            }
            System.out.println("Файлы равны");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
