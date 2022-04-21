package intidades;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;


    //calculo da média

    public double calculoDaMedia(){
        double c =nota1*0.3 + nota2*0.35 + nota3*0.35;
        
        return c;
    }
    public String aprovacao(){
        String texto;
        if(calculoDaMedia() >= 60){
             texto = "Passou!";
        }
        else{



             texto = "Não passou!";
        }

        return texto;
    }

    public String toString(){
        return " Nota final: "+ calculoDaMedia()
        
        + "\nStatus da aprovação: "+ aprovacao();
    }

}
