package eva1_12_calificaciones;

public class EVA1_12_CALIFICACIONES {

    public static void main(String[] args) {
 
        System.out.println("Calificacion igual a 95: " + calif(95));
        System.out.println("Calificacion igual a 100: " + calif(100));
        System.out.println("Calificacion igual a 1000: " + calif(1000));
        System.out.println("Calificacion igual a 70: " + calif(70));
    }
    public static String calif(int num){
        
        String resu = " ";
        
        if((num>=91) && (num<=100)){
            resu = "A";
        }else if ((num>=81) && (num<=90)){
            resu = "B";
        }else if ((num>=71) && (num<=80)){
            resu = "C";
        }else if (num<=70){
            resu = "D";
        }else{
            resu = "Numero invalido";
        }
        return resu;
    }
}
