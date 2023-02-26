package eva1_17_sobrecarga_areas;

public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
        /*Los parámetros dados definirán el método al qe llamarermos, con
        estos se diferenciará un método de otro aunque tengan el mismo nombre*/
        System.out.println("Area círculo = " + area(5));
        System.out.println("Area triángulo = " + area(5, 10));
        System.out.println("Area trapecio = " + area(12, 8, 6));
    }
    /*Pese a que los métodos se llaman igual, a cada uno lo distingue los
    parámetros asignados, por lo que en fines prácticos no son el mismo y es 
    esto a lo que llamamos sobrecarga*/
    public static double area(double rad){      
        return (Math.PI*(rad*rad));
    }
    public static double area(double base, double altura){
        return ((base*altura)/2.0);
    }
    public static double area(double basemay, double basemen, double altura){
        return ((altura*(basemay+basemen))/2.0);
    }
}
    

