public class revwords {

    public static void main(String[] args) {

        String str="Welcome To Java";
        String revStr="";

        String[] words=str.split(" ");

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
