package matriz;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class Matriz {
    public static void main(String[] args) {
        // Matriz es simetrica
        int nFilas, nColumnas;
        Scanner leer = new Scanner(System.in);
        int [][]matriz = new int[50][50];// cuando das un tamaño
        System.out.println("Ingrese el numero de filas");
        nFilas = leer.nextInt();
        System.out.println("Ingrese el numero de columnas");
        nColumnas = leer.nextInt();
        
        for (int i = 1; i <= nFilas; i++) {
            for (int j = 1; j <= nColumnas; j++) {
                System.out.println("Ingrese elementos de la matriz");
                System.out.print("M ["+i+"]"+"["+j+"] = ");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Mostrar");
         for (int i = 1; i <=nFilas; i++) {
            for (int j = 1; j <=nColumnas; j++) {
                System.out.println("Matriz");
                System.out.print("M ["+matriz[i]+","+matriz[j]+"]" );
            }
            
        }
        
    }
    
}
