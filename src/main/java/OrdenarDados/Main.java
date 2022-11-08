package OrdenarDados;

public class Main {
    public static void main(String[] args) {

        int[] numeros={310,114,7,8};
        BubbleSort ordenar=new BubbleSort();
        ordenar.BubbleSort();
        ordenar.ordenarDados(numeros);
        ordenar.dadosOrdenados(numeros);


        int[] num={423,111,9,10};
        SelectionSort ordenarNumeros=new SelectionSort();
        ordenarNumeros.SelectionSort();
        ordenarNumeros.ordenarDados(num);
        ordenarNumeros.dadosOrdenados(num);

        int[] number={800,7,90,8};
        InsertionSort numbers=new InsertionSort();
        numbers.InsertionSort();
        numbers.ordenarDados(number);
        numbers.dadosOrdenados(number);
    }
}