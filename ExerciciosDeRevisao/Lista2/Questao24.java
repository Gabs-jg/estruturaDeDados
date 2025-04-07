//24. Crie um algoritmo/fluxograma/programa que insira um novo elemento em uma posição específica de um array. O usuário deve informar a posição e o elemento.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + i + " da lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Digite o valor que queira inserir na lista: ");
        int valor = sc.nextInt();

        System.out.print("Informe a posição da lista que quer modificar: (0-" + (lista.length-1) + ")");
        int posicao = sc.nextInt();

        System.out.print("Lista original: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        lista[posicao] = valor;

        System.out.print("Lista modificada: [");
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
