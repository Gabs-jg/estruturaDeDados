//31. Crie um algoritmo/fluxograma/programa que rotacione os elementos de um array para a esquerda.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Lista original: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        int primeiroElemento = lista[0];

        for(int i=0; i<lista.length-1; i++) {
            lista[i] = lista[i+1];
        }

        lista[lista.length-1] = primeiroElemento;

        System.out.print("Lista rotacionada para a esquerda: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
