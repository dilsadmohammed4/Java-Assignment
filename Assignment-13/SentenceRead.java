public class SentenceRead {

    static public void main(String[] args) {
        String str = "To Read The Sentence 1 to 100";
        int n = str.length();
        int vowels = 0, consonant = 0, digit = 0;
        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            } else if (ch >= '0' && ch <= '9')
                digit++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);
        System.out.println("Digit: " + digit);
    }
}
