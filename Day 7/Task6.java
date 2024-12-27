import java.util.Scanner;

public class Task6 {
    String encrypt(String str, int secretkey) {
        char[] chr = str.toCharArray();
        String encryptedString = "";
        for (int i = 0; i < chr.length; i++) {
            chr[i] += secretkey;
            encryptedString += chr[i];
        }
        return encryptedString;
    }

    String decrypt(String str, int secretkey) {
        char[] chr = str.toCharArray();
        String decryptedString = "";
        for (char c : chr) {
            c -= secretkey;
            decryptedString += c;
        }
        System.out.println();
        return decryptedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task6 t = new Task6();
        while (true) {
            System.out.println("String you want to encrypt : ");
            String str = sc.nextLine();
            System.out.println("Give secret Key :");
            int secretkey = sc.nextInt();
            String data = t.encrypt(str, secretkey);
            System.out.println("Encrypted data " + data);
            System.out.println("String you want to Decrypt  :");
            sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println("Give secret Key :");
            int secretkey2 = sc.nextInt();
            String d = t.decrypt(str2, secretkey2);
            System.out.println("Decrypted dta " + d);
            sc.nextLine();
        }

    }

}
