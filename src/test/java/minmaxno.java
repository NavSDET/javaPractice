public class minmaxno {

    public static void main(String[] args) {

        int[] ar ={10,20,3,40,70,85,35,2};

        int max=ar[0];
        int min=ar[0];

        System.out.println(ar.length);

        for(int i=0; i<=ar.length-1; i++){

            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("max no is: "+max);

        for(int i=0;i<=ar.length-1; i++){

            if (ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("min no is: "+min);
    }
}
