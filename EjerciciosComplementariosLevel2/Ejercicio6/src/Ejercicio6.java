import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Persona> empleado= new HashSet<>();
        empleado.add(new Persona("Jose Luis", 33456789, 12, 850));
        empleado.add(new Persona("Selena Furriel", 31456789, 32, 800));
        empleado.add(new Persona("Jara Mendez", 30456789, 94, 950));

        Map <Integer, Float> sueldo= new HashMap<>();
        valor(sueldo, empleado);                
        System.out.println("El salario de los empleados es: ");
        sueldoM(sueldo,empleado);
        
    }

    public static void valor(Map<Integer, Float> s, HashSet<Persona> e) {
        
        for (Persona pe: e){
            float tot= pe.horasT* pe.valorH;
            s.put(pe.dni, tot);
        }
        
    }
    public static void sueldoM(Map<Integer, Float> s, HashSet<Persona> e) {
        
        for (Persona pe: e){
            System.out.println("De " + pe.nomAp + " : $" + s.get(pe.dni));
            
        }
        
    }
    
        
    
}

class Persona{
    String nomAp;
    int dni;
    float horasT;
    float valorH;
    
    public Persona(String nAp, int d, float hT, float vH){
        this.nomAp= nAp;
        this.dni = d;
        this.horasT = hT;
        this.valorH = vH;

    }



}
