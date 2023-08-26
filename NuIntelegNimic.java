package java_week3;


    public class NuIntelegNimic {
        public static double findMaximum(double num1, double num2, double num3) {
            double max = num1;

            if (num2 > max) {
                max = num2;
            }

            if (num3 > max) {
                max = num3;
            }

            return max;
        }

        public static void main(String[] args) {
            double num1 = 10.5;
            double num2 = 8.2;
            double num3 = 12.9;

            double maximum = findMaximum(num1, num2, num3);
            System.out.println("Maximum value: " + maximum);
        }
    }


