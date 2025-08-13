
package javaapplication1;

public class Instrumento {
    public String nombre;
    
    public Instrumento (String nombre){
        this.nombre = nombre;
    }
    
    public void tocarSonido(){
        System.out.println(nombre+ "tocando sonido....");
    }
    
    public void ejecutarCancion(){
        System.out.println("Reproduciondo cancion...");
        
    }
}
