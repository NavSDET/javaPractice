public class stringwholerev {

    public static void main(String[] args) {

        String str="welcome to java python";
        String[] words = str.split(" ");
        String revString="";

        for(String word:words){
            String revword="";
            for(int i=word.length()-1; i>=0; i--){
             revword=revword+word.charAt(i);
            }
            revString=revString+revword+" ";
        }
        System.out.println(revString);
    }
}
