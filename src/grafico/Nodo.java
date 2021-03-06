package grafico;

import java.awt.Graphics;

public class Nodo {
    private int x, y; 
    private String nombre;
    public static final int D=60;

    public Nodo(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre; 
    }
    
    public void pintar(Graphics g){
        g.drawOval(this.x - D/2, this.y - D/2, D, D);
        g.drawString(nombre, x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
