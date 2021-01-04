import java.util.Scanner;

class VowelException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    VowelException(String s) {
        super(s);
    }
}

class BlankException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    BlankException(String s) {
        super(s);
    }
}

class ExitException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    ExitException(String s) {
        super(s);
    }
}

class TestException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter A Alphabet:");
        char Char = 'X';
        try {
            if (Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u') {
                System.out.println(" ");
                throw new VowelException("Vowel Not Allowed.");
            } else if (Char == ' ') {
                throw new BlankException("Blank Not Allowed.");
            } else if (Char == 'X') {
                throw new ExitException("X Not Allowed.");

            } else {
                System.out.println("Valid Charecter.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}