import java.util.Scanner;
public class Contar {
    public static void main(String[] args) {
        Scanner fE = new Scanner (System.in); 
        System.out.println("Por favor introduzca la frase a analizar:");
        String frase = fE.nextLine ();
        System.out.println("Por favor introduzca la letra a calcular la cantidad de veces que aparece:");
        String letra = fE.nextLine ();
        System.out.println ("La cantidad de veces que aparece la letra: " + letra.toUpperCase() + " en la frase es: " + cant(frase, letra) );
        fE.close();
    }
    public static int cant(String a, String b){

        int may = 0;
        char c= b.charAt(0);
        for (int i = 0; i< a.length(); i++){
    
            char caracter = a.charAt(i);
            
            if (caracter == c){
                may = may + 1; 
            }
              
        }
        return may;
    }

}

