import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner nE = new Scanner (System.in);
        ArrayList<String> m= new ArrayList<String>();
        System.out.println("Ingrese el primero número entero para realizar el calculo: ");
        Integer i = nE.nextInt();
        System.out.println("Ingrese el segundo número entero que debe ser mayor que el anterior: ");
        Integer f = nE.nextInt();
        while (i < 1 || i > f){
            System.out.println("Error! Los números ingresados son incorrectos, vuelva a intentarlo."); 
            System.out.println("Ingrese, dos números para realizar el calculo, donde el primero debe ser menor que el segundo");
            i = nE.nextInt();
            f = nE.nextInt(); 
        }
        System.out.println(fizzBuzzFuncion(m,i,f));
        nE.close();
    }

    public static ArrayList<String> fizzBuzzFuncion(ArrayList<String> s,int i, int f){
        
        for (int o=i; o < f; o++){  
            if (o % 2 == 0 && o % 3 == 0 ){
                s.add("FizzBuzz");
            }
            else if (o % 2 == 0 ){
                    s.add("Fizz");
                }
            else if (o % 3 == 0){
                    s.add("Buzz");
                }
            else{
                s.add(Integer.toString(o));
            }

        }
        return s;
    }
   
}
