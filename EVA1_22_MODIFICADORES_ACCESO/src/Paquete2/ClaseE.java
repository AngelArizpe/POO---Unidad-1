package Paquete2;
import Paquete1.ClaseA;
import Paquete1.ClaseC;        
//Clases B y D son default, no pueden verse en otro paquete (osea este paquete 2)

public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void Prueba(){
    
    //Clase A está en otro paquete y hay que usar la clausula import
    //Clase A es pública (visible en todo java)
    ClaseA objA = new ClaseA();
    //objA.publicA; --> Ahora visible con el import
    //objA.defaultA; --> Visible solo en el paquete 1
    
    //ClaseB es default y es invisible para las clases de este paquete, ni con import
    //ClaseB objB = new ClaseB();
    
    //Clase C está en otro paquete y hay que usar la clausula import
    //ClaseC es pública (visible en todo java)
    ClaseC objC = new ClaseC();
    //objC.publicC; --> Ahora visible con el import
    //objA.defaultC; --> Visible solo en el paquete 1
    
    
    //ClaseD es default y es invisible para las clases de este paquete, ni con import
    //ClaseD objD = new ClaseD();
    
    //Clase B es default (visible en el paquete)
    ClaseF objF = new ClaseF();
    //objF.defaultF; --> Es visible 
    //objF.publicF; --> Es visible 
    }   
}
class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}
