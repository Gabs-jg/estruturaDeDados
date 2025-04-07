//30. Crie um algoritmo/fluxograma/programa que remova os elementos repetidos de um array.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao30 {
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

        int indice = 0;

        for(int i=0; i<lista.length; i++) {
            boolean duplicado = false;

            for(int j=0; j<indice; j++) {
                if(lista[i] == lista[j]) {
                    duplicado = true;
                    break;
                }
            }

            if(!duplicado) {
                lista[indice++] = lista[i];
            }
        }

        System.out.print("Lista com a exclusão de números repetidos: [");
        for(int i=0; i<indice; i++) {
            if(i==indice-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
