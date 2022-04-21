import java.util.Scanner;
import util.Cam; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.print("What is the dolar price? :");
        double price = sc.nextDouble();
        System.out.print("How dolars will be bouthg?: ");
        double quantity = sc.nextDouble();

        double real =  Cam.valor(price,quantity);

        System.out.println("========================");
        System.out.println(real);


        sc.close();
    }
}
