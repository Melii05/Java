import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Por favor introduzca el nombre de usuario");
        String nombre = "";
        Scanner nombreE = new Scanner (System.in); 

        nombre = nombreE.nextLine ();

        System.out.println ("Hola " + nombre );

    }
    }
