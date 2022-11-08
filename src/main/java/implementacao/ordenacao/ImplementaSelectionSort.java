package implementacao.ordenacao;

public class ImplementaSelectionSort implements Ordenar_dados{
    @Override
    public int ordenarDados(int[] dados) {
        int n = dados.length;
        for (int i = 0; i < n-1; i++)
        {
            int index = i;
            int min = dados[i];
            for (int j = i+1; j < n; j++)
            {
                if (dados[j] < dados[index])
                {
                    index = j;
                    min = dados[j];
                }
            }
            int t = dados[index];
            dados[index] = dados[i];
            dados[i] = t;
        }
        return 0;
    }

    @Override
    public int dadosOrdenados(int[] dados) {
        System.out.print("Os dados foram ordenados utilizando o algoritmo Selection sort: \n");
        for(int i=0; i < dados.length; i++){
            System.out.print(dados[i] + " ");
        }
        System.out.print("\n");
        return 0;
    }
}
