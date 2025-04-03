//11. Crie um algoritmo/fluxograma/programa que encontre e escreva a média dos elementos de um array.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Quetsao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            lista[i] = sc.nextInt();
        }

        int soma = 0;
        double media = 0;
        for(int i=0; i<lista.length; i++) {
            soma += lista[i];
            media = soma / lista.length;
        }
        System.out.println("A média dos valores da lista é: " + media + ".");
        sc.close();
    }
}
