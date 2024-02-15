
package Grafo_NO_Dirigido_listaAd;


public class Arco {
    private int destino;
    private double peso;

    public Arco(int destino) {
        this.destino = destino;
    }

    public Arco(int destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Arco a = (Arco) obj;
        return destino == a.getDestino();
    }

    @Override
    public String toString() {
        return "[ " +destino + " ] --> ";
    }
    
    
}
