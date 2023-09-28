import java.util.Arrays;
import java.util.Scanner;

import orden.BubleSort;
import orden.HeapSort;
import orden.MergeSort;
import orden.QuickSort;
import orden.util.Texto;
import orden.util.Vetor;

public class Parametros {

    public void retorno() {
        Scanner sc = new Scanner(System.in);
        Texto tx = new Texto();

        System.out.println(tx.introducao());

        System.out.println(tx.metodoUsado());
        int ordenacao = sc.nextInt();

        /* Quick */
        if (ordenacao == 1) {
            Vetor vetor = new Vetor();
            QuickSort quickSort = new QuickSort();
            vetor.inserirVetor();

            System.out.println("Antes : " + Arrays.toString(vetor.getValorVetor()));
            
            quickSort.quickSort(vetor.getValorVetor(), 0, vetor.getValorVetor().length - 1);

            System.out.println("\n****************************************\n");
            System.out.println("Ordenado : " + Arrays.toString(vetor.getValorVetor()));
            System.out.println("\n****************************************\n");
        }

        if (ordenacao == 2) {
            /* Merge */
            Vetor vetor = new Vetor();
            MergeSort mergeSort = new MergeSort();
            vetor.inserirVetor();

            System.out.println("Antes : " + Arrays.toString(vetor.getValorVetor()));

            mergeSort.mergeSort(vetor.getValorVetor());

            System.out.println("\n****************************************\n");
            System.out.println("Ordenado : " + Arrays.toString(vetor.getValorVetor()));
            System.out.println("\n****************************************\n");
        }

        if (ordenacao == 3) {
            /* Hapsort */
            Vetor vetor = new Vetor();
            HeapSort heapSort = new HeapSort();
            vetor.inserirVetor();

           System.out.println("Antes : " + Arrays.toString(vetor.getValorVetor()));

            heapSort.heapSort(vetor.getValorVetor());

            System.out.println("\n****************************************\n");
            System.out.println("Ordenado : " + Arrays.toString(vetor.getValorVetor()));
            System.out.println("\n****************************************\n");
        }

        if (ordenacao == 4) {
            /* BubleSort */
            Vetor vetor = new Vetor();
            BubleSort bubleSort = new BubleSort();
            vetor.inserirVetor();

           System.out.println("Antes : " + Arrays.toString(vetor.getValorVetor()));

            bubleSort.bubleSort(vetor.getValorVetor());

            System.out.println("\n****************************************\n");
            System.out.println("Ordenado : " + Arrays.toString(vetor.getValorVetor()));
            System.out.println("\n****************************************\n");
        } else {
            retorno();
        }
    }
}
