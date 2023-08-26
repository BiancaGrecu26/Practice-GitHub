package java_week1;

public class CalculVarsta {
    public static void main(String[] args){
        int anNastere=1990;
        int anCurent=2023;
        int varsta=anCurent-anNastere;
        System.out.println("Varsta mea este: "+varsta+" de ani");
    }

    public static class TimeConvertor {
        public static void main(String[] args) {
            int oraCurenta = 3;
            int oraInMilisecunde = oraCurenta * 60 * 60 * 1000;
            System.out.println(oraInMilisecunde);
                    // ora 3 este formata din 10800000 milisecunde
            System.out.println("ora " + oraCurenta + " este formata din " + oraInMilisecunde);
        }
    }
}
