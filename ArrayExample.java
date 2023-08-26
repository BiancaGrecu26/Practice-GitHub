package java_week3;

public class ArrayExample {
    public static void main(String[] args) {
        // declarare

        String[] employees;

        // initializare

        employees = new String[5];// dimensiunea sirului de valori

        //asignare de valori

        employees[0]="Ana";
        employees[1]="Maria";
        employees[2]="Cornel";
        employees[3]="Gigel";
        employees[4]="Ionel";

        int[] age;
        age = new int[5];
        age[0]=19;
        age[1]=20;
        age[2]=45;
        age[3]=37;
        age[4]=33;
        System.out.println("Varsta de pe pozitia 4: " + age[7]); //=> eroare, deoarece indexul 7 nu exista, array-ul are doar 5 elemente;


    }
}
