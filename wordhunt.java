package Arrays;
import java.util.Scanner;

public class wordhunt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the row limit:");
        int r = in.nextInt();

        System.out.println("Enter the column limit:");
        int c = in.nextInt();

        char[][] grid = new char[r][c];

        // Input characters
        System.out.println("Enter the characters row by row:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = in.next().charAt(0);
            }
        }

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // Print lime
        System.out.println("lime");
    }
}
