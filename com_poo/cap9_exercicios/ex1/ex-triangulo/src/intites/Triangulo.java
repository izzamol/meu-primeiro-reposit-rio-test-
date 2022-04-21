package intites;

public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
/*
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }*/

    /*public void P (){
        double p = (a + b + c) / 2;
    }*/

    public double Area() {
        double p = (a + b + c) / 2;

        return Math.sqrt(p* ((p - a) * (p - b) * (p-c)));
    }

    public void  Cel(double cel){
        double k;
        
    }

    public double Perimetro(){
        return a+b+c;
    }




    public String toString() {

        return "Area do triangulo: "+ Area()+"\n====================================\n";
    }
    


}
