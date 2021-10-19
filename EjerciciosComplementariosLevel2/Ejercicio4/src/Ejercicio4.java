import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos= new ArrayList<>();
        agregar(alumnos);
        ArrayList<String> parts1= lista(alumnos,0);
        ArrayList<String> parts2= lista(alumnos,4);
        ArrayList<String> parts3= lista(alumnos,8);

        System.out.print("La lista original de nombre de alumnos es: ");
        mostrar(alumnos,12);
        System.out.print("La primera lista de nombre de alumnos es: ");
        mostrar(parts1,4);
        System.out.print("La segunda lista de nombre de alumnos es: ");
        mostrar(parts2,4);
        System.out.print("La tercera lista de nombre de alumnos es: ");
        mostrar(parts3,4);
    }

    public static void agregar(List<String> a) {
        Scanner nE = new Scanner (System.in);
        
        for (int i= 0; i <= 11; i++){
            System.out.println("Por favor introduzca el nombre del alumno agregar:");
            String n = nE.nextLine();
            a.add(n);
                        
        }
        nE.close();
    }
   
    public static ArrayList<String> lista(ArrayList<String> a, int n) {

        ArrayList<String> arrayList = new ArrayList<String>();
        int m= n + 4;
        for  (int i= n; i < m; i++ ){
            arrayList.add(a.get(i));
                    
        }        
        return arrayList;
            
    }
    public static void mostrar(ArrayList<String> a, int n) {

        for  (int i= 0; i < n; i++ ){
            System.out.print(a.get(i) + " ");
                    
        }
        System.out.println();
                   
    }
}