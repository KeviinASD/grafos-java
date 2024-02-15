

package Grafo_NO_Dirigido_listaAd;

import utils.LinkedList;
import utils.Nodo;

public class Vertice {
    private String nombre;
    private int numVertice;
    private LinkedList<Arco> listAdya;

    public Vertice(String x) {
        this.nombre = x;
        numVertice = -1;
        listAdya = new LinkedList<>();
    }

    @Override
    public boolean equals(Object obj) {
        Vertice v = (Vertice) obj;
        return nombre.equals(v.getNombre());
    }
    
    public boolean contiene(Arco a){
        return listAdya.contiene(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListAdya(LinkedList<Arco> listAdya) {
        this.listAdya = listAdya;
    }
    
    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    public LinkedList<Arco> getListAdya() {
        return listAdya;
    }
    
    public Nodo<Arco> getNodoIncio(){
        return listAdya.getInicio();
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre +" (" + numVertice + ")";
    }
    
    
}
