public class vBike extends vehicle{

    void run(){
        System.out.println("Runs at 80 Kmph");
    }

    public static void main(String[] args) {
        vBike b=new vBike();
        b.run();
    }
}
