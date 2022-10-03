package Comp;

public class Calculator {

    public int bil1;
    public int bil2;

    public static int perkalian(int bil1, int bil2){
        return bil1 * bil2;
    }
    public static int pertambahan(int bil1, int bil2){
        return bil1 + bil2;
    }
    public static int pengurangan(int bil1, int bil2){
        return bil1 - bil2;
    }
    public static int pembagian(int bil1, int bil2){
        int result = bil1 / bil2;
        return result;
    }
}
