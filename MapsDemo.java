package java_week_4;

import java.util.*;

public class MapsDemo {
    public static void main(String[] args) {
        Map<String, String> dex = new HashMap<>();// random store + print
//        Map<String, String> dex = new LinkedHashMap<>();// stocheaza si printeaza fix in ordinea adaugata in map.
//        Map<String, String> dex = new TreeMap<>(); // stocheaza si printeaza in ordine alfabetica/ crescator

        //add a map entry
        //keys: masa, somn, cina
        //values: defintii

        dex.put("masa", "mobila formata dintr-o placa dreptunghiulara");
        dex.put("somn", "stare fiziologica normala si periodica de repaus a fiintelor");
        dex.put("cina", "A lua masa de seara");

        //access the values from map
        System.out.println("Definita pentru cina este: " + dex.get("cina"));

        //contains
        System.out.println("Exista cuvantul cina in dictionar? " + dex.containsKey("cina"));// --> true

        //size
        System.out.println(dex.size());

        //return all the keys --> se creeaza un set, inainte, sau se foloseste formula direct cu keySet
        Set<String> keys = dex.keySet();
        System.out.println(keys);

        //return all the values
        System.out.println(dex.values());

        //return the all map
        System.out.println(dex.entrySet());

        //null in map --> null on value
        dex.put("automation", null);
        System.out.println(dex.entrySet());

        //null on keys
        dex.put(null, "no value present");
        System.out.println(dex.entrySet());

        Set<Map.Entry<String, String>> entrySetDex = dex.entrySet();

        for (Map.Entry<String, String> perecheCuvantSiDefinitiaLui : entrySetDex) {
            System.out.println(perecheCuvantSiDefinitiaLui.getKey() + " = " + perecheCuvantSiDefinitiaLui.getValue());

        }



    }
}
