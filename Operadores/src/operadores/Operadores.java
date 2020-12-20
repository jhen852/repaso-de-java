package operadores;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class Operadores {
    public static void main(String[] args) {
        System.out.println("***********Operaciones**********");
        Scanner leer = new Scanner(System.in);
        float numero1,numero2;
        //hallar la suma de dos numeros
        float suma , resta, mult, div,resto;
        
        System.out.println("Ingrese los dos numero ");
        numero1 = leer.nextFloat();
        numero2 = leer.nextFloat();
        
       suma = numero1 + numero2;
         resta = numero1- numero2;
        mult = numero1* numero2;
        div = numero1/ numero2;
        resto = numero1% numero2;
        System.out.println(" La suma es "+suma);
        System.out.println(" La resta es "+resta);
        System.out.println(" La mult es "+mult);
        System.out.println(" La division es "+div);
        System.out.println(" La resto es "+resto);
        
        
    }
    
}
