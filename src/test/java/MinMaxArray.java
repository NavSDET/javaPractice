import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;


public class MinMaxArray {

    /**
     * Find min and max value in an Array using streams
     */
    public void minmax(){
        List<Integer> list= Arrays.asList(10,20,30,40,50,6,3,70);

        Integer aMax = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer aMin = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("--> "+aMax);
        System.out.println("--> "+aMin);

        int [] myarray= {10,20,30,40,50,6};
        IntSummaryStatistics aaa = Arrays.stream(myarray).summaryStatistics();
        DoubleStream bbb = Arrays.stream(myarray).asDoubleStream();

        System.out.println("IntSummaryStatistics..."+aaa);
        System.out.println("DoubleStream..."+bbb);

    }


//Find min and max value in an Array.

    public int max(int[] array) {

        int max=0;

        for(int i=0; i<=array.length-1; i++){
            if(array[i]> max){
                max=array[i];
            }
        }
        return max;
    }

    public int min(int[] array){

        int min= array[0];

        for(int i=0; i<=array.length-1; i++){

            if(array[i]< min){
                min = array[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        MinMaxArray m=new MinMaxArray();

        int [] myarray= {10,20,30,40,50,6};

        System.out.println("Max Value in an array: "+m.max(myarray));
        System.out.println("Min Value in an array: "+m.min(myarray));
        System.out.println("----------------------------------------");

        m.minmax();

    }


}
