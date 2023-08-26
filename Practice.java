package java_week_4;

import java.util.*;

public class Practice {

        /* 1.Write a Java Method to insert elements (colors) into a linked list at the first and last positions. */

        public static void colorList() {
            LinkedList<String> colorList = new LinkedList<>();
            colorList.add("rosu");
            colorList.add("verde");
            colorList.add("galben");
            colorList.add("mov");
            System.out.println("Lista initiala este: " + colorList);

            colorList.addFirst("portocaliu");
            colorList.addLast("negru");
            System.out.println("Lista modificata este: " + colorList);
        }

    /* 2. Write a Java Method to iterate through all elements in a sorted set (with names).
          Print only the values that are starting with "A".
          Display a message in case there are names that are not starting with "A". */

        public static void sortedSet() {
            Set<String> names = new TreeSet<>();
            names.add("Cornel");
            names.add("Bianca");
            names.add("Vladimir");
            names.add("Ana Maria");
            for (String name : names) {
                if (name.startsWith("A")) {
                    System.out.println("Numele care incepe cu A este: " + name);
                } else {
                }
                System.out.println("Nu exista niciun nume care sa respecte validarea");
            }
            for (String name : names) {
                if (name.endsWith("a")) {
                    System.out.println("Numele care se termina cu a este: "+ name);
                } else {
                }
                System.out.println("Nu exista niciun nume care sa respecte validarea");
            }
        }

        /* 3. Write a Java Method to find maximum element in ArrayList. */
        public static void maxValue() {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(2);
            numbers.add(3);
            numbers.add(5);
            System.out.println("Numarul maxim este: " + Collections.max(numbers));
        }

    /* 4. Create a list with ages (populated with 5 values).
          Create a Java method that will calculate the average of the values existing on the list.
     */

        public static void averageAge() {
            List<Integer> alteNumere = new ArrayList<>();
            alteNumere.add(25);
            alteNumere.add(12);
            alteNumere.add(7);
            alteNumere.add(30);
            alteNumere.add(9);
            int sum = 0;

            for (Integer age : alteNumere ) {
                sum += age;

            }
            System.out.println("Average-ul este:" + (double) sum/ alteNumere.size());
        }

        public static void main(String[] args) {
             colorList();
             sortedSet();
             maxValue();
             averageAge();
        }
    }

