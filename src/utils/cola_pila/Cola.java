
package utils.cola_pila;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Cola<T> implements ICola<T>{
    protected Nodo<T> primero;
    protected Nodo<T> ultimo;
    
    public Cola(){
        this.primero = null;
        this.ultimo = null;
    }
    
    @Override
    public void encolar(T x) {
        Nodo<T> nuevo = new Nodo<>(x);
        if (empty()){
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }

    @Override
    public T desencolar() {
        T primi = primero.getInfo();
        
        if (primero == ultimo ){
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getSgte();
        }
        
        return primi;
    }

    @Override
    public T frente() {
        return primero.getInfo();
    }

    @Override
    public void clear() {
        while(!empty())
            desencolar();
    }

    @Override
    public boolean empty() {
        return primero == null;
    }
    
    public void mostrar(DefaultListModel modelo){
        Nodo p = primero;
        modelo.removeAllElements();
        while(p!=null){
            modelo.addElement(p.getInfo());
            p = p.getSgte();
        }
    }
    
    public void mostrar(DefaultTableModel modelo){}
    
}
