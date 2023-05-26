public class implementationInterfaceSon implements interfacefather, interfaceMother{

    @Override
    public void car() {
        System.out.println("kia seltos");
    }

    @Override
    public void money() {
        System.out.println("2 lakh");
    }

    public static void main(String[] args) {
        implementationInterfaceSon son=new implementationInterfaceSon();
        son.car();
        son.money();
    }
}
