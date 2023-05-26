public class _014_sumOfElementsInArray {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};

        int sum=0;

//        for(int i=0; i<=ar.length-1;i++){
//            sum=sum+ar[i];
//        }

        for(int a:ar){
            sum=sum+a;
        }

        System.out.println(sum);
    }
}
