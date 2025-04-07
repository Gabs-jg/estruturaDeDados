//35. Crie um algoritmo/fluxograma/programa que remova um elemento de uma posição específica de um array. Diminuindo o tamanho do array.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + i + " da lista: ");
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

        System.out.print("Informe a posição da lista em que deseja remover o elemento: ");
        int posicao = sc.nextInt();

        if(posicao < 0 || posicao>lista.length) {
            System.out.println("Posição inválida.");
            sc.close();
            return;
        }

        int novaLista[] = new int[lista.length-1];

        for(int i=0; i<posicao; i++) {
            novaLista[i] = lista[i];
        }

        for(int i=posicao+1; i<lista.length; i++) {
            novaLista[i - 1] = lista[i];
        }

        System.out.print("Lista com a exclusão do elemento da posição " + posicao + ": [");
        for(int i=0; i<novaLista.length; i++) {
            if(i==novaLista.length-1) {
                System.out.print(novaLista[i]);
            } else {
                System.out.print(novaLista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
