package eva1_13_alcance;

public class EVA1_13_ALCANCE {

    public static void main(String[] args) {
        int x=100; //visible para todo lo que este dentro del main
        for (int i = 0; i < 10; i++) { //inicia ciclo for
            System.out.println("i = " + i);
            System.out.println("j = " + j); //j no es visible antes de declararla
            int j = 100; //j es visible a partir de aqui
            System.out.println("x = " + x); //es visible en todo el main, y for esta dentro del main
            {
            int z = 1000;
                System.out.println("z = " + z);
            }
            
        } //Termina ciclo for
        System.out.println("z = " + z);
        //z no se encuentra fuera del bloque for, por lo que no puede ser vista dentro del mismo
        System.out.println("i = " + i); 
        //i no existe fuera del bloque for, por lo que no puede ser vista           
        System.out.println("j = " + j);
        //j no puede ser vista fuera del bloque for porque no está declarada fuera del mismo
    }
    public static void algo(){
        System.out.println("x = " + x); //no puede ser vista fuera del main por no estar declarada fuera de
    }
    
}
