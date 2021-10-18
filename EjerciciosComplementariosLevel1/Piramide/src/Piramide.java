import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num= nE.nextInt();
        linea(num);
        nE.close();

    }

    public static void linea (int valor) {
        
        for (int j=1; j <= valor; j++){ 
            for (int i= 1; i <= j; i++ ){ 
                System.out.print( i + " ");
            }
        System.out.println();
              
        }
    }
}
