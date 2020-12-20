/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariableNoPrimitivos;
import java.util.Scanner;
/**
 *
 * @author Jhen
 */
public class VariableNoPrimitivos {
    public static void main(String[] args){   
        Scanner entrada = new Scanner (System.in);
        //guardar cadena 
        String cadena;
        System.out.println("ingrese una cadena");
        cadena = entrada.nextLine();
        System.out.println("la cadena es "+cadena);
        char letra ;
        System.out.println("ingrese una letra");
        letra = entrada.next().charAt(0);
    }
}
