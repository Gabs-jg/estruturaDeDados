//7. Crie um algoritmo/fluxograma/programa que calcule a soma dos elementos em posições pares de um array.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho do array: ");
        int lista[] = new int[sc.nextInt()];
        
        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            lista[i] = sc.nextInt();
        }

        int somaPar = 0;
        for(int i=0; i<lista.length; i++) {
            if(i%2 == 0) {
                somaPar+= lista[i];
            }
        }
        System.out.println("A soma dos elementos em posições pares é: " + somaPar);
        sc.close();
    }
}
