public class override {

    public static void main(String[] args) {
        override r=new override();
        r.add(10,20);
    }

    public int add(int a, int b){
        int sum=(a+b);
        System.out.println(sum);
        return sum;
    }
}
