public class frequencyOfEChar {

    public static void main(String[] args) {

        String str="I am expert in Automation";
        char[] ch=str.toCharArray();
        int[] freq=new int[str.length()];
        for(int i=0; i<=ch.length-1; i++){
            freq[i]=1;
            for(int j=i+1; j<=ch.length-1; j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]=0;
                }
            }
        }

        for(int i=0; i<=freq.length-1; i++){
            if(ch[i]=='e' && ch[i]!=0){
                System.out.println(ch[i]+"    "+freq[i]);
            }
        }
    }
}
