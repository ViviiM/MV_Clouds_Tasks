import java.util.Scanner;

public class Task1 {

    String removewhitespaces(String str) {
        char[] ch = str.toCharArray();
        String newstr = "";
        for (char c : ch) {
            if (c == ' ') 
                continue;
            else
                newstr += c;
        }
        return newstr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task1 t = new Task1();
        System.out.println("Enter a string (Removes spaces) : ");
        String op = t.removewhitespaces(sc.nextLine());
        System.out.println(op);
    }
}
