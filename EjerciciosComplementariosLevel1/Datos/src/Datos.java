import java.util.Scanner;
public class Datos {
    public static void main(String[] args) {
        String a[] ={"Nombre", "Apellido", "Edad", "Dirección" ,"Ciudad"};
        String n[]= new String[5];
        Scanner nE = new Scanner (System.in);
        Imprimir(a[0]); 
        n[0] = nE.nextLine();
        Imprimir(a[1]);
        n[1] = nE.nextLine ();
        Imprimir(a[2]);;
        n[2] = nE.nextLine ();
        Imprimir(a[3]);
        n[3] = nE.nextLine ();
        Imprimir(a[4]);
        n[4] = nE.nextLine ();
        Mostrar(n);
        
        nE.close();
    }
    public static void Imprimir (String a) {
        System.out.println("Por favor introduzca su " + a + ":");
    }

    public static void Mostrar (String []a) {
        System.out.println(a[4] +" - " + a[3] + " - " + a[2] +" - " +a[0] +" " +a[1]);
    }

}