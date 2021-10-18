import java.util.Scanner;
public class mayuscula {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in);
        System.out.println("Por favor introduzca la palabra a convertir en Mayuscula");
        String palabra = nE.nextLine ();
        System.out.println("La palabra convertida en Mayuscula es: " + mayuS(palabra));

        nE.close();
    }

    public static String mayuS(String a){

        String may = "";
    
        for (int i = 0; i< a.length(); i++){
    
            char caracter = a.charAt(i);
            if (caracter >= 'a' && caracter <= 'z'){
                caracter =  (char) (caracter - 'a' + 'A');; 
            }
            may = may + caracter;    
        }
        return may;
    }    
}