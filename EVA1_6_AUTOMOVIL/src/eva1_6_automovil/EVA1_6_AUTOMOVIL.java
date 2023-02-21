package eva1_6_automovil;
public class EVA1_6_AUTOMOVIL {
    public static void main(String[] args) {
        
        //Creacion del objeto
        Auto auto1 = new Auto("Hot wheels", "76 Bugatti Chiron", "I-LOVE-TACOS", 2017, "Jose Jose");
        
        //Llamada a los metodos para imprimir los datos
        System.out.println("Datos del auto:");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Placas: " + auto1.getPlacas());
        System.out.println("Año: " + auto1.getAño());
        System.out.println("Dueño: " + auto1.getDueño());
        System.out.println("Adeudo: " + auto1.getAdeudo());
    }
}
