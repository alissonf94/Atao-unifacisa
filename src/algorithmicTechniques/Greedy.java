package algorithmicTechniques;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    public double mochilaFrac(int [] pesos,int [] valores, int capacidade){
        int n = valores.length;
        Item [] itens = new Item[n];

        int capacidadeResidual = capacidade;
        double valorTotal = 0;

        for (int i = 0; i < itens.length; i++){
            itens[i] = new Item (valores[i] , pesos[i]);
        }

        Arrays.sort(itens, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = o1.getValue() * o1.getWeight();
                double r2 = o2.getValue() * o2.getWeight();
                return Double.compare(r2, r1);
            }
        });

        for (Item item : itens){
            double xi;
            if(capacidade != 0){
                if(item.getWeight() <= capacidadeResidual){
                    capacidadeResidual -= item.getWeight();
                     xi = 1;
                }
                else{
                    xi = capacidadeResidual / item.getWeight();
                    capacidadeResidual = 0;
                }

                valorTotal += xi * item.getWeight();
            }
            else{
                break;
            }
        }

        return valorTotal;
    }
}
