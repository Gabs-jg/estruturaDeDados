//12. Crie um algoritmo/fluxograma/programa que verifique e informe se um determinado valor está presente em um array.
package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Digite o número que deseja verificar se está presente na lista: ");
        int num = sc.nextInt();
        boolean estaPresente = false;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] == num) {
                estaPresente = true;
            }
        }
        if(estaPresente) {
            System.out.println("O número " + num + " está presente na lista.");
        } else {
            System.out.println("O número " + num + " não está presente na lista.");
        }
        sc.close();
    }
}
