/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.gestores;

import java.util.ArrayList;
import py.edu.fiuni.clientes.Cliente;
import py.edu.fiuni.peliculas.Pelicula;

/**
 *
 * @author User
 */
public class GestorClientes {

    public GestorClientes() {
        gestor = new ArrayList();
    }

    public void addCliente(Cliente cliente) {
        gestor.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        gestor.remove(cliente);
    }
    
    public void setDeuda(Cliente cliente, int nuevaDeuda){
        cliente.setDeuda(nuevaDeuda);
    }
    
    public int getDeuda(Cliente cliente){
        return cliente.getDeuda();
    }
    public boolean existeCliente(int cedula) {
        boolean existeCliente = false;
        for (int i = 0; i < gestor.size(); i++) {
            if (gestor.get(i).getCedula()==cedula){
                existeCliente = true;
                break;
            }
        }
        return existeCliente;
    }

    
    //Variables Privadas
    private ArrayList<Cliente> gestor;
}
    
