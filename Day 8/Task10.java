import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of dice rolled : ");
        int num = sc.nextInt();
        System.out.println("Enter outcome of the rolled : ");
        int outcome = sc.nextInt();
        
        System.out.println(countDiceCombinations(num, outcome));  
        sc.close();
    }

    public static int countDiceCombinations(int dice, int outcome) {
        return countCombinations(dice, outcome, 0);
    }

    private static int countCombinations(int dice, int outcome, int sum) {
        if (dice == 0) return sum == outcome ? 1 : 0;
        else if(dice < 0|| outcome <0) return 0;
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            count += countCombinations(dice - 1, outcome, sum + i);
        }
        return count;
    }
    
}
