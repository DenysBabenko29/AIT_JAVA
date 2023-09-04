package ait.tarakan;

import ait.tarakan.model.Tarakan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter quantity Tarakans: ");
            int count = Integer.parseInt(br.readLine());
            System.out.println("Enter distance: ");
           Tarakan.setDistance(Integer.parseInt(br.readLine()));

            Thread[] threads = createTarakans(count);
            for (int i = 0; i < threads.length; i++) {
                threads[i].start();
            }
            for (int i = 0; i < count; i++) {
                threads[i].join();
            }
            System.err.println(Tarakan.winner + " победил");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Thread[] createTarakans(int count) {
        Tarakan[] tarakans = new Tarakan[count];
        Thread[] threads = new Thread[count];
        for (int i = 0; i < tarakans.length; i++) {
            tarakans[i] = new Tarakan("Tarakan#" + (i + 1));
            threads[i] = new Thread(tarakans[i]);
        }
        return threads;
    }
}
