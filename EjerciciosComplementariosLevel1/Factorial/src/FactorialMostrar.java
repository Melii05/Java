import java.util.Scanner;

public class FactorialMostrar {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in);
        System.out.println("Ingrese el numero a factoriar: ");
        int num= nE.nextInt();
        System.out.println("El factorial del numero: " + num + " es " + factoriar(num));
        nE.close();

    }

    public static int factoriar (int nume) {
        if (nume < 0){
            System.out.println("El valor ingresado no se puede factorear");
            return 0;}
        else if (nume== 0){
            return 1;}
            else {
                return nume *= factoriar(nume -1);
            }
        }
}
