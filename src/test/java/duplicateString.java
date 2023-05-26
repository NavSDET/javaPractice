public class duplicateString {

    public static void main (String [] args){

        String name= "navnath";
        int count=0;
        char[] ch=name.toCharArray();
        for(int i=0; i<=name.length()-1;i++){

            for(int j= i+1; j<=name.length()-1; j++){
                if(ch[i]==ch[j]){
                    count++;
                    System.out.println("found duplicate: "+ch[j]);
                }
            }
        }
        System.out.println(count);
    }
}
