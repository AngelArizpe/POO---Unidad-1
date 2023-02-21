package eva1_6_automovil;
public class Auto {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    private int adeudo;
    
    //Constructor default con valores iniciales
    public Auto(){
        marca = "----";
        modelo = "----";
        placas = "----";
        año = 0;
        dueño = "----";
    }
    //Constructor con argumentos
    //El mismo nombre de las variables indica que son los que tienen argumentos
    public Auto(String marcaArg, String modeloArg, String placasArg, int añoArg, String dueñoArg){
        marca = marcaArg;
        modelo = modeloArg;
        placas = placasArg;
        año = añoArg;
        dueño = dueñoArg;
        
        //Determinio del adeudo en base al año
        /* Tambien es posible crear un metodo get introduciendo ahi la variable 
        adeudo y determinandolo ahi mismo, todo en un meetodo get que tambien 
        regrese el adeudo */
        
        //If else anidados
        if(año<=2000){
            adeudo = 1500;
        }else if((2001<=año) && (año<=2005)){
            adeudo = 2000;
        }else if((2006<=año) && (año<=2010)){
            adeudo = 2500;
        }else if((2011<=año) && (año<=2015)){
            adeudo = 3000;
        }else{
            adeudo = 4000;
        }
    }
    
    //Metodos get y set
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor2){
        modelo = valor2;
    }
    public String getPlacas(){
        return placas;
    }
    public void setPlacas(String valor3){
        modelo = valor3;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int valor4){
        año = valor4;
    }
    public String getDueño(){
        return dueño;
    }
    public void setDueño(String valor5){
        dueño = valor5;
    }
    public int getAdeudo(){
        return adeudo;
    }
}

