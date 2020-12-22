
package Ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Calcule el salario semanal de un empleado a partir de 
        // sus horas semanales trabajadas y de su salario por hora
        
        // SALARIO SEMANAL, HRS SEMANALES TRABAJADAS , SU SALARIO X HRS
        // cuantas hrs trabaja, cuanto le pagan por esas hrs, y cuanto gana a la semana
        Scanner leer = new Scanner (System.in);
        int horasTrabajo;
        float salarioXHrs, salarioXSemana;
        System.out.println("Cuantas hrs trabajo semanales ");
        horasTrabajo = leer.nextInt();
        System.out.println("Cual es salario por hora ");
        salarioXHrs = leer.nextFloat();
        //pago por hora
        salarioXSemana = horasTrabajo*salarioXHrs;
        System.out.println("Le cancelaron por semana "+salarioXSemana);
        
        
        
    }
}
