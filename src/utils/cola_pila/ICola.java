
package utils.cola_pila;

public interface ICola<T> {
    void encolar(T x);
    T desencolar();
    T frente();
    void clear();
    boolean empty();
}
