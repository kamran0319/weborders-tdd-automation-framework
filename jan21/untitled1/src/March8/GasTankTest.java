package March8;

public class GasTankTest {
    public static void main(String[] args) {


        GasTank gastank = new GasTank(50.0);
        gastank.addGas(20);
        gastank.addGas(20);
        gastank.useGas(3);
        gastank.useGas(3);
        gastank.useGas(3);
        gastank.useGas(3);
        gastank.useGas(3);
//        gastank.useGas(3);
//        gastank.useGas(3);
//        gastank.useGas(3);
        System.out.println(gastank.isEmpty());
        System.out.println(gastank.isFull());
        System.out.println(gastank.getGasLevel());
        System.out.println(gastank.fillUp());
//        System.out.println(gastank.amount);
//        System.out.println(gastank.capacity);


    }
}