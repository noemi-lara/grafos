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
public class Vertice {
  protected String nombre;
  protected int numVertice;
  protected ArrayList <Arco> lados;
  
  public Vertice(String x)
  {
    nombre = x;
    numVertice = -1;
    lados = new <Arco> ArrayList();
  }

    @Override
  public boolean equals(Object d)
  {
    Vertice dos = (Vertice)d;
    return this.nombre.equals(dos.nombre);
  }

  public void asignarVertice(int n)
  {
    numVertice = n;
  }

  public String nomVertice()
  {
    return nombre;
  }

  @Override
  public String toString()
  {
    return nombre + " (" + numVertice + ")" ;
  }

}
