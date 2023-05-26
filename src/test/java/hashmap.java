import java.util.Collection;
import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {

        String str="Welcome to Java";

        HashMap m=new HashMap();

        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Mary");
        m.put(105,"Tye");
        m.put(103,"X");

        System.out.println(m); //{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}// {101=John, 102=David, 103=X, 104=Mary, 105=Tye}

        m.remove(104);

        System.out.println(m);


    }

}
