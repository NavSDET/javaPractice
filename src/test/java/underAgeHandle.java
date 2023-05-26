public class underAgeHandle {

    public static void main(String[] args) {
        int age= 17;

        try{
            if(age<18){
                throw new underAge("You are not allowed to vote");
            }else {
                System.out.println("you are allowed to vote");
            }
        }catch(underAge e){
            e.printStackTrace();
        }
        System.out.println("hello world......");
    }
}
