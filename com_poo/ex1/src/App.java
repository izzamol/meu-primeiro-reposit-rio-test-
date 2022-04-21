import java.util.Scanner;

import intidades.retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height:");
        retangulo ret = new retangulo();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        ret.setLado(x);
        ret.setSubida(y);


        System.out.println(ret);
        
        System.out.println("=====================================");

        sc.close();
    }
}
