public class newa {

    public static void main(String[] args) {

        String str="Welcome";
        String rev="";
        String rev1="";
        char[] ch=str.toCharArray();
//1
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);




//2.
        for(int i=str.length()-1; i>=0; i--){
            rev1=rev1+ch[i];
        }
        System.out.println(rev);
    }

}
