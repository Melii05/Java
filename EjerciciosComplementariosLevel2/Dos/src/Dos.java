import java.util.ArrayList;
import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<Integer> (5);
        agregar(num);
        System.out.println("El tamaño de la lista original es: " + num.size());
        System.out.println("Los elementos de la lista original son: ");
        mostrar(num);
        num.add(0, 9);
        num.add(6, 8);
        System.out.println("El tamaño de la lista modificada es: " + num.size());
        System.out.println("Los elementos de la lista modificada son: ");
        mostrar(num);
        
    }

    public static void agregar(ArrayList<Integer> a) {
        Scanner nE = new Scanner (System.in);
        int n=0;        
        for (int i= 0; i <= 4; i++){
            System.out.println("Por favor introduzca el numero agregar:");
            n = nE.nextInt();
            a.add(n);
                        
        }
        nE.close();
    }
    public static void mostrar(ArrayList<Integer> a) {
        for (int i= 0; i <= a.size() - 1; i++){
            System.out.println(a.get(i));
        }

    }
}
