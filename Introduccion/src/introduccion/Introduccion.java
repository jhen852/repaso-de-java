package introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhen
 */
public class Introduccion {
    
    public static void main(String[] args) {
        String cadena;
        int numero;
        char caracter;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("digite una cadena");
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un NUMERO"));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite una  double"));
        
        //aqui estamos imprimiendo
        
        
        JOptionPane.showMessageDialog(null, "la cadena es "+cadena);
    }
    
}
