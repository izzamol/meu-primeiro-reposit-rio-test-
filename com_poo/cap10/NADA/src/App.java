import java.util.Scanner;

import intidades.terco;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Qual mecadoria vc quer ?:");
        System.out.println("    1-Terço;\n  2-Colar.");
        System.out.print("digite o numero da mercadoria");
        int w = sc.nextInt();
        if (w == 1){
        System.out.println("agora a quantidade desejada");
        int quantidade = sc.nextInt();

        if(quantidade > 1){
        System.out.println("todos são da mesma cor?(y/n):");
            sc.nextLine();
            String yOUn = sc.nextLine();
            terco[] vec = new terco[quantidade];

        
            if(yOUn != "y"){
                
                for (int i = 0; i < vec.length; i++ ){
                    System.out.println("Qual a cor do " + vec[(i+1)]+"° terço");
                    String cor = sc.nextLine();

                    vec[i] = new terco(cor);


                }

            }



        }
        }


        sc.close();
    }
}
