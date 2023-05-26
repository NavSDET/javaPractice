public class zeroToHundred {


    /**
     * Print 0 to 100 or 1 to 100 without using any number
     */

    public static void main(String[] args) {

        String s= "programmin";
        int zero = s.length() - s.length();
        int hundred = s.length() * s.length();

        String s1="s";
        int one = s1.length();

        for(int i=zero; i<=hundred; i++){
            System.out.println("--> "+i);
        }

        System.out.println("--------------");

        for (int i=one; i<=hundred; i++){
            System.out.println(i);
        }

    }
}
