
package Grafo_NO_Dirigido_matrizAd;


public class Vertice {
    private String nombre;
    private int numVertice;
    
    public Vertice(String nombre){
        this.nombre = nombre;
        this.numVertice = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    public boolean equals(Vertice v){
        return nombre.equals(v.getNombre());
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " (" + numVertice + ")";
    }
    
}
