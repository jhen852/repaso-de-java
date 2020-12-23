package Condicional;

import javax.swing.JOptionPane;

/**
 * @author Jhen
 */
public class Condicional {
    public static void main(String [] args){
        int numero, dato = 5;
        //para introducir datos por grafico, ventanas emergentes
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero :"));
        //input porque es de entrada
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Son diferentes");
        }
        
        
                
    }
}
