/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsocios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class MainSocios {
public static void pause(){
    System.out.println("");
    System.out.println("================================");
    System.out.println("Presione una tecla para continuar...");
    new java.util.Scanner(System.in).nextLine();
  }
    
    public static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;  
        Tabla tabla=new Tabla();
    
    do {
            clear();
            System.out.println("------ Menú de Socios ------");
            System.out.println("1. Agregar Socio");
            System.out.println("2. Buscar Socio");
            System.out.println("3. Eliminar Socio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    clear();
                    try{
                    System.out.println("--- Agregar Socio ---");

                    System.out.print("Número de Socio: ");
                    int numeroSocio = scanner.nextInt();
                    scanner.nextLine();  
                    while (numeroSocio<0){
                    System.out.print("Ingrese un codigo valido: ");
                    numeroSocio = scanner.nextInt();
                    scanner.nextLine();
                    }

                    System.out.print("Nombre completo: ");
                    String nombreCompleto = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    while (edad<0){
                    System.out.print("Ingrese una edad valida: ");
                    edad = scanner.nextInt();
                    scanner.nextLine();
                    }

                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();

                    Socios nuevoSocio =new Socios(numeroSocio,  nombreCompleto,  edad,  sexo);
                    System.out.println("Se le dio de alta el dia: " +nuevoSocio.getFechaAlta());
                    
                    tabla.insert(nuevoSocio);}
                     catch (InputMismatchException e){
                    System.out.println("Dato mal ingresado");
                    scanner.nextLine();
                    }
                    pause();
                    
                    break;
                case 2:
                    clear();
                    try{
                     System.out.println("Ingrese el numero del socio ");
                    int numeroSocio = scanner.nextInt();
                    scanner.nextLine();  
                    
                    Nodo buscarSocio=tabla.buscar(numeroSocio);
                    if(tabla.buscar(numeroSocio)!=null){
                    System.out.println("Socio: " +buscarSocio.getSocio().getNombreCompleto());
                    System.out.println("Fecha de alta; " +buscarSocio.getSocio().getFechaAlta());
                    System.out.println("Edad: " +buscarSocio.getSocio().getEdad());
                    System.out.println("Sexo: " +buscarSocio.getSocio().getSexo());
                    }else{
                    System.out.print("no se encontro");                    
                    }}
                    catch (InputMismatchException e){
                    System.out.println("Dato mal ingresado");
                    scanner.nextLine();
                    }
                    pause();
                    break;
                case 3:
                    clear();
                    try{
                    System.out.println("Ingrese el numero del socio ");
                    int numeroSocio = scanner.nextInt();
                    scanner.nextLine();  
                    
                    tabla.Eliminar(numeroSocio);}
                    catch (InputMismatchException e){
                    System.out.println("Dato mal ingresado");
                    scanner.nextLine();
                    }
                    
                    
                    pause();
                    break;
                case 4:
                    clear();
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    pause();
                    break;
            }
        } while (opcion != 4);
    }
    }
    

