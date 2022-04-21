import java.util.Scanner;

import intidades.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Me diz ai quantos produtos vc quer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("----------------------------------------");

        Product[] vetor = new Product[n];

        for (int i = 0; i < n; i++){
            
            System.out.print("me diz o produto: ");
            sc.nextLine();
            String produto = sc.nextLine();
            System.out.print("me diz o valor: ");
            double valor = sc.nextDouble();

            vetor[i] = new Product(produto, valor);

        }
        for (int i = 0; i < n; i++){
            System.out.println(vetor[i].toString());
        }
        double soma= 0.0;

        for(int i = 0; i < n; i++){
            soma += vetor[i].getValor();

        }
        double sd = soma/n;
        System.out.println("\n soma é:" +sd);







        sc.close();
    }
}
