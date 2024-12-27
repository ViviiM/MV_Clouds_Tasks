//Write a program to check if a List of integers contains only odd numbers.
public class Task5 {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 21, 22, -11, 1 };
        int[] arr2 = { 11, 21, 31, 41, 51, 61 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                // System.out.println(" Odd");
            } else {
                count--;
                System.out.println(arr[i] + " is not odd");
            }
        }
        if (count == arr.length) {
            System.out.println("Arr contains all ods");
        }
    }
}
