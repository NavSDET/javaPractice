public class distinctdup {

    public static void main(String[] args) {

        String str="Navnath";

        for(int i=0;i<=str.length()-1;i++){
            int flag=0;

            for(int j=0;j<=str.length()-1;j++){

                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(str.charAt(i));
            }
        }
    }
}
