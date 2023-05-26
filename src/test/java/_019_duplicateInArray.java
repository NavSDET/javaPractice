public class _019_duplicateInArray {

    public static void main(String[] args) {

        String[] ar={"java","cplus","c","python","java","csharp"};

        for(int i=0; i<=ar.length-1; i++){
            for(int j=i+1; j<=ar.length-1; j++){
                if(ar[i].equals(ar[j])){
                    System.out.println("found duplicate"+ar[i]);
                }
            }
        }
    }
}
