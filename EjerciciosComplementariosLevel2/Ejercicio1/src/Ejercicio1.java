import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList <String> ciudad= new ArrayList<String>();
        ciudad.add("Bariloche");
        ciudad.add("Córdoba"); 
        ciudad.add("Resistencia");
        Imprimir(ciudad);

    }

    public static void Imprimir (ArrayList <String> a) {
        for (int i = 0 ; i <= a.size() - 1; i++){
        System.out.println("#" + (i+1) + " - " + a.get(i));
        }
    }
}