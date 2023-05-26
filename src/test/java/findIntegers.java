public class findIntegers {

    public static void main(String[] args) {

        String str="IamF123ff45ggh&%67&890";

        str = str.replaceAll("[^0-9]","");

        System.out.println(str);

        findIntegers f=new findIntegers();
        f.reverse();
        f.reverse1();

    }

    void reverse(){
        String str="Navnath";

        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
    }

    void reverse1(){
        String str1="Navnath";

        String rev1="";

        char[] ch = str1.toCharArray();

        for(int i=str1.length()-1; i>=0; i--){
            rev1=rev1+str1.charAt(i);
        }
        System.out.println(rev1);
    }






}
