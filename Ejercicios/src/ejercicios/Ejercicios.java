
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("**********EJERCICIOS 1********");
        int c1,c2,c3, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primera calificacion");
        c1 = leer.nextInt();
        System.out.println("Ingrese la segunda calificacion ");
        c2 = leer.nextInt();
        System.out.println("Ingrese la tercera calificacion ");
        c3 = leer.nextInt();
        suma = c1 + c2 + c3;
        System.out.println("\tLa suma de las tres calificaciones es :"+ suma);
    }
    
}
