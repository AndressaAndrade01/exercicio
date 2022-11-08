import OrdenarDados.BubbleSort;
import OrdenarDados.InsertionSort;
import OrdenarDados.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMetodoOrdenacao {

   @Test
    public void testeInsertionSort() {
        InsertionSort ordenar=new InsertionSort();
        int[] desordenado={3,2,1};
        int[] ordenado={1,2,3};
        ordenar.InsertionSort();
        ordenar.ordenarDados(desordenado);
        assertArrayEquals(desordenado,ordenado);
    }
    @Test
    public void testeSelectionSort() {
        SelectionSort ordena=new SelectionSort();
        int[] desordenado={300,2,10};
        int[] ordenado={2,10,300};
        ordena.SelectionSort();
        ordena.ordenarDados(desordenado);
        assertArrayEquals(desordenado,ordenado);
    }
    @Test
    public void testeBubleSort1() {
        BubbleSort ordenarNumeros=new BubbleSort();
        int[] desordenado={30,21,42};
        int[] ordenado={21,30,42};
        ordenarNumeros.BubbleSort();
        ordenarNumeros.ordenarDados(desordenado);
        assertArrayEquals(desordenado,ordenado);
    }
    @Test
    public void testeBubleSort2() {
        BubbleSort ordenarNum=new BubbleSort();
        int[] desordenado={30,21,42};
        int[] ordenadoErrado={21,42,30};
        ordenarNum.BubbleSort();
        ordenarNum.ordenarDados(desordenado);
        assertArrayEquals(desordenado,ordenadoErrado);
    }
}
