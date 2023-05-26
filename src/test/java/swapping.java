public class swapping {

    public static void main(String[] args) {

        String s1="Hello";
        String s2="World";

//        str1=str1+str2;
//
//        str2=str1.substring(0,(str1.length()-str2.length()));
//
//        str1=str1.substring(str2.length());
//
//        System.out.println(str1+" "+str2);

        s1=s1+s2;

        s2=s1.substring(0,(s1.length()-s2.length()));

        s1=s1.substring(s2.length());

        System.out.println(s1+s2);
    }
}
