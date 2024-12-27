import java.util.Scanner;;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want : ");
        String str = "I Love Java";
        String[] arr = str.split("\s");
        int num = sc.nextInt();
        while (true) {
            try {
                System.out.println(arr[num - 1]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println("Error " + e);
                System.out.println("Enter Valid number : ");
                num = sc.nextInt();
            }
        }
        sc.close();
    }
}
