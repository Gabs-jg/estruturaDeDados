//1. Crie um algoritmo/fluxograma/programa que declare um array de inteiros e imprima seus elementos.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length;  i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.print("[");
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