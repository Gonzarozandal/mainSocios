/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsocios;

import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class Tabla {
     private Nodo[] T;
     private int tamaño;
     double R = 0.618034;
     int numElementos;

    public Tabla() {
        this.tamaño = 97;
        this.T = new Nodo[tamaño] ;
        this.numElementos = 0;
        for (int k = 0; k < this.tamaño; k++) {
        this.T[k] = null;
    }
    }

    
    int dispersion(long x) {
    double t;
    int v;
    t = R * x - Math.floor(R * x); // parte decimal
    v = (int) (tamaño * t);
    return v;
  }
    
    
    public void insert(Socios x){
    
    int posicion= dispersion(x.getNumeroSocio());
     
     Nodo nuevo= new Nodo(x);
     
     nuevo.ptrSiguiente = this.T[posicion];
        this.T[posicion] =nuevo;
        this.numElementos++;
    
    }
    
    
    public Nodo buscar(int codigo) {
    Nodo p = null;
    int posicion = dispersion(codigo);
    
    if (T[posicion] != null) {
      p = T[posicion];
      while ((p.ptrSiguiente != null) && p.socio.getNumeroSocio() != codigo){
        p = p.ptrSiguiente;
      }
      
      if (p.socio.getNumeroSocio() != codigo) {
        p = null;
      }
      
    }
    return p;
  }
    
    
    public void Eliminar(int x){
      
      int posicion=dispersion(x);
      Nodo actual=T[posicion];
      Nodo anterior=null;
      
      if(T[posicion]!=null){
      while((actual.ptrSiguiente!=null) && (actual.getSocio().getNumeroSocio()!= x)){
      anterior=actual;
      actual=actual.ptrSiguiente;
      }
           if (actual.getSocio().getNumeroSocio()!= x){
           System.out.println("No se encuentra en la tabla el socio " + x);}
           else{
              if (anterior == null){ // primer nodo 
             T[posicion] = actual.ptrSiguiente;
              }else{
              anterior.ptrSiguiente=actual.ptrSiguiente;
              }
              actual = null;
               numElementos--;
               System.out.println("Se elimino el socio " + x);
           }
           
           }
            else{
      System.out.println("No existe el socio " + x);
      
      }
                { 
           

      
      
      
      }
 
    }
    
    
    
    public Nodo[] getT() {
        return T;
    }

    public void setT(Nodo[] T) {
        this.T = T;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }
     
     
}
