import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("DIGITE OS NUMEROS DA MATRIZ");
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat [i][j] = sc.nextInt();
            }
        }
        System.out.println("DIAGONAL PRINCIPAL");
        for (int i = 0; i < n; i++){
            System.out.print(mat[i][i]);

        }
        



        sc.close();
    }
}
