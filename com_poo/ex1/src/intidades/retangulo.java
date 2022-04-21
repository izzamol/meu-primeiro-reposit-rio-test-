package intidades;

public class retangulo {
    private double lado;
    private double subida;





    public double getLado(){
        return lado;
    }
    public void setLado(double x){
        subida= x;
    }public void setSubida(double y){
        lado = y;
    }


    public double area(){
        return lado*subida;
    }   
    public double perimetro (){
        return (lado+subida)*2;
    }
    public double diagonal(){
        double d = Math.pow(lado, 2) + Math.pow(subida, 2);
        return Math.sqrt(d);
    }
    public String toString(){
        return "AREA = " + area()
            + "\nPERIMETRO = " + perimetro()
            +"\nDIAGONAL = " + diagonal();
    }

}
