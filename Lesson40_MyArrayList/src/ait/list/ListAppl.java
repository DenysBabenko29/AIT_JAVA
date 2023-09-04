package ait.list;

import ait.list.interfaces.IList;
import ait.list.model.MyArrayList;

import java.util.Arrays;
import java.util.Collections;

public class ListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(7);
        System.out.println("=============================");
        System.out.println(list.size());
        list.add(2, 223);
        list.add(2, 223);
        list.add(2, 223);
        list.add(2, 223);
        System.out.println(list.remove(3));
        System.out.println("========= for ======");
        for (Integer i : list){
            System.out.print(i + " ");
        }
        list.clear();
        list.add(1);
        System.out.println("======");
        for (Integer i : list){
            System.out.print(i + " ");
        }
        list.
    }
}
