public class exception1 {

    public static void main(String[] args) {

        try {
            int i=10/0;
        }catch (Exception e){
           e.printStackTrace();
            System.out.println("hiiiiiiiiiiiii");
        }finally {
            System.out.println("holaaaaaaaa");
        }

    }

}
