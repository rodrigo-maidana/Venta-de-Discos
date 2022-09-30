/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.peliculas;

/**
 *
 * @author rmaidana
 */
public class Pelicula implements Comparable<Pelicula> {
    
    public Pelicula(String nombre, String genero, int resenha, int estreno, String director, String elenco) {
        alquilado = false;
        this.nombre = nombre;
        this.genero = genero;   
        this.estreno = estreno;
        this.resenha = resenha;
        this.director = director;
        this.elenco = elenco;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getResenha() {
        return resenha;
    }

    public void setResenha(int resenha) {
        this.resenha = resenha;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        String alquilada = "";
        
        if(this.alquilado){
            alquilada = "SI";
        }else{
            alquilada = "NO";
        }
        
        String texto = "Nombre: " + this.getNombre() + "\nGénero: " + this.getGenero() + "\nAño de Estreno: " + this.getEstreno() + "\nReseña: "
                + this.getResenha() + "\nDirector: " + this.getDirector() + "\nElenco: " + this.getElenco() + "\nAlquilada: " + alquilada;
        return texto;
    }

    @Override
    public int compareTo(Pelicula t) {
        return nombre.compareTo(t.getNombre());
    }

    //atributos de clase
    private boolean alquilado;
    private String nombre;
    private String genero;
    private int resenha;
    private int estreno;
    private String director;
    private String elenco;

}
