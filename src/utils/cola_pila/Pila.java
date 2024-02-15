
package utils.cola_pila;

import javax.swing.DefaultListModel;

/**
 *
 * @author Sistemas
 */
public class Pila<T> implements IPila<T>{
    private Nodo<T> p;
    
    public Pila(){
        p=null;
    }
    
    @Override
    public void push(T valor)
    {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSgte(p);
        p=nuevo;
    }
    
    @Override
    public T pop(){
        T cima=p.getInfo();
        p=p.getSgte();
        return cima;
    }
    
    @Override
   public T top(){
        return p.getInfo();
    }

    
    @Override
    public boolean empty(){
        return p==null;
    }
    
    @Override
    public void clear(){
        while(p!=null)
            p=p.getSgte();
    }
    
    public void mostrar(DefaultListModel modelo){
        Nodo actual=p;
        modelo.removeAllElements();
        while(actual!=null)
        {
            modelo.addElement(actual.getInfo());
            actual=actual.getSgte();
        }
    }
    
    public String mostrarString(){
        Nodo actual=p;
        String c = "";
        while(actual!=null)
        {
            c += actual.getInfo() + "     ";
            actual=actual.getSgte();
        }
        return c;
    }

}
