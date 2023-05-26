public class inheritanceB extends inheritanceA{

    public void bonus(int bon){
        System.out.println(bon);
    }

    public static void main(String[] args) {

        inheritanceB b=new inheritanceB();
        b.salary(80000);
        b.bonus(50000);

    }
}
