public class revwholeword {

    public static void main(String[] args) {

        String str="Welcome to Java";
        String revStr="";

        String[] words=str.split(" ");

        for(String w:words){
            String revWord="";

            for(int i=w.length()-1; i>=0; i--){
                revWord=revWord+w.charAt(i);
            }
            revStr=revStr+revWord+" ";

        }
        System.out.println(revStr);
    }
}
