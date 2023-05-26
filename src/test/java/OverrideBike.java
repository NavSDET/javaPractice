public class OverrideBike extends OverrideVehicle{

    @Override
    void run() {
        System.out.println("Vehicle is running at 80 KM/HR");
    }

    public static void main(String[] args) {
        OverrideBike b=new OverrideBike();
        b.run();
    }

}
