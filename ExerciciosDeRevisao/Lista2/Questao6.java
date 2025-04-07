//6. Crie um algoritmo/fluxograma/programa que calcule e mostre a soma de todos os elementos em um array.
package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        int soma = 0;
        for(int i=0; i<lista.length; i++) {
            soma+= lista[i];
        }
        System.out.println("A soma de todos os elementos da lista é: " + soma + ".");
        sc.close();
    }
}
