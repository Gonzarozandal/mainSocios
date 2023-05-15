/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsocios;

/**
 *
 * @author Gonza
 */
public class Nodo {
    public Socios socio;
    public Nodo ptrSiguiente;
    
    public Nodo (Socios e){
        //Almacenamos el socio recibido por parámetro en el espacio reservado.
    socio=e;
    //Por defecto, el elemento no está conectado con un nodo siguiente.
    ptrSiguiente=null;
    
    }
     public Socios getSocio() {
    return socio;
  }
    
}
