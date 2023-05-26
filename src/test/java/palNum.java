public class palNum {


    public static void main(String[] args) {
        int num=12321;
        int orgNum=num;
        int rev=0;


        while(orgNum!=0){
           rev=rev*10+ orgNum % 10;
           orgNum=orgNum/10;
        }
        System.out.println(rev);
        if (num==rev){
            System.out.println(num+" is pal num");
        } else {
            System.out.println(num+ " is not pal num");
        }
    }



}
