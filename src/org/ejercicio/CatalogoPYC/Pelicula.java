package org.ejercicio.CatalogoPYC;

public class Pelicula{

    private int id;
    private String nombre;
    private int anio;
    private float calificacion;
    private String notas;

    public Pelicula(){
        this.id=0;
        this.nombre="NA";
        this.anio=0;
        this.calificacion=0.0f;
        this.notas="NA";
    }
    
    public Pelicula(String nombre,int anio,float calificacion){
        this.nombre=nombre;
        this.anio=anio;
        this.calificacion=calificacion;
    }

    public Pelicula(int id, String nombre, int anio, float calificacion, String notas){
        this.id=id;
        this.nombre=nombre;
        this.anio=anio;
        this.calificacion=calificacion;
        this.notas=notas;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }

    public float getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(float calificacion){
        this.calificacion=calificacion;
    }

    public String getNotas(){
        return notas;
    }
    public void setNotas( String notas){
        this.notas=notas;
    }

    @Override
        public String toString() {
            return "Pelicula{" +
                    "id='" + id + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", anio=" + anio +
                    ", calificacion=" + calificacion +
                    ", notas=" + notas +
                    '}';
        }

}