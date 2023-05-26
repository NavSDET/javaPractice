public class _009_FindLargestOf3Numbers {
    public static void main(String[] args) {

        int num1=10, num2=20, num3=15;

        if(num1>num2 && num1>num3){
            System.out.println(num1 +" is greater than ");
        } else if (num2>num3 && num2>num1) {
            System.out.println(num2 +" is greater than ");
        } else {
            System.out.println(num3+" is largest number");
        }


    }
}
