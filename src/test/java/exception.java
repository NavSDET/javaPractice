public class exception {



    public static void main(String[] args) {

        try {
            int a=10/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("hello......");

    }
}
