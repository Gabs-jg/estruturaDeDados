//8. Crie um algoritmo/fluxograma/programa que multiplique cada elemento de um array por um valor específico.

package ExerciciosDeRevisao.Lista2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Digite o valor para multiplicar com o valor da posição " + (i + 1) + " da lista: ");
                lista[i] = lista[i] * sc.nextInt();
        }
        System.out.print("[");

        for (int i = 0; i < lista.length; i++) {
            if (i == lista.length - 1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
