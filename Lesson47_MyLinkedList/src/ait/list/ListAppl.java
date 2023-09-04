package ait.list;

import ait.list.interfaces.IList;
import ait.list.model.MyLinkedList;

public class ListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyLinkedList<>();

        System.out.println("length " + list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        System.out.println("length " + list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(7);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
//        System.out.println(list.get(7));

        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(null));

        System.out.println("===== Test Homework =====");
        System.out.println("length " + list.size());
        System.out.println(list.remove(0));
        System.out.println(list.get(0));
        System.out.println(list.remove(3));
        System.out.println(list.remove(list.size() - 1));
        System.out.println("length " + list.size());

        System.out.println("======= Clear =======");
        System.out.println();
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("length " + list.size());


        System.out.println("\n" + "==== Test set =====");
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(35);
        System.out.println(list.set(0, 12));
        System.out.println(list.get(0));
        System.out.println(list.set(list.size() - 1, 88));
        System.out.println(list.set(2, 45));

        System.out.println("========= Iterator =========");
        for (Integer in : list){
            System.out.println(in);
       }









    }
}