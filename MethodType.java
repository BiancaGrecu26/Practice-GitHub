package java_week1;

public class MethodType {

    //START METODA VOID - afiseaza/ pastreaza un rezultat DOAR in consola

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

    }

    //START METODA NON-VOID - returneaza o valoare, pentru a o putea folosi ulterior

    public static int sum (int a, int b){
        int sum = a + b;


        return a + b;
    }
}


