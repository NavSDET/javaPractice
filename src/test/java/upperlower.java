public class upperlower {

    public static void main(String[] args) {

        String str="Na134567V^&*((*&$NATHbur7774736ungale";
        int upper=0;
        int lower=0;
        int numbers=0;
        int special=0;

        for(int i=0; i<=str.length()-1;i++){

            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z'){
                upper++;
            }else if (ch>='a' && ch<='z'){
                lower++;
            } else if (ch>='0' && ch<='9') {
                numbers++;
            }else {
                special++;
            }
        }
        System.out.println("upper no is: "+upper);
        System.out.println("lower no is:"+lower);
        System.out.println("numbers no is:"+numbers);
        System.out.println("special no is:"+special);
    }
}
