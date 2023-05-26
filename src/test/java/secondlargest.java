import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class secondlargest {

    public static void main(String[] args) {

        int [] ar={10,2050,30,40,50,60,125,11};

        Set<Integer> treeSet=new TreeSet<Integer>();
        for(int a:ar){
            treeSet.add(a);
        }

        List<Integer> arrayList=new ArrayList<Integer>(treeSet);

        int secondlargest = arrayList.get(arrayList.size()-2);

        System.out.println("second largest: "+secondlargest);

        System.out.println("second lowest: "+arrayList.get(1));
    }

}
