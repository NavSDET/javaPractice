public class foundminmax {

    public static void main(String[] args) {

        int [] ar={9,2,10,20,30,4,50,60,85,25,65};

        int max=ar[0];
        int min=ar[0];

        for(int i=0; i<=ar.length-1; i++){
            if(ar[i]> max){
                max=ar[i];

            }
        }
        System.out.println("max value is: "+max);

        for(int i=0; i<=ar.length-1; i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("min value is: "+min);
    }

}
