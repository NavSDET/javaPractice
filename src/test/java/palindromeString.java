import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        String orgStr= str;
        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }

        if(orgStr.equals(rev)){
            System.out.println(orgStr+" is pal string");
        }else {
            System.out.println(orgStr+ " is not pal string");
        }



    }
}
