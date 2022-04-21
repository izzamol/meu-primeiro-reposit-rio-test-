import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //numero de atributos do vetor

            double []vec = new double[n]; //declarando  o vetor

            for (int i = 0; i<n; i++ ){
                vec[i]=sc.nextDouble();
            
            //laço for usado para escanear todas as casas do vetor
            }

            double soma = 0.0;
            for ( int i = 0; i<n; i++){
                soma += vec[i];

                // somando todas as casdos vetores
            }
            soma = soma /n;
            System.out.println("\n"+ soma);
        sc.close();
    }
}
