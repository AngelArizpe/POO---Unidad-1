package Paquete1;
import Paquete2.ClaseE;

public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        
        //Clase B es default (visible en el paquete)
        ClaseB objB = new ClaseB();
        //objB.defaultB; --> Es visible 
        //objB.publicB; --> Es visible
        
        //Clase C es pública (visible en todo java)
        ClaseC objC = new ClaseC();
        //objC.defaultC; --> Es visible 
        //objC.publicC; --> Es visible 
        
        //Clase D es default en otro archivo pero mismo paquete
        ClaseD objD = new ClaseD();
        //objD.defaultD; --> Es visible 
        //objD.publicD; --> Es visible 
        
        //Clase E está en otro paquete
        //Hay que agregar la clausula import para poder trabajar con la clase
        ClaseE objE = new ClaseE();
        //objE.publicE; --> Es el único visible de la Clase E porque está en todo java
        //El default no sale del paquete E, por lo que no es visible
        
        //ClaseF es default y es invisible para las clases de este paquete, ni con import
        //ClaseF objF = new ClaseF();
    }
}
class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;    
}