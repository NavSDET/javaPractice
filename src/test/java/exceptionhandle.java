public class exceptionhandle {

    public static void main(String[] args) {

        int age=12;

        try {
            if(age<18){
                throw new UnderAgeException("You can not vote");
            }else {
                System.out.println("You can vote");
            }
        }catch (UnderAgeException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
