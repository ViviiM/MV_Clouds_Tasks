import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n;
        while (true) {
            n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println("Enter Odd number");
            else
                break;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < n / 2 || i == n / 2 || i == 0 && j > (n / 2) || j == n / 2 || i == n - 1 && j < n / 2
                        || j == n - 1 && i > n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
