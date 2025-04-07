//13. Crie um algoritmo/fluxograma/programa que copie os elementos de um array para outro. Imprima-os para mostrar que estão iguais.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista1[] = new int[sc.nextInt()];
        int lista2[] = new int[lista1.length];

        for(int i=0; i<lista1.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista1[i] = sc.nextInt();
        }

        for(int i=0; i<lista1.length; i++) {
            lista2[i] = lista1[i];
        }
        System.out.print("Lista 1: [");
        for(int i=0; i<lista1.length; i++) {
            if(i==lista1.length-1) {
                System.out.print(lista1[i]);
            } else {
                System.out.print(lista1[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.print("Lista 2: [");
        for(int i=0; i<lista2.length; i++) {
            if(i==lista2.length-1) {
                System.out.print(lista2[i]);
            } else {
                System.out.print(lista2[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
