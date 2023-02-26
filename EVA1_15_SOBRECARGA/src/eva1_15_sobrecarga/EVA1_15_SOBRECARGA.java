package eva1_15_sobrecarga;

public class EVA1_15_SOBRECARGA {

    public static void main(String[] args) {
        /*Diferentes println, son 10 diferentes metodospara imprimir diferentes 
        tipos de datos*/
        /*Hay diferentes tipos de println y es diferente imprimir un char, 
        a un string, a un booleano, etc */
        /*A esto se le llama sobrecarga, dandole funciones distintas al mismo 
        metodo pero con firmas unicas*/
        System.out.println("Hola mundo");
        System.out.println("152");
        System.out.println(true);
        System.out.println(args);
        //Al variar la firma del metodo, puede ser usado mas de una vez
    }   
}
