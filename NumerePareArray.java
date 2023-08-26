package java_week3;

public class NumerePareArray {
    public static void main(String[] args) {
        int[] pare = {-1, 2, 4, 5, 8, 10, 12, 7, 9};
        int numar = 0;
        for (int i = 0; i<pare.length; i++){
            if (pare[i]%2==0){
                numar++;
            }
        }
        System.out.println("Numarul de numere pare :" + numar);
    }
}
