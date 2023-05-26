public class _006_countNumber {

    public static void main(String[] args) {

        int num=1234589;
        int count=0;

        try {
            while (num>0){
                num=num/10;
                count++;
            }
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println(count);

    }
}
