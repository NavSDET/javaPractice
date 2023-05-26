import java.util.HashMap;
import java.util.Set;

public class dupstringinarray {

    public static void main(String[] args) {

        String [] st={"ABC","DEF", "GHI","DEF"};

        HashMap<String, Integer> smap=new HashMap<String, Integer>();

        for(String str:st){
            if(smap.containsKey(str)){
                smap.put(str, smap.get(str)+1);
            }else {
                smap.put(str, 1);
            }

            Set<String> keys=smap.keySet();

            for(String key:keys){
                if(smap.get(key)>1){
                    System.out.println(key+" : "+smap.get(key));
                }
            }
        }
    }
}
