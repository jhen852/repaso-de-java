
package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         paga mensual = 1000
        comision = 150x cada carro
        5 % del valor del carro
       
        Ejercicio 4 : Hacer un programa que calcule e imprima
        el salario mensual de un vendedor dado
        */
        int carros , comision;
        double pagoExtra , valorCarro , totalGanancia;
        Scanner leer = new Scanner (System.in);
        System.out.println("Cuantos carros vendio el Personal de venta X");
        carros = leer.nextInt();
        System.out.println("El precio del carro");
        valorCarro = leer.nextDouble();
        comision = 150 * carros;
        pagoExtra = 0.05 * valorCarro; // es por un carro pero digamos que son 3 
        pagoExtra*=carros;
       totalGanancia = 1000+comision+pagoExtra;
        System.out.println("El pago mensual que recivira sera "+totalGanancia);
        
                
        
        
    }
}
