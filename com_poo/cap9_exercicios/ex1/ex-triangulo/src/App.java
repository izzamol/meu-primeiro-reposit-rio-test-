import java.util.Scanner;

import intites.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("=========================================");
        System.out.println("QUAL OS LADOS DO SEU TRIANGULO \"X\": ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
        Triangulo t1 = new Triangulo(a, b, c);

        System.out.print("QUAL OS LADOS DO SEU TRIANGULO \"Y\" ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        Triangulo t2 = new Triangulo(a, b, c);
//resultados
        System.out.println("TRIANGULO X;\n" + t1.toString());
        System.out.println("TRIANGULO Y;\n" + t2.toString());
        
         if (t1.Area() > t2.Area()){
            System.out.println("TRIANBULO X É MAIOR");
        }
        else{
            System.out.println("TRIANBULO Y É MAIOR");
        }
        sc.close();
    }
}
