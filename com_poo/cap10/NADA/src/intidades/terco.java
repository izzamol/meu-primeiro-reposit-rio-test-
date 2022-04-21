package intidades;

public class terco {
    private String cor;
    private String modelo;
    private Integer quantidade;
    
    
    public terco(String modelo, Integer quantidade) {
        this.modelo = modelo;
        this.quantidade = quantidade;
    }


    public terco(String cor /*Integer quantidade*/) {
        this.cor = cor;

        /*this.quantidade = quantidade;*/
    }


    public String getCor() {
        return cor;
    }


    public String getModelo() {
        return modelo;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    
    
}
