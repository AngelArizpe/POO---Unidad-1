package eva1_20_static2;

public class FormulasGeometria {
    //Declaramos la constante PI para darle otro uso al static
    //Tiene significado para clases y para variables
    /*Cuando se usa para variables, solo se puede asignar una vez un valor a la 
    variable*/
    public static final double PI = 3.14159;
    
    
    public static double areaTriangulo(double base, double altura){
        return ((base*altura)/2);
    }
    public static double areaCirculo(double radio){
        return PI*radio*radio;
    }
    public static double periCirculo(double radio){
        return PI*radio*2;
    }
    public static double volumenEsfera(double radio){
        return ((4.0/3.0)*(PI)*(radio*radio*radio));
    }
}
