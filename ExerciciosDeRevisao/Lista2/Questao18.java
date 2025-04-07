//18. Crie um algoritmo/fluxograma/programa que multiplique os elementos de dois arrays e armazene o resultado em um terceiro array.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho das listas que serão multiplicadas: ");
        int lista1[] = new int[sc.nextInt()];
        int lista2[] = new int[lista1.length];
        int lista3[] = new int[lista1.length];

        for(int i=0; i<lista1.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista 1: " );
            lista1[i] = sc.nextInt();
        }

        for(int i=0; i<lista2.length; i++) {
            System.out.print("D:igite o valor da posição " + (i+1) + " da lista 2: ");
            lista2[i] = sc.nextInt();
        }

        for(int i=0; i<lista1.length; i++) {
            lista3[i] = lista1[i] * lista2[i];
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

        System.out.print("Lista resultado da multiplicação entre lista 1 e lista 2: [");
        for(int i=0; i<lista3.length; i++) {
            if(i==lista3.length-1) {
                System.out.print(lista3[i]);
            } else {
                System.out.print(lista3[i] + ", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
