//5. Faça um programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.

package ExerciciosDeRevisao.Lista1;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];
        int quantPares = 0;
        int quantImpares = 0;

        for(int i=0; i<numeros.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            numeros[i] = sc.nextInt();
            if(numeros[i]%2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
        }

        System.out.print("Lista original: [");
        for(int i=0; i<numeros.length; i++) {
            if(i==numeros.length-1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");


        int pares[] = new int[quantPares];
        int impares[] = new int[quantImpares];

        for(int i=0; i<numeros.length; i++) {
            for(int j=0; j<pares.length; j++) {
                if(numeros[i]%2 == 0) {
                    pares[j] = numeros[i];
                } else {
                    for(int k=0; k<impares.length; k++) {
                        impares[k] = numeros[i];
                    }
                }
            }
        }

        System.out.print("Lista com números pares: [");
        for(int i=0; i<pares.length; i++) {
            if(i==pares.length-1) {
                System.out.print(pares[i]);
            } else {
                System.out.print(pares[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.print("Lista com números ímpares: [");
        for(int i=0; i<impares.length; i++) {
            if(i==impares.length-1) {
                System.out.print(impares[i]);
            } else {
                System.out.print(impares[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
