/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import grafos.Grafo;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Noemí
 */
public class TestGrafoArrayList {
    public static void main(String args[])
    {
      String v, w;
      try {
        String n;
         n=JOptionPane.showInputDialog("Nombre del grafo");
         Grafo gra = new Grafo(n);
      
        
        for (int i = 1; i <= 5; i++)
        {
          v = JOptionPane.showInputDialog("vertice " + i);
          gra.nuevoVertice(v);
        }
      
        v=JOptionPane.showInputDialog(
         "Arcos, pares de vertices separados por un espacio");
        boolean fin = false;
        StringTokenizer r;
          r = new StringTokenizer(v);
        do {
          
          v = r.nextToken();
          if (! v.equalsIgnoreCase("fin"))
          {
            w = r.nextToken();
            System.out.println("Arco creado " + v + " " + w);
            gra.nuevoArco(v, w);
              
           //gra.nuevoArco(w, v);  // al ser grafo no dirigido
          }
          else fin = true;
        } while (!fin);
      
          System.out.println("Grafo: " + gra);
      }
      catch(Exception e)
      {
       System.out.println(e.getMessage() + "\n" + e +
                "\nError en la entrada del grafo ");
      }
    }

}
