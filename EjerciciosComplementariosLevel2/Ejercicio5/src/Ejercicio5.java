import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horas= new ArrayList<>();
        ArrayList<Integer> valorHoras= new ArrayList<>();
        agregar(horas,"");
        agregar(valorHoras," el valor de");
        ArrayList<Integer> valor= new ArrayList<>(calcular(horas,valorHoras));
        System.out.print("Las horas trabajadas son: ");
        System.out.println(valor);
        System.out.print("Total Final: $");

        int tf= 0;
        for (Integer vr : valor){
            tf += vr;
        }
        System.out.print(tf);

    }

    public static void agregar(ArrayList<Integer> a, String s) {

        Scanner nE = new Scanner (System.in);
        for (int i= 0; i < 5; i++){
            
            System.out.println("Por favor ingrese" + s +" las horas trabajadas:");
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