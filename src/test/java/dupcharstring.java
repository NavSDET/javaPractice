public class dupcharstring {

    public static void main(String[] args) {

        String name="Navnathvt";

        char[] ch=name.toCharArray();

        for(int i=0; i<=name.length()-1; i++){
            for (int j=i+1; j<=name.length()-1; j++){

                if(ch[i]==ch[j]){
                    System.out.println("duplicate character is: "+ch[j]);
                }
            }
        }
    }
}
