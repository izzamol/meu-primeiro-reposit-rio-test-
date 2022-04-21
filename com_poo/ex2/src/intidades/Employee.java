package intidades;

public class Employee {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double netSalary(){
          
        
        return salarioBruto - salarioBruto*(imposto/100);

    }
    public void increaseSalary(double pocentagem){

        salarioBruto = this.salarioBruto + this.salarioBruto * (pocentagem/100) - salarioBruto*(imposto/100);
    }
    /**public String toString{
        return "Employee:"+  nome", $ "
    }*/

    public String toString(){
        return " Updated: "
            + nome
            +", $ "
            + salarioBruto;
    }

}   
