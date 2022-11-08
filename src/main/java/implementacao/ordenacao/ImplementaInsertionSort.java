package implementacao.ordenacao;

public class ImplementaInsertionSort implements Ordenar_dados{


    @Override
    public int ordenarDados(int[] dados) {
        for (int j = 1; j < dados.length; j++) {
            int key = dados[j];
            int i = j - 1;
            while (i >= 0 && dados[i] > key) {
                dados[i+1] = dados[i];
                i -= 1;
            }
            dados[i+1] = key;
        }
        return 0;

    }

    @Override
    public int dadosOrdenados(int[] dados) {
        System.out.print("Os dados foram ordenados utilizando o algoritmo Insertion Sort: \n");
        for(int i=0; i < dados.length; i++){
            System.out.print(dados[i] + " ");
        }
        System.out.print("\n");
        return 0;
    }
}
