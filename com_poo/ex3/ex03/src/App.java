import java.util.Scanner;

import intidades.Estudante;

public class App {
    public static void main(String[] args) throws Exception {
        Estudante aluno1 = new Estudante();
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome?:");
        aluno1.nome = sc.nextLine();
        System.out.println("Quanto vc tirou nos 3 Trimestres ?: ");
        aluno1.nota1 = sc.nextDouble();
        aluno1.nota2 = sc.nextDouble();
        aluno1.nota3 = sc.nextDouble();
        System.out.println("============================================");

        System.out.println("");

        System.out.println(aluno1.toString());

        sc.close();
    }
}
