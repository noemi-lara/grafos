/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Noemí
 */
public class Grafo {
  int numVertices;
  static int maxVerts = 20;            
  Vertice [] tablaAdyacencia;

    public Grafo(int n)
    {
      tablaAdyacencia = new Vertice[n];
      numVertices = 0;
      maxVerts = n;
    }
    public Grafo()
    {
      this(maxVerts);
    }
    
    public int numeroDeVertices()
    {
      return numVertices;
    }

    public Vertice[] vertices()
    {
      return tablaAdyacencia;
    }
         //La operación listaAdyc()
    //devuelve la lista de adyacencia del vértice v.
    public ArrayList  listaAdyc(int v)
            throws Exception 
    {
      if (v < 0 || v >= numVertices)
        throw new Exception(" Vértice fuera de rango " + v);
      return tablaAdyacencia[v].lados;
    }

    public void nuevoVertice (String nom)
    {
      boolean esta = numVertice(nom) >= 0;
      if (!esta) 
      {
        Vertice v = new Vertice(nom); 
        v.asignarVertice(numVertices);
        tablaAdyacencia [numVertices++] = v;
      }
    } 
        // numVertice()busca el vértice en la tabla. 
        //Devuelve -1 si no lo encuentra:
    public int numVertice(String nm)
    {
      Vertice v = new Vertice(nm);
      boolean encontrado = false;
      int i = 0;
      for (; (i < numVertices) && !encontrado; )
      {
        encontrado = tablaAdyacencia[i].equals(v);
        if (!encontrado) i++ ; 
      }
      return (i < numVertices) ? i : -1 ;
    }
  
    public void nuevoArco(String a, String b)
            throws Exception
    {
      if (!adyacente(a, b))
      {
        int va = numVertice(a);
        int vb = numVertice(b);
        if (va < 0 || vb < 0)
         throw new Exception("Vértice no existe" + a + " o " + b);
        Arco ab = new Arco(vb);
        tablaAdyacencia[va].lados.add(ab);
      }
    }
 
  public void borrarArco(String a, String b)
          throws Exception
  {
            int va, vb;
      va = numVertice(a);
      vb = numVertice(b);
      if (va < 0 || vb < 0) 
          throw new Exception ("Vértice no existe");
      Arco ab = new Arco(vb);
      tablaAdyacencia[va].lados.remove(ab); 
    }

  boolean adyacente(String a, String b)
          throws Exception
  {
      int va, vb;
      va = numVertice(a);
      vb = numVertice(b);
      if (va < 0 || vb < 0) 
          throw new Exception ("Vértice no existe");
      return (tablaAdyacencia[va].lados.contains(new Arco(vb))); 
          
    }

  boolean adyacente(int va, int vb)
          throws Exception
  {
      if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
      return (tablaAdyacencia[va].lados.contains(new Arco(vb)));  
        
    }
  
  @Override
  public String toString (){
      String lista = "";
      for (Vertice v : tablaAdyacencia){
          lista += (v + " ");
      }
      return lista;
  }

}
