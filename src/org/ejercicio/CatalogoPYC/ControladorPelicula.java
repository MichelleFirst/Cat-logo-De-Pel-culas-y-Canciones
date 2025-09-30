package org.ejercicio.CatalogoPYC;

import java.util.ArrayList;

public class ControladorPelicula{

     private ArrayList<Pelicula> catalogo = new ArrayList<>();

    public void addPelicula(int id, String nombre, int anio, float calificacion, String notas) {
    Pelicula nueva = new Pelicula(id,nombre,anio,calificacion,notas);
    catalogo.add(nueva);
}

public int buscarPorNombre(String nombre) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                return i;
            }
        }
        return -1; 
}

    public boolean eliminarElementos(String nombre) {
        int indice = buscarPorNombre(nombre);
        if (indice != -1) {
            catalogo.remove(indice);
            return true;
        }
        return false;
    }

    public void listar() {
        for (Pelicula p : catalogo) {
            System.out.println(p);
        }
    }
}