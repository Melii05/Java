import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in); 
        System.out.println("Por favor introduzca el primer número");
        int uno = nE.nextInt() ;
        System.out.println("Por favor introduzca otro número");    
        int dos = nE.nextInt() ;
        System.out.println("El resultado de la multiplicacion de los numeros ingresado es: " + sumaM(uno,dos));
        nE.close();
    }
    public static int sumaM (int num, int nm) {
        int valor=0;
        for (int i=1; i <=nm; i++){
            valor=num + valor;
        }
        return valor;

    }


}