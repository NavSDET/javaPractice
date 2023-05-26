public class revstr {
    public static void main(String[] args) {

        String name="Welcome";

        String rev="";

        for(int i=name.length()-1;i>=0;i--){

            rev=rev+name.charAt(i);

        }
        System.out.println("reverse string is: "+rev);
    }
}
