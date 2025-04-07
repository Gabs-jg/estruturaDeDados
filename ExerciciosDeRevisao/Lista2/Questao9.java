//9. Crie um algoritmo/fluxograma/programa que conte e imprima o número de elementos pares em um array.
package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];
        
        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        int pares = 0;
        for(int i=0; i<lista.length; i++) {
            if(lista[i]%2==0) {
                pares++;
            }
        }
        System.out.println("O número de elementos pares da lista é: " + pares);
        sc.close();
    }
}
