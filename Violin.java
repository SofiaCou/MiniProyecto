
package javaapplication1;

public class Violin extends Instrumento{
    
    public Violin (String nombre){
        super(nombre);
    }
    
    public void tocarSonido(){
        System.out.println("Scree scree");
    }
    
    public void ejecutarCancion(){
        System.out.println(nombre+ " ejecutando... The Swan|Saint-Saëns");
    }
}
