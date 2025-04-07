//25. Crie um algoritmo/fluxograma/programa que verifique se um array é um palíndromo.

package ExerciciosDeRevisao.Lista2;
import java.util.Arrays;
import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];
        int listaReversa[] = new int[lista.length];
        int aux = lista.length-1;

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        for(int i=0; i<listaReversa.length; i++) {
            listaReversa[i] = lista[aux];
            aux--;
        }

        if(Arrays.equals(lista, listaReversa)) {
            System.out.println("A lista é um palíndromo.");
        } else {
            System.out.println("A lista não é um palíndromo.");
        }
        sc.close();
    }
}
