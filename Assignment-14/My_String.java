public class My_String {
    private void countWords(String str) {
        int i, count = 1;
        int len1 = str.length();
        for (i = 0; i < len1 - 1; i++) {
            if ((str.charAt(i) == " ") && (str.charAt(i + 1) != " ")) {
                count++;
            }
        }
        System.out.println("Number Of words:" + count);
    }

    private void compareString(String x, String y, String z) {
        Boolean b = x.equals(y);
        Boolean c = y.equals(z);
        System.out.println("String s1 and s2 are same:" + b);
        System.out.println("String s2 and s3 are same:" + c);
    }

    private void upperCase(String x, String y, String z) {
        x = x.toUpperCase();
        y = y.toUpperCase();
        z = z.toUpperCase();
        System.out.println("Upper Case:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    private void lowerCase(String x, String y, String z) {
        x = x.toLowerCase();
        y = y.toLowerCase();
        z = z.toLowerCase();
        System.out.println("Lower Case:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    private void concateString(String x, String y, String z) {
        String conc1 = x + y;
        String conc2 = x.concat(y);
        System.out.println("String Concatination:");
        System.out.println(conc1);
        System.out.println(conc2);

    }

    public static void main(String[] args) {
        My_String obj = new My_String();
        String s1 = "GOOGLE Microsoft";
        String s2 = "Dilsad";
        String s3 = "Dilsad";
        System.out.println("==================");
        System.out.println(s1.length());
        obj.countWords(s1);
        System.out.println("==================");
        obj.compareString(s1, s2, s3);
        System.out.println("==================");
        obj.upperCase(s1, s2, s3);
        System.out.println("==================");
        obj.lowerCase(s1, s2, s3);
        System.out.println("==================");
        obj.concateString(s1, s2, s3);
    }
}
