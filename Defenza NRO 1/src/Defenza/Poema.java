package Defenza;
import java.util.Scanner;
/**
 * @author Jhen
 */
public class Poema {
    private String titulo,texto,autor;

    public Poema(String titulo, String textp, String autor) {
        this.titulo = titulo;
        this.texto = textp;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getTextp() {
        return texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTextp(String textp) {
        this.texto = textp;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    void mostrar(){
        System.out.println("Mostrar el Poema");
        System.out.println("Titulo "+titulo+
               "\nTexto"+texto+
               "\nAutor"+autor);
    }
}
