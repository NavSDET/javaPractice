import java.util.Arrays;

public class createsamearray {

    public static void main(String[] args) {

        String ar1[]={"A","B","C","D"};
        String ar2[]={"B","C","A","D"};

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

    }
}
