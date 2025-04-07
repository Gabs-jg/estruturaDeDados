//15. Crie um algoritmo/fluxograma/programa que preencha um array com números aleatórios e, em seguida, ordene esses números de forma decrescente.
package ExerciciosDeRevisao.Lista2;

import java.util.Scanner;
import java.util.Arrays;

public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inofrme o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100);
        }

        System.out.print("Lista antes de ordenar: [");
        for (int i = 0; i < lista.length; i++) {
            if (i == lista.length - 1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        Arrays.sort(lista);

        System.out.print("Lista ordenada: [");
        for (int i = lista.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(lista[i] + ", ");
            } else {
                System.out.print(lista[i]);
            }
        }
        System.out.println("]");
        sc.close();
    }
}
