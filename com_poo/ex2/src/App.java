import java.util.Scanner;

import intidades.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee data1 = new Employee();

        System.out.println("==================================");
        System.out.print("Nome do funcionario: ");
        data1.nome = sc.nextLine();

        System.out.print("Salario bruto: ");
        data1.salarioBruto = sc.nextDouble();

        System.out.print("Imposto tributario: ");
        data1.imposto = sc.nextDouble();

        System.out.println("Emploeeym:  " + data1.nome + ", " + data1.netSalary());

        System.out.println("");
        System.out.println("Which percentage to increase salary?: ");
        double pocentagem = sc.nextDouble(); 
        data1.increaseSalary(pocentagem);



        System.out.println("========================================");
        System.out.println(data1.toString());


        sc.close();
        
        
    }
}
