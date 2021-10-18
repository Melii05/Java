import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        ArrayList<String> alumnos= new ArrayList<String>();
    }

    public static void agregar(ArrayList<String> a) {
        Scanner nE = new Scanner (System.in);
        
        for (int i= 0; i <= 11; i++){
            System.out.println("Por favor introduzca el nombre del alumno agregar:");
            String n = nE.nextLine();
            a.add(n);
                        
        }
        nE.close();
    }    

    public static ArrayList<String> listar(ArrayList<String> a final int L) {
            List<List<T>> parts = new ArrayList<List<T>>();
            final int N = list.size();
            for (int i = 0; i < N; i += L) {
                parts.add(new ArrayList<T>(
                    list.subList(i, Math.min(N, i + L)))
                );
            }
            return parts;
        }
}
