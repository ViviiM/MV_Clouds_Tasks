public class Task6 {
    public static void main(String[] args) {
        
        String str = "My name is Khan";
        String[] arr = str.split("[\s]");
        String reverseString = "";
        for (int i = arr.length-1; i >= 0; i--) {
            reverseString += arr[i] + " ";
        }
        System.out.println(reverseString);
    }
}
