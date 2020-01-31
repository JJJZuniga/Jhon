package tarea4;

import java.awt.Color;
import java.util.Scanner;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tarea4 {

    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        lista.add(new Persona());
        lista.add(5);
        lista.add(new Persona());
        (   (Persona)lista.get(0) ).setNombre("Juan");
        (  (Persona)lista.get(0)).setid(100);
        
        ((Persona)lista.get(0)).setActividad("estudiar");
        ((Persona)lista.get(0)).getFechas().add(new Date());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Pizarra p = new Pizarra();
//        Pizarra[] a = new Pizarra[5];
//        a[0]=new Pizarra();
//        Pizarra[][] m = new Pizarra[2][3];
//        m[0][0]=new Pizarra();
//        ArrayList<Pizarra> lista=new ArrayList();
//        lista.add(new Pizarra());

//        int opcion = 0;
//        ArrayList lista = new ArrayList();
//        while (opcion != 6) {
//            opcion = Integer.parseInt(
//                    JOptionPane.showInputDialog(""
//                            + "1-agregar pizarra\n"
//                            + "2-agregar rectangulo\n"
//                            + "3-lista de rectangulo\n"
//                            + "4- modificar largo rectangulo\n"
//                            + "5-eliminar nodo\n"
//                            + "6-salir")
//            );
//            if (opcion == 1) {
//                int l, a;
//                String t;
//                l = Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "Ingrese largo")
//                );
//                a = Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "Ingrese ancho")
//                );
//                t = JOptionPane.showInputDialog("textura");
//                    lista.add(
//                                new Pizarra(l,Color.WHITE,new Date(),a,t));
//            }
//            if (opcion == 2) {
//                int l, a;
//                String t;
//                l = Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "Ingrese largo")
//                );
//                a = Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "Ingrese ancho")
//                );
//                    lista.add(new Rectangulo(l,a));
//            }
//            if (opcion==3){
//                String s="";
//                for (Object o : lista) {
//                    if (o instanceof Rectangulo) {
//                       s+=""+lista.indexOf(o)+"- "+o+"\n"; 
//                    }
//                }
//                JOptionPane.showMessageDialog(null, s);
//            }
//            if (opcion==4) {
//               int l, p;
//                String t;
//                p= Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "posicion rectangulo")
//                );
//                l = Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "nuevo largo")
//                ); 
//                if (lista.get(p) instanceof Rectangulo){
//                    l = Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "nuevo largo")
//                    );
//                    ((Rectangulo)lista.get(p)).setLargo(l);
//                }
//            }
//            if (opcion==5){
//                int p;
//                p= Integer.parseInt(
//                        JOptionPane.showInputDialog(""
//                                + "posicion rectangulo")
//                );
//                lista.remove(p);
//            }
//        }

    }
//    static void metodo(Pizarra param){
//        
//    }
//    static Pizarra metodo2(){
//     Pizarra p = new Pizarra();
//     p.setColor(java.awt.Color.YELLOW);
//     return p;
//    }
}
