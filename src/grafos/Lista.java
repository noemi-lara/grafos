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
public class Lista {
    protected Nodo inicio;
    protected Nodo fin;
    
    public Lista(){
        inicio=fin=null;
    }
    @Override
    public String toString(){
        return inicio.toString();
    }
    
    public boolean insertar(String id){
        if (inicio == null){
            inicio=fin=new Nodo(id);
            return true;
        }
        Nodo aux = inicio;
        while(aux != null){
            if(aux.dato.compareTo(id)==0)
                return false;
            aux = aux.sig;
        }
        aux = new Nodo(id);
        fin.sig = aux;
        fin = aux;
        return true;
    }
    
}
