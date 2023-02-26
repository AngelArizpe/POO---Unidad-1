package eva1_16_sobrecarga2;

public class EVA1_16_SOBRECARGA2 {

    public static void main(String[] args) {
        /*Ambos metodos se llaman igual, Java distingue de acuerdo a los valores
        que especificas. No utilizara un metodo que actue con enteros
        cuando está recibiendo valores de tipo double, o string, etc.*/
        
        /*En el caso del metodo sin parámetros funciona porque no se especifican
        parámetros porque no los tiene, por lo que no llama a uno que si los tenga*/
        System.out.println("Suma: " + suma(4, 5));
        System.out.println("Suma: " + suma(4.0, 5.0));
        System.out.println("Suma: " + suma("Pollo ", "asado"));
        suma();
    }
    //La firma de este objeto es suma(int, int)
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    //La firma de este objeto es suma(double, double)
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    public static void suma(){
        System.out.println("Metodo sin parámetros suma");
    }
        
}
