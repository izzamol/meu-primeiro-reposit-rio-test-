package entidades;

public class aluno {
    private String nome;
    private Double nota;

    //Atributos
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    void notaMais(aluno vec[]){
       
            
        }


    /*public double mediaDeNotas(){
        double m;
        
        
        
        return m;
    }*/

    @Override
    public String toString() {
        
        return this.nome +"," + nota;
    }

    
    public void status( aluno[] vec ){
        for (aluno aluno : vec) {
            if (6 <= nota  ){
                 System.out.println( aluno.nome +","+ aluno.nota);
             }
             else{
 
             }

         }

     
    }
    /*
    public String getStatus(){
        return status();
    }*/    
}
