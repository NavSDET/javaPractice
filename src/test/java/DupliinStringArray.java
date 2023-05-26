import java.util.HashMap;

public class DupliinStringArray {

    public static void main(String[] args) {

        String [] str={"Navnath","Komal","Dattaraj","Rani","Swapnil","Varsha", "Swapnil","Nishant","Komal"};

        HashMap<String,Integer> smap=new HashMap<String, Integer>();

        for(String st:str){
            if(smap.containsKey(st)){
                smap.put(st, smap.get(st)+1);
            }else {
                smap.put(st, 1);
            }

            if(smap.get(st)>1){
                System.out.println(st+":"+smap.get(st));
            }
        }
    }
}
