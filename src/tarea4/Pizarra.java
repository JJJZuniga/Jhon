package tarea4;


import java.awt.Color;
import java.util.Date;
/**
 * 
 * @author Jarod Zuniga
 */
public class Pizarra {
    
    
    private int x;
    private Color col;
    private Date fecha;
    private int y;
    private String mate;
    
    public Pizarra(int x,Color col,Date fecha,int y,String mate) {
    }
    
    public int getLargo() {
        return x;
    }

    public void setLargo(int x) {
        this.x = x;
    }
    public Color getColor() {
        return col;
    }

    public void setColor(Color col) {
        this.col = col;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAncho() {
        return y;
    }

    public void setAncho(int y) {
        this.y = y;
    }


    public String getMaterial() {
        return mate;
    }

    public void setMaterial(String mate) {
        this.mate = mate;
    }

    private void Eliminar(){
        System.out.println("Eliminando datos de la pizarra");
    }
    private void Draw(){
        System.out.println("dibujo");
    }
    private void color(){
        System.out.println("Aqui se colorea la pizarra");
    }
}
