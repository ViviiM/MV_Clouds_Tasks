import java.util.Scanner;;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 123.45;
        String s = num + "";
        int len = s.split("[.]")[1].length();
        num = num * Math.pow(10, len);
        
    }
}
