//4. Crie um algoritmo/fluxograma/programa que encontre o maior e o menor número em um array e imprima-os na tela.
package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        int maiorValor = 0;
        int menorValor = 1;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] > maiorValor) {
                maiorValor = lista[i];
            }
            if(lista[i] < menorValor) {
                menorValor = lista[i];
            }
        }
        System.out.println("O maior valor informado foi: " + maiorValor + ". E o menor valor foi: " + menorValor + ".");
        sc.close();
    }
}
