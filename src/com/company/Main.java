package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList();
//                list.add("Петр",20)
//                new Person("Иван",1),
//                new Person("Петр",20),
//                new Person("Женя",1),
//                new Person("Артем",1),
//                new Person("Петр",20),
//                new Person("Сергей",1),
//                new Person("Петр",20),
//                new Person("Илья",1),
//                new Person("Коля",1)
//        );


        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(list);
        for(int i = 0; i < list.size()-1 ; i++){
            list.remove(i+1);
        }
        System.out.println(list);
    }
}
