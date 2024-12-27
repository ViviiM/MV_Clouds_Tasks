public class Task12 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2 + 1); j++) {
                if ((i == 0 && j != i || i == n - 1 || i == n / 2) && j < (n / 2)
                        || j == 0 || j == (n / 2))
                    System.out.print("*" );
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
