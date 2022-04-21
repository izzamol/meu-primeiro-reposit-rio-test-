import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("digite a ordem da matriz");
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        Integer[][] mat = new Integer [n][m];
        System.out.println("digite a matriz:");
        for (int i = 0; i < n;i++){
            for (int j = 0; j < m;j++){
                mat[i][j] = sc.nextInt();

            }
        }


        System.out.println("qual numero vc quer ver?");
        int x = sc.nextInt();

        

        System.out.println(encontreaNaMatriz(mat, x, n, m));
        System.out.println("---------------------");
        
        for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("a cima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("a baixo: " + mat[i+1][j]);
					}
				}
			}
		}

       // System.out.println(up(mat, x, n, m));

        sc.close();
    }

    public static String encontreaNaMatriz(Integer mat[][], int x, int n,int m){
        for (int i = 0; i < n;i++){
            for (int j = 1; j < m;j++){
                {

                    String t = i +","+j;
                    return t;
                }
               

            }
        } 
        return null;
    }

   
   
    
    public static String test(Integer mat[][], int x,  int n,int m){
        return encontreaNaMatriz(mat, x, n, m);
    }   


    public static String up(Integer mat[][], int x,  int n,int m) {
        
        for (int i = 1; i < n;i++){
            for (int j = 1; j < m;j++){
                if (mat [i][j] == x){
                    if (){
                   
                       return mat [(i-1)][(j)];
                 
                    
                }
               

            }
        } 
        return null;
       
    }

   /* public static String up(int mat[][], int x,  int n,int m){
        
        for (int i = 0; i < n;i++){
            for (int j = 0; j < m;j++){
                if (mat [encontreaNaMatrizI(mat, x, n, m)][i] == (mat [encontreaNaMatrizI(mat, x, n, m) - 1][i] ) && mat [encontreaNaMatrizJ(mat, x, n, m)][i] ==mat[ encontreaNaMatrizJ(mat, x, n, m)][i]  ){

                  
                
                   return ( +","+ ;
                }
                    
                    
                }
               

            }
        
        return null;*/
   
        


}
