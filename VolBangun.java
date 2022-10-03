package Comp;

public class VolBangun {
    public double bil1;
    public double bil2;
    public double bil3;

    public static double volBangun(double bil1, double bil2, double bil3){
        return bil1 * bil2 * bil3;
    }
    public static double volBangun(double bil1){
        double r3 = bil1*bil1*bil1;
        double resultBola = 3.14 * 4* r3;
        double lastResult = resultBola/3;
        return lastResult;
    }
    public static int volBangun(double bil1, double bil2){
        int bil3= (int) bil1;
        int bil4= (int) bil2;
        return bil3-bil4;
    }
}
