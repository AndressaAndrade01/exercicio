package implementacao.ordenacao;

public class ImplementaBubbleSort implements Ordenar_dados{
    @Override
    public int ordenarDados(int[] dados) {
        int n = dados.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int x=1; x < (n-i); x++){
                if(dados[x-1] > dados[x]){
                    temp = dados[x-1];
                    dados[x-1] = dados[x];
                    dados[x] = temp;
                }

            }
        }
        return 0;
    }

    @Override
    public int dadosOrdenados(int[] dados) {
        System.out.print("Os dados foram ordenados utilizando o algoritmo Bubble Sort: \n");
        for(int i=0; i < dados.length; i++){
            System.out.print(+dados[i] + " ");
        }
        System.out.print("\n");
        return 0;
    }
}
