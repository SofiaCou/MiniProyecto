
package javaapplication1;

public class Guitarra extends Instrumento {
    
    public Guitarra(String nombre){
        super(nombre);
    }
    
    public void tocarSonido(){
        System.out.println("Strum strum");
    }
    
    public void ejecutarCancion(){
        System.out.println(nombre+ " ejecutando... Canon en Re ");
    }
}
