package intidades;

public class Product {
    private String produto ;
    private double valor ;

    //GETS
    public String getProduto() {
        return produto;
    }
   
    public double getValor() {
        return valor;
    }
    //CONSTRUTORES

    public Product(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Product [produto=" + produto + ", valor=" + valor + "]";
    }

    
}
