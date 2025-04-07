//29. Crie um algoritmo/fluxograma/programa que preencha um array com os N primeiros termos da sequência de Lucas.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista para obter a sequência de Lucas: ");
        int lista[] = new int[sc.nextInt()];
        lista[0] = 2;
        lista[1] = 1;

        for(int i=2; i<lista.length; i++) {
            lista[i] = lista[i -1] + lista[i - 2];
        }

        System.out.print("Lista dos primeiros " + lista.length + " números da sequência de Lucas: ");
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
