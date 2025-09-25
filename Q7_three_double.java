import java.util.Scanner;

public class Q7_three_double {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Average = " + (a + b + c) / 3);
        sc.close();
    }
}
