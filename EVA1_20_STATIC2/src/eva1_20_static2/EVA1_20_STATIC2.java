package eva1_20_static2;

public class EVA1_20_STATIC2 {

    public static void main(String[] args) {
        final int x;
        x=100;
        //x=200; --> Esto no es posible, porque ya se asignó una vez el valor
        FormulasGeometria formulas = new FormulasGeometria();
        /*formulas. --> Este objeto no nos sirve de nada, ya que todo lo que 
        creamos es estatico y no necesitamos crear un objeto para usarlo*/
        System.out.println("PI: " + FormulasGeometria.PI);
        System.out.println("Area del triángulo: " + FormulasGeometria.areaTriangulo(5.0, 10.0));
        System.out.println("Volumen de la esfera: " + FormulasGeometria.volumenEsfera(6.0));
    }
    
}
