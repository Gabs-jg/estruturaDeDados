//3. Faça um programa que leia 4 notas, mostre as notas e a média na tela.

package ExerciciosDeRevisao.Lista1;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notas[] = new int[4];
        int soma = 0;

        for(int i=0; i<notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }

        double media = (double)soma/notas.length;

        System.out.println("A média das notas foi: " + media + ".");
        sc.close();
    }
}
