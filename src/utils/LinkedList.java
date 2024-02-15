
package utils;

public class LinkedList<T> {
    private Nodo<T> inicio;
    private Nodo<T> fin;

    public LinkedList() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean esVacio(){
        return inicio == null;
    }
    
    public void insertar(T dato){
        Nodo nuevo = new Nodo(dato);
        if (esVacio()){
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setNext(nuevo);
            fin = nuevo;
        }
    }
    
    public boolean eliminar(T dato){
        
        if (inicio.getData().equals(dato)){
            inicio = inicio.getNext();
            return true;
        }
        
        Nodo ant = inicio;
        Nodo current = inicio.getNext();
        
        while (current != null) {            
            if (current.getData().equals(dato)){
                
                if (current == fin){
                    ant.setNext(null);
                    fin = ant;
                } else {
                    ant.setNext(current.getNext());
                }
                return true;
                
            }
            current = current.getNext();
        }
        return false;
            
    }
    
    public boolean contiene(T dato){
        Nodo current = inicio;
        while(current!=null){
            if (dato.equals(current.getData())) return true;
            current = current.getNext();
        }
        
        return false;
    }
    
    public String mostrar(){
        Nodo current = inicio;
        String s = "";
        while(current != null){
            s += current.getData().toString() + " ";
            current = current.getNext();
        }
        
        return s;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public Nodo<T> getFin() {
        return fin;
    }
    
    
}
