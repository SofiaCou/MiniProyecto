
package javaapplication1;

public class Bateria extends Instrumento {
    
    public Bateria (String nombre){
        super(nombre);
    }
    
    public void tocarSonido(){
        System.out.println("clin clin clin");
    }
    
    public void ejecutarCancion(){
        System.out.println(nombre+ " ejecutando... Jordan Cannata Drum Solo");
    }
}
