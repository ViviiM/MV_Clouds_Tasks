import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2 - 1); j++) {
                count++;
                if (j >= n - 1 - i && j <= n - 1 + i) {
                    if (count > 1) {
                        count = 0;
                        System.out.print("*");
                    } else {
                        System.out.print(i);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int c = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < (n * 2 - 1); j++) {
                c++;
                if (j >= n - 1 - i && j <= n - 1 + i) {
                    if (c > 1) {
                        c = 0;
                        System.out.print("*");
                    } else {
                        System.out.print(i);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}