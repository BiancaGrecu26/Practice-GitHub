package java_week3;
import java.util.Arrays;
public class ArraysToString {

    public static void main(String[] args) {
        int[] numere = {1, 5, 6, 2, 8, 9};
//        Arrays.sort(numere);
//        System.out.println("tabloul sortat: ");
//        afisareArray(numere);
//    }
//
//    public static void afisareArray(int[] numere){
//        for (int i =0; i< numere.length; i++){
//            System.out.println(numere [i] + " ");
//    }
//        System.out.println();
        String ArrayString = Arrays.toString(numere);
        System.out.println(ArrayString);
    }

}