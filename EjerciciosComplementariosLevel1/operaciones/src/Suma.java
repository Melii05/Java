import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in); 
        System.out.println("Por favor introduzca el primer número");
        float uno = nE.nextFloat() ;
        System.out.println("Por favor introduzca otro número");    
        float dos = nE.nextFloat();
        System.out.println ("La suma de los números es " + (uno + dos));
        nE.close();
    }
}