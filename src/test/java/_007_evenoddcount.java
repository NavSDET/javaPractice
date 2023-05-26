public class _007_evenoddcount {

    public static void main(String[] args) {

        int num=55512;
        int evenCount=0;
        int oddCount=0;

        while(num>0){
            int rem=num%10;
            System.out.println(rem);
            if(rem%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
            num=num/10;
        }
        System.out.println(evenCount+ " is even count");
        System.out.println(oddCount+ " is odd count");

    }
}
