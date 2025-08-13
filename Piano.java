
package javaapplication1;

public class Piano extends Instrumento {
    
    public Piano (String nombre){
        super(nombre);
    }
    
    public void tocarSonido(){
        System.out.println("clin clin clin");
    }
    
    public void ejecutarCancion(){
        System.out.println(nombre+ " ejecutando... Satie - Trois Gymnopédies: No. 1, Lent et douloureuxTunde Kakuk");
    }
}