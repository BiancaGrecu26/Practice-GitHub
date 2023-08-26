package java_week1;

public class InterChangedValues {
    public static void main(String[] args) {
      int a = 10;
      int b = 3;
      int c;
        System.out.println("inainte de interschimbare valorile sunt " +" a are valoarea " + a +" b are valoarea " +b);
        c = b;
        b = a;
        a = c;
        System.out.println("valorile dupa interschimbare sunt " + " a are valoarea " +a+ " b are valoarea "+b+" c are valorea " +c);
    }
}
