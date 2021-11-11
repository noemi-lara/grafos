/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author Noemí
 */
public class Grafo {
    private String nombre;
    private ArrayList <Vertice> nodos;
    
    public Grafo(String nombre){
        this.nombre = nombre;
        nodos=new ArrayList();
    }
    
    public void nuevoVertice(String id){
        nodos.add(new Vertice(id));
    }
    
    private Vertice getVertice(String nodo1){
        Vertice i;
        for ( i=nodos.get(0); nodo1.compareTo(i.id)!=0; i = i.sig){}
        return i;
    }
    
    public void nuevoArco(String nodo1, String nodo2){
        Vertice nodo = getVertice(nodo1);
        nodo.nuevoArco(nodo2);
    }
    
    @Override
    public String toString(){
        return nombre + "\n" + nodos.get(0);
    }
    
}
