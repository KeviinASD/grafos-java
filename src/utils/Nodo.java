
package utils;

public class Nodo<T extends Object> {
    private T data;
    private Nodo<T> next;

    public Nodo(T data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
