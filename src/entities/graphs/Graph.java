package entities.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private int numberoVertices;
    private List<List<Integer>> listaAdjacencia;

    public Graph (int numeroVertices){
        this.numberoVertices = numeroVertices;
        listaAdjacencia = new ArrayList<>(numeroVertices);

        for (int i = 0 ; i < numeroVertices; i++ ){
            listaAdjacencia.add(new LinkedList<>());
        }
    }

    public void adicionarAresta (int origem, int destino){
        listaAdjacencia.get(origem).add(destino);
        listaAdjacencia.get(destino).add(origem);
    }

    public void imprimirGrafo (){
        for (int i = 0; i < numberoVertices; i++){
            System.out.println("Vertice " + i + ":");
            for (Integer vizinho : listaAdjacencia.get(i)){
                System.out.println(" --> " + vizinho);
            }
        }
    }

    public void buscarEmLargura (int verticeIncial){
        boolean [] vistados =  new boolean[numberoVertices];

        Queue<Integer> fila = new LinkedList<>();
        vistados[verticeIncial] = true;

        fila.add(verticeIncial);

        while(!fila.isEmpty()){
            int vertice = fila.poll();
            System.out.println(vertice + " ");

            for (int vizinho : listaAdjacencia.get(vertice)){
                if(!vistados[vizinho]){
                    vistados[vizinho] = true;
                    fila.add(vizinho);
                }
            }
        }
    }
}
