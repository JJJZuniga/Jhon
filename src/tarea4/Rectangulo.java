
package tarea4;

/**
 *
 * @author Jarod Zuniga
 */
public class Rectangulo {
    
    private int largo;
    private int Ancho;
    
    public Rectangulo(int l, int Ancho){
        this.largo=l;
        this.Ancho=Ancho;
    }
    
    public int getLargo() {
        return largo;
    }
    public void setLargo( int largo) {
        this.largo=largo;
    }
    public int getAncho() {
        return Ancho;
    }
    public void setAncho( int Ancho) {
        this.Ancho=Ancho;
    }
    
    public String toString (){//(toString)representacion en cadena del objeto
        return "largo="+largo+" Ancho="+Ancho;
    }
    
    public int area(){
        return largo*Ancho;
    }   
    public int perimetro(){
        return largo*2+Ancho*2;
    }
    
    
    
}
