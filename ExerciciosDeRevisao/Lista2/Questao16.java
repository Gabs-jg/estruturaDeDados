//16. Crie um algoritmo/fluxograma/programa que encontre e imprima o índice da primeira ocorrência de um elemento específico em um array. Caso ele não esteja deve-se imprimir -1.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Digite um número para descobrir a primeira posição dele na lista: (Se '-1' o número não está na lista): ");
        int num = sc.nextInt();
        boolean naoContem = false;

        for(int i=0; i<lista.length; i++) {
            if(lista[i] == num) {
                System.out.println("A primeira posição do número " + num + " é: " + i + ".");
                break;
            }
            if(lista[i] != num) {
                naoContem = true;
            }
        }
        if(naoContem) {
            System.out.println(-1);
        }
        sc.close();
    }
}
