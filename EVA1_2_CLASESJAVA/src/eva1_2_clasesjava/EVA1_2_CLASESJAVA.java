package eva1_2_clasesjava;
public class EVA1_2_CLASESJAVA {
    public static void main(String[] args) {
        //Clase es la reeceta
        //Objeto es el platillo
        //Instanciacion
        //1.- Declarar el identificador para el objeto
        //2.- Asignar memoria con new
        //3.- Invocar el constructor
        //Persona() --> constructor de clase
        //Constructor = metodo
        
        //Persona 1
        Persona perso1 = new Persona();
        //System.out.println(perso1);
        //Atributos con modificador default para tener acceso
        /* perso1.nombre = "Angel";
        perso1.apellido = "Arizpe";
        perso1.edad = 18;
        perso1.estadoCivil = false; //false es soltero, true es casado
        System.out.println(perso1.nombre); */
        
        /*Los sout estan en comentarios porque luego se agilizo la llamada 
        de datos con la funcion imprimir datos*/
        perso1.setNombre("Angel Eduardo");
        //System.out.println("Nombre:" + perso1.getNombre());
        perso1.setApellido("Arizpe Carrillo");
        //System.out.println("Apellidos:" + perso1.getApellido());
        perso1.setEdad(18);
        //System.out.println("Edad:" + perso1.getEdad());
        perso1.setEstadoCivil(false);
        //System.out.println("Estado civil:" + perso1.getEstadoCivil());
        perso1.imprimirDatos();
        
        //Persona 2
        Persona perso2 = new Persona();
        perso2.setNombre("Eduardo Eli");
        perso2.setApellido("Madrid Almaraz");
        perso2.setEdad(19);
        perso2.setEstadoCivil(false);
        perso2.imprimirDatos();
    }
    
}
