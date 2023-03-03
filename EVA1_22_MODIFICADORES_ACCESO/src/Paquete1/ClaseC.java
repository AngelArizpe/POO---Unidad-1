package Paquete1;
import Paquete2.ClaseE;

public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        
        //Clase A es pública (visible en todo java)
        ClaseA objA = new ClaseA();
        //objA.defaultA; --> Es visible 
        //objA.publicA; --> Es visible 
        
        //Clase B es default (visible en el paquete)
        ClaseB objB = new ClaseB();
        //objB.defaultB --> Es visible 
        //objA.publicB; --> Es visible 
        
        //Clase D es default (visible dentro del paquete)
        ClaseD objD = new ClaseD();
        //objD.defaultD; --> Es visible (está dentro del paquete)
        //objD.objD; --> Es visible (existe en todo java)
        
        //Clase E está en otro paquete y hay que usar la clausula import
        ClaseE objE = new ClaseE();
        //objE.publicE; --> Es el único visible de la Clase E porque está en todo java
        //El default no sale del paquete E, por lo que no es visible
        
        //ClaseF es default y es invisible para las clases de este paquete, ni con import
        //ClaseF objF = new ClaseF();
        
    }
}
class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}