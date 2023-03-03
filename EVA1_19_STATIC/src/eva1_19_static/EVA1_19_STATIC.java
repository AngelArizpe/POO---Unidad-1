package eva1_19_static;

public class EVA1_19_STATIC {

    public static void main(String[] args) {
        //Static es algo que podemos usar sin crear instancias de una clase
        System.out.println("PI: " + Math.PI);
        System.out.println("Numero aleatorio" + Math.random());
        Utilerias utileria = new Utilerias();
        utileria.saludo();
        Utilerias.otrosaludo();
        
    }
    //No se puede usar en el main porque este no es estático y el main si lo es
    /*Si no se crea un objeto de esta clase, no existe el método, por lo que no
    se puede usar en el main*/
    public void Saludo2(){
        System.out.println("HOLA");
    }
}

class Utilerias{
    /*Este método existe hasta que se crea un objeto de la clase, solo se usa a 
    través de un objeto*/
    public void saludo(){
        System.out.println("Hola");
    }
    //Este método existe en cuanto arranca el programa y se puede utilizar
    //No necesita que se cree un objeto de la clase para poderlo utilizar
    //Se usa a través de la clase
    /*Los nombres de los métodos estáticos son únicos, hay solo un objeto
    de ese nombre que sea estático*/
    public static void otrosaludo(){
        System.out.println("Otro saludo static");
    }
}

class Otraclase{
    
}
