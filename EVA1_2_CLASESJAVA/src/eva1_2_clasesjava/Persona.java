package eva1_2_clasesjava;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //Metodos y comportamiento
    //Lectura y escritura
    //Metodos get --> obtener, metodo set --> escribir
    //Sintaxis de metodos: modificador valor de retorno nombre(argumentos)(implementacion)
    public String getNombre(){
        return nombre; 
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor2){
        apellido = valor2;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor3){
        edad = valor3;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(boolean valor4){
        estadoCivil = valor4;
    }
    public void imprimirDatos(){
        System.out.println("Datos almacenados:");
        //concatenacion
        //+ suma (numericos) + concatena <-- sobrecarga de operadores
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        if(estadoCivil)
            System.out.println("Estado civil: casado");
        else 
            System.out.println("Estado civil: soltero");
    }
}
