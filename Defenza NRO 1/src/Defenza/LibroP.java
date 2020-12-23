package Defenza;
/**
 * @author Jhen
 */
public class LibroP {
    private String titulo,año,editorial;
    private int nroEdicion, nroPoemas;
    private String poe[][] = new String[4][50];
    public LibroP(){
       // System.out.println("Ingrese los Poemas");
       
        for (int i = 1; i <=8; i++) {
            poe[1][i]= Leer.dato();
            poe[2][i]= Leer.dato();
            poe[3][i]= Leer.dato();  
        }
    }
    //metodo llenar
    void mostrar(){
        System.out.println(" Titulo" +titulo);
         for (int i = 1; i <=8; i++) {
             System.out.println("1"+poe[1][i]+"2"+poe[2][i]+"3"+ poe[3][i]);    
        } 
    }
    void mostrarX(String autor){
        for (int i = 1; i <=nroPoemas; i++) {
            if (poe[3][i]==autor) {
                System.out.println("Poema "+poe[2][i]);
            }
        }
    }
}
