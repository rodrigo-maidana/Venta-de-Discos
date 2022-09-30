/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.clientes;

import java.util.ArrayList;
import py.edu.fiuni.peliculas.Pelicula;

/**
 *
 * @author User
 */
public class Cliente {
    // constructor
    public Cliente(String nombre, String apellido, int cedula, int deuda, String peliculas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.deuda = deuda;
        this.peliculas = peliculas;
    }
    //getters
    
    // retorna las peliculas alquiladas por el clientes
    public String getPeliculas(){
        String texto = "Las peliculas alquiladas por el clientes son:\n" + peliculas;
        return texto;
    }

    // retorna el nombre del cliente
    public String getNombre(){
        return this.nombre;
    }
    // retorna el apellido del cliente
    public String getApellido(){
        return this.apellido;
    }
    // retorna la cedula del cliente
    public int getCedula(){
        return this.cedula;
    }
    // retorna el deuda del cliente
    public int getDeuda(){
        return this.deuda;
    }
    // setters
    /**
     * pone un nuevo nombre al cliente
     * @param nuevoNombre 
     */ 
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    /**
     * pone un nuevo apellido al cliente
     * @param nuevoApellido 
     */
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
    /**
     * pone una nueva cedula al cliente
     * @param nuevaCedula 
     */
    public void setNombre(int nuevaCedula){
        this.cedula = nuevaCedula;
    }

    /**
     * pone un nuevo deuda al cliente
     * @param nuevaDeuda
     */
    public void setDeuda(int nuevaDeuda){
        this.deuda = nuevaDeuda;
    }
    
    public void addPelicula(String pelicula){
        String alquiladas = this.peliculas;
        alquiladas = alquiladas.concat(pelicula + ",");
        peliculas = alquiladas;
    }
    

    private String nombre;
    private String apellido;
    private int cedula;
    private int deuda;
    private String peliculas;
}