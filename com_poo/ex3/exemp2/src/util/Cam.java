package util;

public class Cam {
    public static double valor(double price, double quantity){
        double v2 = price * quantity;

        return v2 - v2*0.06;


    }
}
