public class Task2 {
    
    public static void main(String[] args) {
        char[] list = {'a', 'b', 'B', 'A'};
        
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    char temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        
        for (char c : list) {
            System.out.print(c + " ");
        }
    }
}
