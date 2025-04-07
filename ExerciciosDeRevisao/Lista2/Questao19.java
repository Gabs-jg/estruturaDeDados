//19. Crie um algoritmo/fluxograma/programa que inicialize um array de strings e depois inverta a ordem dos elementos do array. Imprima o antes e o depois.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        String lista[] = new String[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite a palavra da posição " + (i+1) + " da lista: ");
            lista[i] = sc.next();
        }

        System.out.print("Lista normal: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.print("Lista invertida: [");
        for(int i=lista.length-1; i>=0; i--) {
            if(i==0) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
