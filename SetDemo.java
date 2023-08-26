package java_week_4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> orase = new HashSet<>();
//        Set<String> orase = new LinkedHashSet<>();

        //lista sortata de la A la Z, sau numeric
        Set<String> orase = new TreeSet<>();

        //add elements to set
        orase.add("Iasi");
        orase.add("Cluj");
        orase.add("Vaslui");
        orase.add("Bacau");
        System.out.println(orase);

        //streams Java 8 - poti gasi first si last element
//        orase.stream().findFirst();

        //add duplicate
        orase.add("Bacau");

        System.out.println(orase);

//        //remove
//        orase.remove("Bacau");
//
//        //clear
//        orase.clear();

        //
//        orase.size() ;
//
//        //for each on set/list
//        for (String orasName : orase) {
//            System.out.println("Orasele din for sunt: " + orasName);
//
//        }

//        //contains --> contine parti din element
//        for (String orasName : orase) {
//            if (orasName.contains("Vaslui"))
//            System.out.println("Orasele din for sunt: " + orasName);
//
//        }

        //equals --> egaleaza rezultatul
        for (String orasName :orase) {
            if (orasName.equals("Bacau"))
        System.out.println("Orasul este: " + orasName);

        }



    }
}
