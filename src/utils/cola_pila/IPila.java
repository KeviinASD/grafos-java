/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils.cola_pila;

/**
 *
 * @author Maripaz Rivas Verast
 */
public interface IPila<T> {
    
    public void push(T valor);
    public T pop();
    public T top();
    public boolean empty();
    public void clear();
}
