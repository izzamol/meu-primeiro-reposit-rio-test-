import java.util.Scanner;



import intidades.DadosPessoais;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanntos quartos?(1/10): ");
        int n = sc.nextInt();
        System.out.println("============================================");

        DadosPessoais[] vec = new DadosPessoais[9];

        for (int i = 0; i < n; i++){

            System.out.print("Qual seu nome?: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Qual seu email?: ");
            String email = sc.nextLine();
            
            System.out.print("Qual quarto vc quer?: ");
            int numeroDoQuarto = sc.nextInt();

            vec[numeroDoQuarto] = new DadosPessoais(nome, email, numeroDoQuarto);
            System.out.println("===================================================");

        }

        for (int i = 0; i < vec.length; i++){

         if (vec[i] != null){
            System.out.println(vec[i].toString());
        }
        else{}

        
        }

    sc.close();
    }
}
