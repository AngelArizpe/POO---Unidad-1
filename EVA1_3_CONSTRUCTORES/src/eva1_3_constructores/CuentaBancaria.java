package eva1_3_constructores;
public class CuentaBancaria {
    //atributos de clase privados
    private String numCuenta;
    private double saldo;
    private String nombre;
    //constructores
    //Los contructores se llaman igual que la clase
    //default y con argumentos
    public CuentaBancaria(){ //constructor default
        //Inicializar valores
        //En este caso para una cuenta desde 0 (datos vacios)
        numCuenta = "----";
        saldo = 0;
        nombre = "----";
    }
    /*Los metodos se pueden llamar igual solo si lo de dentro de los 
    parentesis (argumentos) es diferente*/
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        numCuenta = nCuenta;
        saldo = otroSaldo;
        nombre = nCliente;
    }
    //metodos get y set
    public String getNumCuenta(){
        return numCuenta;
    }
    public void setNumCuenta(String valor){
        numCuenta = valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double valor2){
        saldo = valor2;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor3){
        nombre = valor3;
    }
    
}
