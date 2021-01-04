
public class NullExcep {
    public static void main(String[] args) {
        String name1 = null;
        // String name2 = "Dilsad";
        try {
            // if (name2.equals(name1))
            // System.out.println("Same.");
            // else
            // System.out.println("Not Same.");
            System.out.println(name1.length());

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception.");
        }

    }
}
