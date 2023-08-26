package java_week3;

public class Car {
   // public static void main(String[] args) {
        // FIELD URI (proprietati, caracteristici )

        String marca;
        String culoare;
        String model;

        CarEngine motor;
        CarWheels[] roti;

        // METODE (behaviour)



        public void start() {
            if (motor.putere < 100) {
                System.out.println("Vruuum");
            } else {
                System.out.println("Vruuuum, vruuuum");
            }

        }
//        public void stop(){
//
//        }
//    }
//    // metoda non-void -> returneaza o valoare in back-end, pentru a fi preluata de front-end, pentru afisare;
    public String descriere ()
    {
        return "brand: " + marca + " nuanta: " + culoare + " design: " + model;
    }

    public String descriereAudi ()
    {
        return "brand: " + marca + " nuanta: " + culoare;
    }
}
