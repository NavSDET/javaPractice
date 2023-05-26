import java.util.Arrays;

public class _016_compareArray {

    public static void main(String[] args) {

        int[]ar1={1,2,3,4,5};
        int[]ar2={1,2,3,4,6};

        boolean status = Arrays.equals(ar1, ar2);
        System.out.println(status);

    }
}
