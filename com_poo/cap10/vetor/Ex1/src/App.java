import java.util.Scanner;


import entidades.aluno;

public class App {


    /* Lê 5 nomes e notas de uma turma,*/
    /* calcular e exibir a média das notas da turma e em seguida*/
    /* exibe a relação de nomes cuja nota é superior a esta média*/
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        aluno alu;
        

        System.out.println("quantos alunos vc vai subir a nota?: ");
        int n = sc.nextInt();
        aluno[] vec = new aluno[n];
        

        
        for (int i =0; i < vec.length; i++){
            System.out.println();
            System.out.println("Aluno #"+(i+1)+":");
           
            System.out.print("    Nome:");
           // sc.nextLine();
           sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("    Nota:");
            double nota = sc.nextDouble();
            

            alu = new aluno(nome, nota);

            vec[i] = alu;
        }
    
        double m = 0;

        //contagem de notas total
        for (int i =0; i < vec.length; i++) {
            m += vec[i].getNota();
        }
        System.out.println();
        System.out.println("-----------------");

        //media da sala
        System.out.println("A media da sala é: " + m/vec.length);

       //medias maiores q 6
       System.out.println("alunos à cima da media:");
        System.out.println("-----------------------------------");
        media(vec);
        System.out.println("------------------------------------"); 
    sc.close();  
    }

    //METODO PRA CALCULAR NOTA MAIS ALTA

    private static void media(aluno[] vec) {
        for (aluno aluno : vec) {
            if (6 <= aluno.getNota()  ){
                 System.out.println( aluno.getNome() +","+ aluno.getNota());
             }
             else{
 
             }

         }
    }

   

    


    
}
