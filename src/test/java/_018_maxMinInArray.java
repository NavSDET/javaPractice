import java.util.Arrays;
import java.util.OptionalInt;

public class _018_maxMinInArray {

    public static void main(String[] args) {

        int[] ar ={10,20,70,5,50,3,4,80,85,81};

        int max=ar[0];
        int min=ar[0];

        for(int i=1; i<=ar.length-1; i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("max num: "+max);

        for(int i=1;i<=ar.length-1; i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("min num: "+ min);

        OptionalInt maxi = Arrays.stream(ar).max();
        System.out.println(maxi.getAsInt());

        OptionalInt mini = Arrays.stream(ar).min();
        System.out.println(mini.getAsInt());

        int sum = Arrays.stream(ar).sum();
        System.out.println(sum);

    }
}
