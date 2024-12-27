import java.util.Scanner;

public class Task8 {
    int armstrong(int num) {
        int arm = Integer.toString(num).length();
        // System.out.println(arm);
        int temp;
        int sum = 0;
        while (num != 0) {
            temp = num % 10;
            // System.out.println("temo"+temp);
            num = num / 10;
            // System.out.println(num);
            sum += (int) Math.pow(temp, arm);
            // System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task8 t = new Task8();
        while (true) {

            System.out.println("Enter a number to check it is armstrong :");
            int num = sc.nextInt();
            if (num == t.armstrong(num)) {
                System.out.println("Armstrong");
            } else {
                System.out.println("No Armstrong");
            }
        }
    }
}
