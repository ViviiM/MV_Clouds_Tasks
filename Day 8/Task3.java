public class Task3 {

    public static void main(String[] args) {
        int[] arr = {98,32,72,94,75,73,92,36,28,34,200};
        int max = 0;
        int secmax = 0;
        for (int i : arr) {
            if (i > max) {
                secmax = max;
                max = i;
            } else if (i > secmax && i < max) {
                secmax = i;
            }
        }
        System.out.println( "MAx : "+max + " Second Max : " + secmax);
    }
}
