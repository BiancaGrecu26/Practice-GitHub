package java_week3;

public class Present {

    public static void main(String[] args) {

        int[] myArray = {1, 3, 4, 6, 7, 9, 12};
        int favorite = 5;
        boolean display = false;
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] == favorite)

            {
                display = true;
               break;
            }

        }
        if (display) {
            System.out.println("valorea: " + favorite + "a fost gasita");
        } else {
            System.out.println("valorea: " + favorite + "nu a fost gasita");
        }
    }
}