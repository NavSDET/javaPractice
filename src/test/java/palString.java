public class palString {

    public static void main(String[] args) {

        String str="radar";

        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is pal string");
        }else {
            System.out.println(str+" is not pal string");
        }

    }
}
