package entities;

public class Algorithms {

    public  void BubbleSort(int [] v){

        for (int i = v.length - 1; i > 0; i--){
            int swaps = 0;
            for (int j = 0; j < i; j++ ) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    swaps++;
                }
            }
            if(swaps <= 1) break;
        }
    }

    public static void quickSort (int [] v){
        quickSortRecursive(v, 0, v.length -1);
    }

    public static void quickSortRecursive (int [] v , int startPos, int endPos){
        int pivot = v[startPos];
        int l = startPos;
        int r = endPos;

        // os valores da esquerda devem ser menor que que o pivor
        // os valores da direita devem ser maiores que o pivor

        while(l <= r){
            while (v[l] < pivot) l++;
            while (v[r] > pivot) r--;

            if(l <= r ){
                int aux = v[l];
                v[l] = v[r];
                v[r] = aux;
            }

        }

        if(startPos < r) quickSortRecursive(v, startPos, r);
        if(endPos > l) quickSortRecursive(v, l , endPos);
    }

}
