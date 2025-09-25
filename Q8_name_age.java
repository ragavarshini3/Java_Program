import java.util.Scanner;
public class Q8_name_age {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
        sc.close();
    }
}
