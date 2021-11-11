/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Noemí
 */
public class Nodo {
    protected String dato;
    protected Nodo sig;
    
    public Nodo(String dato){
        this.dato = dato;
        sig=null;
    }
    
    @Override 
    public String toString(){
        return dato + "," + sig;
    }
    
}
