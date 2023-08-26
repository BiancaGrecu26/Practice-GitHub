//package java_week_4;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class ListDemo {
//    public static void main(String[] args) {
//
//        // create new list
//        List<String> firstNames = new ArrayList<>();
//
//        // check the list size
//        System.out.println("The size of list is: " + firstNames.size());// --> 0
//        System.out.println("The list is empty? " + firstNames.isEmpty());// --> true
//
//        //add elements to list
//        firstNames.add("Diana");
//        firstNames.add("Cornel");
//        firstNames.add("Gigel");
//        firstNames.add("Dorel");
//        System.out.println("The size of list is: " + firstNames.size());//-->4
//        System.out.println("The list is empty? " + firstNames.isEmpty());//--> false
//
//        //add/ allows duplicates to list
//        firstNames.add("Diana");
//        System.out.println(firstNames);
//        System.out.println("The size of list is: " + firstNames.size());//-->5
//
//        //remove one person
//        firstNames.remove("Diana");
//        System.out.println("The list after remove Diana, is: " + firstNames);
//        System.out.println("The size of list is: " + firstNames.size());//-->4
//
//        //get a specific name based on get and index/position
//        System.out.println("Get the Cornel element: " +  firstNames.get(0));
//
//        //delete the entire list
////        firstNames.clear();
//        System.out.println("The list is empty : " + firstNames);
//
//        //List with Objects -> List of Cities
//        Oras oras1 = new Oras("BC", "Bacau", 179000L);
//        Oras oras2 = new Oras("Is", "Iasi", 700000L);
//
//        List<Oras> orase = new ArrayList<>();
//        orase.add(oras1);
//        System.out.println(orase);
//        orase.add(oras2);
//        System.out.println(orase);
//
//
//        //get the index
//
//        System.out.println("Indexul pentru oras2 este: " + orase.indexOf(oras2));
//
//
//        //Sorting on list
//       Collections.sort(firstNames);
//        System.out.println(firstNames);
//
//        //contains - o folosim cand vrem sa validam daca lista noastra contine anumite informatii, elemente, sau nu.
//        //ex. formula:
//        System.out.println(firstNames.contains("Cornel"));//--> true
//
//
//
//    }
//}
