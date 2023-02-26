package eva1_11_return;
public class EVA1_11_RETURN {

    public static void main(String[] args) {
        int resu;
        resu = square(10); //Invocacion o llamada a funcion
        System.out.println("Resultado:" + resu);
    }
    public static int square(int num){
        return num*num;
    }
}
