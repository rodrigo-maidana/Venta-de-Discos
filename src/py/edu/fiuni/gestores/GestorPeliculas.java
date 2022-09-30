/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.gestores;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import py.edu.fiuni.peliculas.Pelicula;

/**
 *
 * @author User
 */
public class GestorPeliculas {

    public GestorPeliculas() {
        gestor = new ArrayList();
    }

    public void addPelicula(Pelicula pelicula) {
        gestor.add(pelicula);
    }

    public void removePelicula(Pelicula pelicula) {
        gestor.remove(pelicula);
    }

    public void removePelicula(int posPelicula) {
        gestor.remove(gestor.get(posPelicula));
    }

    public void setAlquilado(int posPelicula) {
        gestor.get(posPelicula).setAlquilado(true);
    }
    
    public void printPelicula(int i){
        String texto = gestor.get(i).toString();
        JOptionPane.showMessageDialog(null, texto);
    }

    public void printElenco(Pelicula pelicula) {
        System.out.println(pelicula.getElenco());
    }

    public int buscarPelicula(String nombre) {
        int j = -1;
        for (int i = 0; gestor.size() > i; i++) {
            if (gestor.get(i).getNombre().trim().toLowerCase().equals(nombre.trim().toLowerCase())) {
                j = i;
                break;
            }
        }

        if ((j == -1)) {
            JOptionPane.showMessageDialog(null, "La pelicula " + nombre + " no existe.");
        }
        return j;
    }

    public boolean existePelicula(String nombre) {
        boolean existePelicula = false;
        for (int i = 0; i < gestor.size(); i++) {
            if ((gestor.get(i).getNombre().trim().toLowerCase()).equals(nombre.trim().toLowerCase())) {
                existePelicula = true;
                break;
            }
        }
        return existePelicula;
    }

    public void listarPeliculas() {
        ordenarPeliculas();
        String texto = "";
        for (int i = 0; i < gestor.size(); i++) {
            texto = texto.concat(gestor.get(i).toString());
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void ordenarPeliculas() {
        Collections.sort(gestor);
    }

    //Variables Privadas
    private ArrayList<Pelicula> gestor;
}
