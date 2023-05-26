public class star02 {

    public static void main(String[] args) {
        String star="*";
        for(int i=4; i>=1; i--){
            for(int j=4; j>=i; j--){
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int i=0;i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(star+" ");
            }
            System.out.println();
        }
    }
}
