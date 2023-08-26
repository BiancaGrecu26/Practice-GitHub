//package java_week_4;
//
//public class Oras {
//
//    String codOras;
//    String nume;
//    long numarLocuitori;
//
//    // declarare static field - sa il declaram si final
//    // acest field este valabil pentru clasa Oras, nu pentru obiectele create
//    // fielduri la nivel de clasa - o singura valoare pentru toate obiectele create pentru clasa - valoare general valibila pentru toata clasa
//
//    // constante
//    public final static String COD_TARA = "RO";
//    public final static String TARA = "Romania";
//
//    private static int numarOraseExistente = 0; // 2
//
//    // declarare constructor
//    // transfer valoarea din constructor catre field-ul obiectului - valoarea de mai sus
//    public Oras(String codOras, String nume, long numarLocuitori) {
//        this.codOras = codOras;
//        this.nume = nume;
//        this.numarLocuitori = numarLocuitori;
//
//        numarOraseExistente++; // 2
//    }
//
//    public String afisareDetaliiOras() {
//        return codOras + " " + nume;
//    }
//
//    // GET - doar ofera informatia, nu ii ofera acces sa modifice variabila
//    // metoda statica - raspunde pentru clasa (cate orase s-au creat pentru clasa Oras)
//    public static int getNumarOraseExistente() {
//        return numarOraseExistente;
//    }
//
//    @Override
//    public String toString() {
//        return "City with code: " + codOras + " and name : " + nume + " has " + numarLocuitori + " population";
//
//    }
//}
