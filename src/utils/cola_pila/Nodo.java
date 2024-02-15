
package utils.cola_pila;

public class Nodo<T>{
    private Nodo<T> sgte;
    private T info;
    
    public Nodo(){
        
    }
    
    public Nodo(T info){
        this.info = info;
        this.sgte = null;
    }
    public Nodo(T info, Nodo<T> sgte){
        this.info = info;
        this.sgte = sgte;
    }

    public Nodo<T> getSgte() {
        return sgte;
    }

    public void setSgte(Nodo<T> sgte) {
        this.sgte = sgte;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    
}
