public class reverseString {

    public static void main(String[] args) {

        //1.
        String str="race", rev= "";
        char ch;

        for(int i=0; i<=str.length()-1; i++){
             ch= str.charAt(i);
             rev = ch+rev;
        }
        System.out.print(rev);
        System.out.println();
        System.out.println("---------------------------------");

        //2.
        String str1="doctor", rev1= "";
        char a[] = str1.toCharArray();
        int length=a.length;

        for(int i=length-1; i>=0; i--){
            rev1=rev1+a[i];
        }
        System.out.print(rev1);

        System.out.println();
        System.out.println("----------------------------");

        String str2="My Name is Navnath";

        StringBuffer sb =new StringBuffer(str2);
        StringBuffer rev2 = sb.reverse();
        System.out.println(rev2.toString());


    }

}
