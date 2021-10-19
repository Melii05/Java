import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horas= new ArrayList<>();
        ArrayList<Integer> valorHoras= new ArrayList<>();
        System.out.println("Por favor ingrese las horas trabajadas:");
        agregar(horas);
        System.out.println("Por favor ingrese el valor de las horas trabajadas:");

        agregar(valorHoras);
        ArrayList<Integer> valor= new ArrayList<>(calcular(horas,valorHoras));
        System.out.println(valor);
        System.out.print("Total Final: $");

        int tf= 0;
        for (Integer vr : valor){
            tf += vr;
        }
        System.out.print(tf);

    }

    public static void agregar(ArrayList<Integer> a) {

        Scanner nE = new Scanner (System.in);
        for (int i= 0; i < 5; i++){
            
            Integer n = nE.nextInt();
            a.add(n);
                        
        }
        
    }
   
    public static ArrayList<Integer> calcular(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n=0;
        for  (int i= 0; i < 5; i++ ){
            n=(a.get(i) * b.get(i));
            arrayList.add(n);
            
        }        
        return arrayList;
            
    }

}