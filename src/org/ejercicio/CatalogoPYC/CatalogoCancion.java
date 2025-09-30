package org.ejercicio.CatalogoPYC;

import java.util.ArrayList;

public class CatalogoCancion {

    private ArrayList<Cancion> catalogo = new ArrayList<>();
    
    public void addCancion(int id, String nombre, float calificacion, String cantante, String notas){
        Cancion nueva = new Cancion(id, calificacion, nombre, cantante, notas);
        catalogo.add(nueva);
    }
     public int buscarPorNombre(String nombre){
        for(int i=0; i< catalogo.size(); i++){
            if(catalogo.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    public boolean eliminarElemento(String nombre){
        int indice = buscarPorNombre(nombre);
        if(indice != -1){
            catalogo.remove(indice);
            return true;
        }
        return false;
    }
    public void listar(){
        for(Cancion c: catalogo){
            System.out.println(c);
        }
    }
    
}