import java.util.HashMap;
import java.util.Set;

public class dupstringarray {

    public static void main(String[] args) {

        String [] str={"A","B","C","D","B","D"};

        HashMap<String, Integer> smap=new HashMap<String, Integer>();

        for(String st:str){
            if(smap.containsKey(st)){
                smap.put(st, smap.get(st)+1);
            }else {
                smap.put(st, 1);
            }

        }

        Set<String> keys=smap.keySet();

        for(String key:keys){
            if(smap.get(key)>1){
                System.out.println(key+":"+smap.get(key));
            }
        }

    }
}
