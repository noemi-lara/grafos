package programas;
// Prueba  1
import clases.Grafo;
import clases.Vertice;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestGrafo {
    public static void main(String args[])
    {
      String v, w;
      try {
        int n;
         n=Integer.parseInt(JOptionPane.showInputDialog(
                 "Número de nodos"));
         Grafo gra = new Grafo(n);
        
        for (int i = 1; i <= n; i++)
        {
          v = JOptionPane.showInputDialog("vertice " + i);
          gra.nuevoVertice(v);
        }
        
        boolean fin = false;  
        do {
        v=JOptionPane.showInputDialog(
         "Arcos, pares de vertices separados por un espacio. "
                 + "Escriba FIN para terminar");
        
        StringTokenizer r;
          r = new StringTokenizer(v);
          v = r.nextToken();
          if (! v.equalsIgnoreCase("fin")) 
            // Escribir fin para terminar de leer los arcos
          {
            w = r.nextToken();
            gra.nuevoArco(v, w);
            // Comentar la siguiente línea para grafos dirigidos. 
            //gra.nuevoArco(w, v);  // al ser grafo no dirigido
          }
          else fin = true;
        } while (!fin);
      
        System.out.println("Vertices del grafo " + gra);
        Vertice [] vs; //= new Vertice[n];
        vs = gra.vertices();
          System.out.println(" " + gra );
        for (int i = 0; i < n; i++){
          System.out.print(vs[i] + " ");
          System.out.println(gra.listaAdyc(i));
        }
      }
      catch(Exception e)
      {
       System.out.println(e.getMessage() + "\n" + e +
                "\nError en la entrada del grafo ");
      }
    }

}
