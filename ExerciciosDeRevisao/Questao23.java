//23. Crie um algoritmo/fluxograma/programa que crie um novo array a partir de outros dois arrays.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista 1: ");
        int lista1[] = new int[sc.nextInt()];
        System.out.print("Informe o tamanho da lista 2: ");
        int lista2[] = new int[sc.nextInt()];
        int lista3[] = new int[lista1.length + lista2.length];

        for(int i=0; i<lista1.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista 1: ");
            lista1[i] = sc.nextInt();
        }

        for(int i=0; i<lista2.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista 2: ");
            lista2[i] = sc.nextInt();
        }

        for(int i=0; i<lista1.length; i++) {
            lista3[i] = lista1[i];
        }

        for(int i=0; i<lista2.length; i++) {
            lista3[i+(lista2.length)] = lista2[i];
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

        System.out.print("Lista 3: [");
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
