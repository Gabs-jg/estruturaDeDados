//14. Crie um algoritmo/fluxograma/programa que ordene os elementos de um array em ordem crescente.

package ExerciciosDeRevisao;
import java.util.Arrays;
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Lista padrão: [");
        for(int i=0; i<lista.length; i++) {
            if(i == lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        Arrays.sort(lista);
        System.out.print("Lista ordenada: [");
        for(int i=0; i<lista.length; i++) {
            if(i == lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
