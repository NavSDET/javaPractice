import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class uppercaselowercase {

    public static void main(String[] args) {

        String str="NAhgsfcuijHGYGUH34657890#$%^&*(!";

        int upper=0;
        int lower=0;
        int number=0;
        int special=0;

        for(int i=0; i<=str.length()-1;i++){

            char ch=str.charAt(i);

            if(ch>='A' && ch<='Z'){
                upper++;
            } else if (ch>='a' && ch<='z') {
                lower++;
            } else if (ch>='0' && ch<='9') {
                number++;
            }else {
                special++;
            }

        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);
        System.out.println(special);
    }
}
