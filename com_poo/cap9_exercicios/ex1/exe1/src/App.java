import java.util.Scanner;
import intites.Dados;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dados pessoa1;

        System.out.print("Enter accout number:");
        int numeroDaConta = sc.nextInt();

        System.out.print("Enter accout houlder:");
        sc.nextLine();
        String nomeDoTitular = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        char youn = sc.nextLine().charAt(0);

            if (youn == 'y'){
                System.out.println("Enter com o valor de deposito inicial:");
                double depositoInicial = sc.nextDouble();

                pessoa1 = new Dados(numeroDaConta, nomeDoTitular, depositoInicial);

            }
            else{
                pessoa1 = new Dados(numeroDaConta, nomeDoTitular);
            }
         System.out.println(pessoa1.toString());

        System.out.print("Enter a deposit value: ");
        double amout = sc.nextDouble();
        
        pessoa1.deposito(amout);


        System.out.println(pessoa1.toString());

        System.out.print("Enter a whithdraw, valueu:");
        amout = sc.nextDouble();

        pessoa1.saque(amout);
        System.out.println(pessoa1.toString());


        sc.close();

    }
}
