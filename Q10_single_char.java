import java.util.Scanner;

public class Q10_single_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value = " + (int) ch);
        sc.close();
    }
}
