import java.util.Arrays;
import java.util.OptionalInt;

public class _017_missingNuminArray {

    public static void main(String[] args) {

        int ar[]={1,2,3,5,6};
        int sum1=0;
        int sum2=0;

        for(int i=0;i<=ar.length-1; i++){
            sum1=sum1+ar[i];
        }
        System.out.println(sum1);

        OptionalInt max = Arrays.stream(ar).max();
        System.out.println(max.getAsInt());
        for(int i=1; i<=max.getAsInt();i++){
            sum2=sum2+i;
        }
        System.out.println(sum2);

        int missingNum = sum2 - sum1;
        System.out.println("missing num: "+missingNum);

    }
}
