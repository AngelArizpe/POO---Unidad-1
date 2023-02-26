package eva1_18_sobrecarga_rfc;

public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
        String rfc = generarRFC("ANGEL", "ARIZPE", "CARRILLO", 2004, 05, 15);
        System.out.println(rfc);
        String rfc2 = generarRFC("ANGEL", "ARIZPE", 2004, 05, 15);
        System.out.println(rfc2);
        String rfc3 = generarRFC("ANGEL", 2004, 05, 15);
        System.out.println(rfc3);
    }
    public static String generarRFC(String nombre, String apePat, String apeMat, int año, int mes, int dia){
        String apP1 = apePat.charAt(0) + "";
        String apP2 = apePat.charAt(1) + "";
        String apM = apeMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP1 + apP2 + apM + nom + año + mes + dia + "";
        return rfc;
    }
    //Sobrecarga para si falta apellido materno
    public static String generarRFC(String nombre, String apePat, int año, int mes, int dia){
        String apP1 = apePat.charAt(0) + "";
        String apP2 = apePat.charAt(1) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP1 + apP2 + "X" + nom + año + mes + dia + "";
        return rfc;
    }
    public static String generarRFC(String nombre, int año, int mes, int dia){
        String nom = nombre.charAt(0) + "";
        String rfc = "X" + "X" + nom + año + mes + dia;
        return rfc;
    }
}
