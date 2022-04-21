package intites;



public class Dados {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;


    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public String getNomeDoTitular() {
        return nomeDoTitular;
    }


    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    public double getSaldo() {
        return saldo;
    }

    public Dados(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }


    public Dados(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        deposito(depositoInicial);
        
    }

    //FUNÇÕES

    

    public void deposito(double amout){
        saldo += amout;
    }
    public void saque(double amout){
        saldo -= amout + 5;
    }


    @Override
    public String toString() {
        return "\n \nUp date:\n" +
        "Numero da conta: "+ numeroDaConta
        + ", titular da conta:" + nomeDoTitular 
        + ", saldo:" + saldo;
    }

    
    }
    
    

    
    



   
   



