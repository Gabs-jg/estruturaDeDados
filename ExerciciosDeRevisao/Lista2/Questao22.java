//22. Crie um algoritmo/fluxograma/programa que conte e imprima o número de vogais em um array de caracteres.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da lista: ");
        char lista[] = new char[sc.nextInt()];
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        int quantVogais = 0;

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o caracter da posição " + (i+1) + " da lista: ");
            lista[i] = sc.next().charAt(0);
        }

        for(int i=0; i<lista.length; i++) {
            for(int j=0; j<vogais.length; j++) {
                if(lista[i]==vogais[j]) {
                    quantVogais++;
                }
            }
        }

        System.out.println("A quantidade de vogais na lista é: " + quantVogais + ".");
        sc.close();
    }
}
