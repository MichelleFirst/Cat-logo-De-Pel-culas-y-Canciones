package org.ejercicio.CatalogoPYC;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ControladorPelicula ctrlPelicula= new ControladorPelicula();


        int opcionPrincipal; 

        do {
            System.out.println("--- Catálogo de Películas y Canciones ---");
            System.out.println("1. Gestionar catálogo de Películas");
            System.out.println("2. Gestionar catálogo de Canciones");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcionPrincipal = sc.nextInt();
            sc.nextLine(); 

            switch(opcionPrincipal) {
                case 1:
                    menuPeliculas(ctrlPelicula, sc);
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

        } while(opcionPrincipal != 0);

        sc.close();


    }
         
     public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;  
            numero /= 10;         
        }
        return suma;
    }

    public static void menuPeliculas(ControladorPelicula ctrl, Scanner sc) {
        int opcion;
        do {
            System.out.println("--- Menú Películas ---");
            System.out.println("1. Agregar Elementos");
            System.out.println("2. Eliminar Elementos");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Listar todos las elementos");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
               case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); 
                    sc.nextLine();
                    int suma = sumarDigitos(id);
                    System.out.println("La suma de los dígitos de la matrícula es: " + suma);
    
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Calificación: ");
                    float calificacion = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Notas: ");
                    String notas = sc.nextLine();
                    ctrl.addPelicula( id, nombre, anio, calificacion, notas);
                    System.out.println("Película agregada correctamente.");
                    break;

                case 2:
                    System.out.print("Nombre a eliminar: ");
                    String elim = sc.nextLine();
                    if (ctrl.eliminarElementos(elim))
                        System.out.println("Película eliminada correctamente.");
                    else
                        System.out.println("No se encontró la película.");
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    int pos = ctrl.buscarPorNombre(buscar);
                    if (pos != -1)
                        System.out.println("Película encontrada en posición: " + pos);
                    else
                        System.out.println("No se encontró la película.");
                    break;

                case 4:
                    ctrl.listar();
                    break;
                case 0:
                        System.out.println("Volviendo al menú principal...");
                break;
            
                default: System.out.println("Opción inválida, intenta de nuevo.");
            
            }
        } while(opcion != 0);
    }







}