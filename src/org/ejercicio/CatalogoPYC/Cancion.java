   package org.ejercicio.CatalogoPYC;

public class Cancion{
    private int id;
    private float calificacion;
    private String nombre;
    private String cantante;
    private String notas;

    
    public Cancion(){
        this.id = 0;
        this.calificacion =0;
        this.nombre = "Na";
        this.cantante = "Na";
        this.notas = "Na";
    }
    public Cancion(int id, float calificacion, String nombre, String cantante, String notas){
        this.id = id;
        this.calificacion = calificacion;
        this.nombre = nombre;
        this.cantante = cantante;
        this.notas = notas;
    }
   
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
          this.id = id;
    }
    public float getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }
    public String getCantante(){
        return cantante;
    }
    public void setCantante(String cantante){
        this.cantante = cantante;
    }
    public String getNotas(){
        return notas;
    }
    public void setNotas(String notas){
        this.notas = notas;
    }
    
    @Override
        public String toString(){
            return "Cancion{" +
                    "id="+ id + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", cantante='" + cantante + '\'' +
                    ", calificacion=" + calificacion + '\'' +
                    ", notas='" + notas +
                    '}';
        
        }
    
} //fin de la clase
   