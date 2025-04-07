//33. Crie um algoritmo/fluxograma/programa que adicione um novo elemento ao final de um array. Imprima o antes e o depois.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao33 {
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

        int novaLista[] = new int[lista.length+1];
        for(int i=0; i<lista.length; i++) {
            novaLista[i] = lista[i];
        }

        System.out.print("Digite o valor que queira adicionar na lista: ");
        novaLista[lista.length] = sc.nextInt();

        System.out.print("Lista com valor adicionado: [");
        for(int i=0; i<novaLista.length; i++) {
            if(i==novaLista.length-1) {
                System.out.print(novaLista[i]);
            } else {
                System.out.print(novaLista[i] + ", ");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
