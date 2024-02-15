
package Grafo_Dirigido_listaAd;

import javax.swing.DefaultListModel;
import utils.Nodo;
import utils.cola_pila.Cola;
import utils.cola_pila.Pila;

public class GrafoLista {
    private int numVerts;
    static int maxVerts = 20;
    private Vertice[] vertices;

    public GrafoLista() {
        this(maxVerts);
    }

    public GrafoLista(int mx) {
        maxVerts = mx;
        numVerts = 0;
        vertices = new Vertice[mx];
    }
    
    public Vertice[] getVertices() {
        return vertices;
    }
    
    // Busca el vertice si lo encuentra devuelve su numero de vertice si no retorna -1
    public int buscarVertice(String nombre){
        Vertice v = new Vertice(nombre);
        for (int i = 0; i < numVerts; i++) {
            if (v.equals(vertices[i])) return i;
        }
        return -1;
    }
    
    // retorna true si existe el vertice
    public boolean existe(String nombre){
        return buscarVertice(nombre) >= 0;
    }
    
    public boolean existe(int v){
        return (v >= 0  && v < numVerts);
    }
    
    public void insertarVertice(String nombre){
        if (!existe(nombre)){
            Vertice v = new Vertice(nombre);
            v.setNumVertice(numVerts);
            vertices[numVerts] = v;
            numVerts++;
        }
    }
    
    public boolean adyacentes(String a, String b) throws Exception{
        int v1, v2;
        v1 = buscarVertice(a);
        v2 = buscarVertice(b);
        if (v1 < 0 || v2 < 0) throw new Exception("El vertice no existe");
        
        Arco ab = new Arco(v2);
        return vertices[v1].contiene(ab);
        
    }
    
    public boolean adyacentes(int v1, int v2) throws Exception{
        if (!existe(v1) || !existe(v2)) throw new Exception("El vertice no existe");
        
        Arco ab = new Arco(v2);
        return vertices[v1].contiene(ab);
    }
    
    //Insertar un arco
    public void insertarArco(String a, String b) throws Exception{
        if (!adyacentes(a, b)){
            int v1 = buscarVertice(a);
            int v2 = buscarVertice(b);
            System.out.println(v1 +" " + v2);
            if (v1<0 || v2<0)  throw new Exception("El vertice no existe");
            
            Arco ab = new Arco(v2);
            vertices[v1].getListAdya().insertar(ab);
        }
    }
    
    public void eliminarArco(String a, String b) throws Exception{
        int v1, v2;
        v1 = buscarVertice(a);
        v2 = buscarVertice(b);
        if (v1<0 || v2<0)  throw new Exception("El vertice no existe");
        
        Arco ab = new Arco(v2);
        vertices[v1].getListAdya().eliminar(ab);
        
    }
    
    public String listaAdyacentes(String a) throws Exception{
        int va;
        va = buscarVertice(a);
        if (va < 0) throw new Exception("Vertice no existe");
        
        String adyacentes = "Adayacentes de " + a + ":         ";
        
        Nodo<Arco> p = vertices[va].getNodoIncio();
            // Por cada nodo adyacente
        while(p!=null){
            va = ((Arco) p.getData()).getDestino();
            
            adyacentes += vertices[va].getNombre() + " ";
             p = p.getNext();
        }
        return adyacentes;
    }
    
    public String listaAdyacentes()  throws Exception{
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < numVerts; i++) {
            resultado.append(listaAdyacentes(vertices[i].getNombre())).append("\n");
        }
        
        return resultado.toString();
    }
    
    public void recorridoEnAnchura(DefaultListModel modelo, String origen) throws Exception{
        modelo.removeAllElements();
        int o = buscarVertice(origen);
        if (o < 0) throw new Exception("Vertice origen no existe");
        
        
        String ele;
        int indiceE;
        Cola<String> cola = new Cola<>();
        // marcamos todos los nodos como no visitados por defento son false
        boolean[] visitados = new boolean[numVerts];
        // encolamos el origen y marcamos como visitado
        cola.encolar(origen);
        visitados[o] = true;
        
        while(!cola.empty()){
            // Desencolamos el nodo de frente de la cola
            ele = cola.desencolar();
            indiceE = buscarVertice(ele);
            //  Mostramos el elemento
            modelo.addElement(ele);
            // obtenemos los adyacentes del elemento desencolado
            Nodo<Arco> p = vertices[indiceE].getNodoIncio();
            // Por cada nodo adyacente
            while(p!=null){
                indiceE = ((Arco) p.getData()).getDestino();
                //  si no ha sido visitado, marcar como visitado y encolarlo
                if (!visitados[indiceE]){
                    visitados[indiceE] = true;
                    cola.encolar(vertices[indiceE].getNombre());
                }
                p = p.getNext();
            }
            
        }
    }
    
    public void recorridoEnProfunfidad(DefaultListModel modelo, String origen) throws Exception{
        modelo.removeAllElements();
        int o = buscarVertice(origen);
        if (o < 0) throw new Exception("Vertice origen no existe");
        
        String ele;
        int indiceE;
        Pila<String> pila = new Pila<>();
        // marcamos todos los nodos como no visitados por defento son false
        boolean[] visitados = new boolean[numVerts];
        // Poner en la pila el nodo inicial y marcarlo como visitado.
        pila.push(origen);
        visitados[o] = true;
        
        while(!pila.empty()){
            // Sacar el nodo de la pila y mostrar elemento
            ele = pila.pop();
            indiceE = buscarVertice(ele);
            //  Mostramos el elemento
            modelo.addElement(ele);
            // Obtener las adyacencias del nodo que se acaba de sacar
            Nodo<Arco> p = vertices[indiceE].getNodoIncio();
            // Por cada nodo adyacente
            while(p!=null){
                indiceE = ((Arco) p.getData()).getDestino();
                // si no ha sido visitado, marcar como visitado y colocarlo en la pila.
                if (!visitados[indiceE]){
                    visitados[indiceE] = true;
                    pila.push(vertices[indiceE].getNombre());
                }
                p = p.getNext();
            }
        }
        
    }
    
    public String mostrar(){
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numVerts; i++) {
            resultado.append(vertices[i].toString()).append(" --> ")
                    .append(vertices[i].getListAdya().mostrar()).append("\n");
            
        }
        return resultado.toString();
    }
    
}
