import java.util.Arrays;

public class twoStringCompare {

    public static void main(String[] args) {

        String s1 = "ABCDH";
        String s2 = "BHDCA";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("yes its similar");
        } else {
            System.out.println("not similar");
        }
    }
}
