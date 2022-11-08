package OrdenarDados;

import implementacao.ordenacao.Ordenar_dados;

public abstract class MetodoOrdenacao {

    Ordenar_dados implementa;

    public int ordenarDados(int[] dados)
    {
        return implementa.ordenarDados(dados);
    }
    public int dadosOrdenados(int[] dados)
    {
        return implementa.dadosOrdenados(dados);
    }

}
