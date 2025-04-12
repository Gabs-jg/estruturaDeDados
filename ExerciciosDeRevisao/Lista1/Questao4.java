//4. Faça um programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

package ExerciciosDeRevisao.Lista1;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letras[] = new char[10];
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        int quantConsoantes = 0;

        for(int i=0; i<letras.length; i++) {
            System.out.print("Digite a letra da posição " + (i+1) + " da lista: ");
            letras[i] = sc.next().charAt(0);
        }

        
    }
}
