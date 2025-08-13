
package javaapplication1;

public class Flauta extends Instrumento {
   
    public Flauta(String nombre){
        super(nombre);
    }
    
    public void tocarSonido(){
        System.out.println("tuuuu tuuuu");
    }
    
    public void ejecutarCancion(){
        System.out.println(nombre+ " ejecutando... Scarborough fair");
    }
}

