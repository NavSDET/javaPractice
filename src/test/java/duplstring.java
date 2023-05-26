public class duplstring {

    public static void main(String[] args) {

        String str="Welcome to Java";

       String [] words=str.split(" ");

       String revString="";

       for(String w:words){
           String revWord="";

           for(int i=w.length()-1; i>=0; i--){
               revWord=revWord+w.charAt(i);
           }
           revString=revString+revWord+" ";

       }
        System.out.println(revString);
    }
}
