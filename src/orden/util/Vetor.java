package orden.util;

import java.util.Scanner;

public class Vetor {

    private int[] valorVetor;
    private int tamanho;

    public void inserirVetor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor que seja maior que 4: ");
        tamanho = sc.nextInt();
        valorVetor = new int[tamanho];
        for (int i = 0; i < valorVetor.length; i++) {
            System.out.println("* Insira o valor da posicao " + i + ": ");
            valorVetor[i] = sc.nextInt();
        }
    }

    public int[] getValorVetor() {
        return this.valorVetor;
    }

    public int getTamanho() {
        return this.tamanho;
    }

}
