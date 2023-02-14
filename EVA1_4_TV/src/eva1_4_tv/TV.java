package eva1_4_tv;
public class TV {
    private int canal;
    private int volumen;
    private boolean power;
    //constructores
    public TV(){//constructor default
        volumen =0; 
        canal = 2;
        power = false; //apagado
    }
    //metodos para operar la TV (interfaz)
    //encender y apagar la TV
    public void cambiarEstadoPower(){
        //verifucar el estado de la TV
        if (power == true){
            power = false;
            System.out.println("Apagando pantalla");
        }else{
            power= true;
            System.out.println("Encendiendo pantalla");
        }
    }
    //volumen
    public void subirVolumen(){
        if (power){ //Tele prendida para poder manejar volumen
            if (volumen<100){ //Limite no excede de 100
        volumen = volumen + 1; //acumulador
        System.out.println("Volumen: " + volumen);
            }
        }
    }
        public void bajarVolumen(){
            if (power){
                if (volumen>0){
        volumen = volumen - 1; //acumulador
        System.out.println("Volumen: " + volumen);
            }
        }
    }
        public void subirCanal(){
            if (power){
                canal = canal + 1; //Subir canal
                if (canal>100){ //Cuando canal excede 100 te devuelve al 0
                    canal=0;
                }
                System.out.println("Canal: " + canal);
            }
        }
        public void bajarCanal(){
            if (power){
                canal = canal - 1;
                if (canal==0){ //Cuando canal baja de 0 devuelve al 100
                    canal=100;
                }
                System.out.println("Canal: " + canal);
            }
        }
}