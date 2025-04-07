//1. Faça um programa que leia um vetor de 5 números inteiros e mostre-os.

package ExerciciosDeRevisao.Lista1;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lista[] = new int[5];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Lista: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
