
package Grafo_NO_Dirigido_matrizAd;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import utils.cola_pila.Cola;
import utils.cola_pila.Pila;

public class GrafoMatrix {
    static int maxVerts = 20;
    private int numVerts;
    private Vertice[] verts;
    private int [][] matrizAd;
    
    public GrafoMatrix(){
        this(maxVerts);
    }
    
    public GrafoMatrix(int maxVerts) {
        matrizAd = new int[maxVerts][maxVerts];
        verts = new Vertice[maxVerts];
        
        for (int i = 0; i< maxVerts ; i++)
            for (int j = 0; j < maxVerts; j++) 
                matrizAd[i][j] = 0;
        
        numVerts = 0;
    }
    
    // insertar vertice
    
    public int numeroVertice(String nombre){
        Vertice v = new Vertice(nombre);
        for (int i = 0; i<numVerts; i++){
            if (v.equals(verts[i])) return i;
        }
        return -1;
    }
    
    public boolean existeVertice(String nombre){
        return numeroVertice(nombre) >= 0 ;
    }
    
    public void insertarVertice(String nombre){
        if (!existeVertice(nombre)){
            Vertice v = new Vertice(nombre);
            v.setNumVertice(numVerts);
            verts[numVerts] = v;
            numVerts++;
        }
    }
    
    // Añadir arco
    
    public void insertarArco(String a, String b) throws Exception{
        int va, vb;
        
        va = numeroVertice(a);
        vb = numeroVertice(b);
        
        if (va < 0 || vb < 0 ) throw new Exception("Vertice no existe");
        matrizAd[va][vb] = 1;
        matrizAd[vb][va] = 1;
    }
    
    // es adyacente
    
    public boolean sonAdayacentes(String a, String b) throws Exception{
        int va, vb;
        va = numeroVertice(a);
        vb = numeroVertice(b);
        
        if (va < 0 || vb < 0) throw new Exception("Vertice no existe");
        return matrizAd[va][vb] == 1;
    }
    
    public String listaAdyacentes(String a) throws Exception{
        int va;
        va = numeroVertice(a);
        if (va < 0) throw new Exception("Vertice no existe");
        
        String adyacentes = "Adyacentes de " + a + ":     ";
        for (int i = 0; i < numVerts ; i++){
            if (matrizAd[va][i] == 1) adyacentes += verts[i].getNombre() + " ";
        }
        return adyacentes;
    }
    
    public String listaAdyacentes()  throws Exception{
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < numVerts; i++) {
            resultado.append(listaAdyacentes(verts[i].getNombre())).append("\n");
        }
        
        return resultado.toString();
    }
    
    public String mostrar(){
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("  ");
        for (Vertice vert : verts) {
            resultado.append(vert.getNombre()).append(" ");
        }
        resultado.append("\n");
        
        for (int i = 0; i < matrizAd.length; i++) {
            if (i < numVerts) resultado.append(verts[i].getNombre()).append(" ");
            else resultado.append("  ");
            
            for (int j = 0; j < matrizAd[i].length; j++) {
                
                resultado.append(matrizAd[i][j]).append(" ");
                
                
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
    
    public void mostrar(DefaultTableModel modelo){
        modelo.setRowCount(0); int i;
        Object[] columns = new Object[matrizAd.length + 1];
        Object[] row = new Object[matrizAd.length + 1];
        
        
        columns[0] = "Vertices";
        for (i = 0 ; i < matrizAd.length ; i++) {
            if (i < numVerts ) columns[i + 1] = verts[i].getNombre();
            else columns[i + 1] = " ... ";
            System.out.println(i);
        }
        modelo.setColumnIdentifiers(columns);
        
        
        
        for (i = 0; i < matrizAd.length; i++) {
            if (i < numVerts) row[0] = verts[i].getNombre();
            else row[0] = " ... ";
            
            for (int j = 0; j < matrizAd[i].length; j++) {
                
                row[j + 1] = matrizAd[i][j];
                
                
            }
            modelo.addRow(row);
        }
        
    }
    
        public void recorridoEnAnchura(DefaultListModel modelo, String origen) throws Exception{
        modelo.removeAllElements();
        int o = numeroVertice(origen);
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
            indiceE = numeroVertice(ele);
            //  Mostramos el elemento
            modelo.addElement(ele);
            // obtenemos los adyacentes del elemento desencolado
            for (int i = 0; i < numVerts ; i++){
                //Por cada nodo adyacente
                if (matrizAd[indiceE][i] == 1){
                    //si no ha sido visitado, marcar como visitado y encolarlo.
                    if (!visitados[i]){
                        visitados[i] = true;
                        cola.encolar(verts[i].getNombre());
                    }
                    
                }
            }
            
        }
    }
    
    public void recorridoEnProfunfidad(DefaultListModel modelo, String origen) throws Exception{
        modelo.removeAllElements();
        int o = numeroVertice(origen);
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
            indiceE = numeroVertice(ele);
            //  Mostramos el elemento
            modelo.addElement(ele);
            // Obtener las adyacencias del nodo que se acaba de sacar
            for (int i = 0; i < numVerts ; i++){
                //Por cada nodo adyacente
                if (matrizAd[indiceE][i] == 1){
                    //si no ha sido visitado, marcar como visitado y colocarlo en la pila.
                    if (!visitados[i]){
                        visitados[i] = true;
                        pila.push(verts[i].getNombre());
                    }
                    
                }
            }
        }
        
    }
    
}
