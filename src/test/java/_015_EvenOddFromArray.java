public class _015_EvenOddFromArray {

    public static void main(String[] args) {

        int ar[]={1,2,8,4,10,6,7};
        int even=0;
        int odd=0;

        for(int i=0; i<ar.length;i++){
            if(ar[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even-->"+even);
        System.out.println("odd--->"+odd);

        System.out.println("even nums in array");
        for (int i=0; i<ar.length;i++) {
            if (ar[i] % 2 == 0) {
                System.out.println(ar[i]);
            }
        }

        System.out.println("odd nums in array");
        for(int a:ar){
            if(a%2 !=0){
                System.out.println(a);
            }
        }
    }
}
