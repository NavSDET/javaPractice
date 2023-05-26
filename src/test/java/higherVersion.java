import org.apache.maven.artifact.versioning.ComparableVersion;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertTrue;

public class higherVersion {

    public static void main(String[] args) {
//        2.141.59
//        2.151.49

        String a= "2.141.59";
        String b= "2.151.49";


//        ComparableVersion v1=new ComparableVersion(a);
//        ComparableVersion v2=new ComparableVersion(b);
//        assertTrue(v1.compareTo(v2)<0);

        String[] a1 = a.split("\\.");
        String[] b1 = b.split("\\.");
        for(String aa:a1){
            System.out.println(aa);
            for(String bb:b1){
                System.out.println(bb);
                if(parseInt(aa)>parseInt(bb)){
                    System.out.println("version 1 is greater than version 2");
                } else if (parseInt(aa)==parseInt(bb)) {
                    System.out.println("version 1 is equal to version 2");
                } else if (parseInt(aa)<parseInt(bb)) {
                    System.out.println("version 1 is lower than version 2");
                }
            }
        }





    }

}
