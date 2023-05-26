public class rev1 {

    public static void main(String[] args) {
        String str="Komal";
        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        System.out.println("---------------------");

        rev1 r=new rev1();
        r.m1();

    }

    void m1(){
        String str1="Welcome To Java";
        String revStr="";
        String[] words=str1.split(" ");

        for(String word:words){
            String revWord="";

            for(int i=word.length()-1; i>=0; i--){
                revWord=revWord+word.charAt(i);
            }
            revStr=revStr+revWord+" ";
        }
        System.out.println(revStr);
    }
}
