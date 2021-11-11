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
public class Vertice {
    protected String id; 
    protected Vertice sig;
    protected Lista arcos;
    
    public Vertice (String id){
        this.id = id;
        sig = null;
        arcos = new Lista(); 
    }
    public boolean nuevoArco(String id){
        return arcos.insertar(id);
    }
    
    @Override
    public String toString(){
        return id + ":"+arcos+"\n"+sig;
    }
    
}
