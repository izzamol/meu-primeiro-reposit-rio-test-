package intidades;

public class DadosPessoais {
    private String nome;
    private String email;
    private int numeroDoQuarto;

    // GETERS
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    // CONSTRUTORES
    public DadosPessoais(String nome, String email, int numeroDoQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroDoQuarto = numeroDoQuarto;

    }
    /*public DadosPessoais (){

    }*/
        // FUNÇÕES

    @Override
    public String toString() {
        return "=========================================\n\n"+
        "DadosPessoais:\n"+
        "Nome da pessoa:" + nome +
        "\nEmail:" + email +
        "\nNumero do quarto:"+ numeroDoQuarto;

    }
    
    

}
