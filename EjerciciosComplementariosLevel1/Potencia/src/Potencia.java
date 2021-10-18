import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in); 
        System.out.println("Por favor introduzca la base de la potencia:");
        int uno = nE.nextInt() ;
        System.out.println("Por favor introduzca el numero del exponente:");    
        int dos = nE.nextInt() ;
        System.out.println("El resultado de la potencia de los numeros ingresado es: " + potenciaM(uno,dos));
        nE.close();
    }
    public static int potenciaM (int num, int nm) {
        int valor=1;
        for (int i=1; i <=nm; i++){
            valor=num * valor;
        }
        return valor;

    }


}