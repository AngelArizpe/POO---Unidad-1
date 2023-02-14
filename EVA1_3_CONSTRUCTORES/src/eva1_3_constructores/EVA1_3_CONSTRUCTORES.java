package eva1_3_constructores;
public class EVA1_3_CONSTRUCTORES {
    
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("2", 40000000, "Carlos Slim");
        
        /*Datos de cliente en comentarios para inicializarlos desde el 
        constructor*/
        
        /*cuenta1.setNombre("Carlos Slim");
        cuenta1.setNumCuenta("1");
        cuenta1.setSaldo(40000000);
        System.out.println("Datos del cliente:");*/
        
        /*Se crean nuevas variables que regresan los valores anteriormente 
        asignados en las otras variables*/
       
        String nombreClie = cuenta1.getNombre();
        System.out.println(nombreClie);
        String cuentanum = cuenta1.getNumCuenta();
        System.out.println(cuentanum); 
        double canti = cuenta1.getSaldo();
        System.out.println(canti);
        
        CuentaBancaria cuenta2 = new CuentaBancaria("3", 2, "Angel Arizpe");
        System.out.println("Datos del cliente:");
        System.out.println(cuenta2.getNombre());
        System.out.println(cuenta2.getNumCuenta()); 
        System.out.println(cuenta2.getSaldo());
        
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("Datos del cliente");
        System.out.println(cuenta3.getNombre());
        System.out.println(cuenta3.getNumCuenta());
        System.out.println(cuenta3.getSaldo());
    } 
}
