// "Swap without using third Element"
public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.printf("Actual %s %S %n" , a ,b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("Swapped %s %S" ,a,b );
    }
}