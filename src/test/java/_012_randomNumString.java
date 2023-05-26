import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class _012_randomNumString {

    public static void main(String[] args) {
//Approach 1:
        Random random=new Random();
        int num = random.nextInt();
        System.out.println(num);
        int num1 = random.nextInt(10);
        System.out.println(num1);
//Approach 2:
        double randomnum = Math.random();
        System.out.println(randomnum);
//Approach 3:
        String aaa = RandomStringUtils.randomNumeric(5);
        System.out.println(aaa);

        String bbb = RandomStringUtils.randomAlphabetic(6);
        System.out.println(bbb);

    }
}
