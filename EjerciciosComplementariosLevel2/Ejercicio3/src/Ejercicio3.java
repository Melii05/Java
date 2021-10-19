import java.util.Collections;
import java.util.ArrayList;


public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> cartas= new ArrayList<String>();
        agregar(cartas);
        System.out.println("Las cartas se mostraran en forma ordenada");
        imprimir(cartas);
        System.out.println("Las cartas se mostraran en forma inverso");
        imprimirIn(cartas);
        System.out.println("Las cartas se mostraran en forma desordenada");
        remover(cartas);
    }

    public static void agregar(ArrayList<String> a) {
        
        for (int i= 0; i <= 9; i++){
            a.add(String.valueOf(i+1));   
            
        }
      
        a.add("J"); 
        a.add("K"); 
        a.add("Q"); 
        a.add("A"); 
    }
    public static void imprimir(ArrayList<String> a) {
        
        for (int i= 0; i <= 13; i++){
            System.out.println(a.get(i));
                    
        }
    }
    public static void imprimirIn(ArrayList<String> a) {
        Collections.reverse(a);
        for (int i= 0; i <= 13; i++){
            
            System.out.println(a.get(i));
                    
        }
    }
    public static void remover(ArrayList<String> a) {
        Collections.shuffle(a);
        for (int i= 0; i <= 13; i++){
            System.out.println(a.get(i));
                    
        }
    }

}