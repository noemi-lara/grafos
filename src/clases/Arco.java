/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Noemí
 */
public class Arco {
    protected int destino;
    protected String nom;
    protected double peso;
    
    public Arco(int d, String nom)
    {
        this.nom = nom;
      destino = d;
    }
    
    public Arco(int d){
        destino=d;
    }

    public Arco(int d, String n, double p)
    {
      this(d, n);
      peso = p;
    }
    public int getDestino()
    {
      return destino;
    }
    
  @Override
  public boolean equals(Object n)
  {
    Arco a = (Arco)n;
    return this.destino == a.destino;
  }
  
  @Override
  public String toString(){
      return " " + (nom);
  }

}
