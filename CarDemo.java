package java_week3;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.marca = "BMW";
        car1.culoare = "rosie";
        car1.model = "electric";

        CarEngine engine1= new CarEngine();
        engine1.capacitateCilindrica = 2000;
        engine1.putere = 100;

        car1.motor = engine1;

        car1.roti = new CarWheels[] {new CarWheels(), new CarWheels(), new CarWheels(), new CarWheels()};

        System.out.println(car1.descriere());

        Car car2 = new Car();
        CarEngine engine2 = new CarEngine();
        car2.marca = "Mercedes";
        car2.model = "GLA";
        car2.culoare = "alb";

        car2.motor = engine2; // motorul masinii 2, primeste proprietatile engine2

        Car car3 = new Car();
        car3.marca = "Renault";
        car3.culoare = "negru";
        // fara model    => aca apela metoda descriere, nu vom avea un return, pentru ca descrierea contine si model.
        System.out.println("Masina 3: " + car3.descriereAudi());



    }
}
