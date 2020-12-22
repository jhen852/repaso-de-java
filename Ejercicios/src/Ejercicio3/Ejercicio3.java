
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float guille , luis ,juan , suma;
        System.out.println("Ingrese cuantos dolares tiene Guillermo");
        guille = leer.nextFloat();
        
        //
        
        luis = guille/2;
        juan = (luis + guille)/2;
        suma = guille+luis+juan;
        
        System.out.println("El total de dolares que tienes los 3 son "+suma);
        
        
        
    }
}
