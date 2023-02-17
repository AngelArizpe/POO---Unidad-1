package eva1_5_circulo;
public class Circulo {
    private double radio;
    private double perimetro;
    private double area;
    private double valor;
    private double valor2;
    
    public Circulo(){
        radio = 0;
        perimetro = 0;
        area = 0;
    }
    public Circulo(double rad){
        radio = rad;
        valor = ((rad*rad)*(3.1416));
        area = valor;
        valor2 = ((rad*2)*(3.1416));
        perimetro = valor2;
    }
    public double getArea(){
        return area;
    }
    public double getPerimetro(){
        return perimetro;
    }
}
