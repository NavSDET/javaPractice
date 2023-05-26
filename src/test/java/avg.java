public class avg {

        public static void main(String [] args){

            int [] a={9,8,2,6,5};
            int sum=0;

            for(int ar:a){
                sum=sum+ar;
            }

            int avg=sum/a.length;
            System.out.println(avg);

        }
}
