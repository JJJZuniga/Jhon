/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rosa
 */
public class Persona {
    
    private int id;
    private String nombre;
    private Date fecha;
    private ArrayList<String>Actividades=new ArrayList();
    private ArrayList<Date>Fechas=new ArrayList();
    
    
 public Persona (){
     
 }
 public Persona (int c, String nombre, Date f){
     id=c;
     this.nombre=nombre;
     setFecha(f);
 }
 public void setid(int c){
     id=c;
 }
 public int getid(){
    return this.id;
 }
  public void setNombre(String n){
     nombre=n;
 } 
  public String getNombre(){
     return this.nombre;
 } 
   public void setFecha(Date f){
       Date v=new Date();
       if ((v.getYear()-f.getYear())<=100) {
           fecha=f;
       }
   } 
   public Date getFecha(){
       return this.fecha;
   }
   public void setActividades(ArrayList<String> a){
       Actividades=a;
   }
   public void setActividad(String a){
       Actividades.add(a);
   }
   public ArrayList<String> getActividades(){
       return Actividades;
   }
   public String getActiviad(int p){
       return Actividades.get(p);
   }
    public void setFecha(ArrayList<Date>f){
        Fechas=f;
    }       
    public ArrayList<Date> getFechas(){
        return Fechas;
    }
    public String toString(){
        return "identificacion="+id+" nombre="+nombre;
    }
}
