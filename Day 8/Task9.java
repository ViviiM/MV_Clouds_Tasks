public class Task9 {
    public static void main(String[] args) {
        String i = null;
        try {
            System.out.println(i.toString()); // Null Pointer Exception

        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Null Pointer Exception " + e);
        }
        // String s = null;
        // String m = (s == null) ? "Ternery" : "Problem solved";
        // System.out.println(m);

    }
}
