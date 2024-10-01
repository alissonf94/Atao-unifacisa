import entities.Algorithms;
import entities.graphs.Graph;
import entities.tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

//        Graph grafo = new Graph(5);
//
//        grafo.adicionarAresta(0, 1);
//        grafo.adicionarAresta(0, 4);
//        grafo.adicionarAresta(1, 2);
//        grafo.adicionarAresta(1, 3);
//        grafo.adicionarAresta(1, 4);
//        grafo.adicionarAresta(2, 3);
//        grafo.adicionarAresta(3, 4);
//
//        System.out.println("Busca em Largura a parti do vertice 0: ");
//        grafo.buscarEmLargura(0);

        Algorithms algorithms = new Algorithms();
        int [] vetor = {7,5,10,6,8};
        algorithms.BubbleSort(vetor);
    }
}