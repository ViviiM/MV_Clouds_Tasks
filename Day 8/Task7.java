import java.util.Scanner;

public class Task7 {
    int factorial(int num){
        if(num == 0) return 1;
        if(num == 1) return num;
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number : ");
        int n = sc.nextInt();
        System.out.println("Enter second number : ");
        int r = sc.nextInt();
        Task7 t = new Task7();
        System.out.println("Permutation "  + t.factorial(n)/t.factorial(n - r));
        System.out.println("Combination "  + t.factorial(n)/(t.factorial(n - r) * t.factorial(r)));

        
    }
}
