public class dupinarray {

    public static void main(String[] args) {

        String [] str={"Navnath","Komal","Dattaraj","Rani","Swapnil","Varsha", "Swapnil","Nishant","Komal"};

        for(int i=0; i<=str.length-1; i++){

            for(int j=i+1; j<=str.length-1; j++){

                if(str[i].equals(str[j])){
                    System.out.println("found duplicate: "+str[j]);
                }
            }
        }
    }
}
