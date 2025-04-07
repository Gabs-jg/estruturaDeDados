//28. Crie um algoritmo/fluxograma/programa que preencha um array com os primeiros N números da sequência de Fibonacci.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista para obter a sequência Fibonacci: ");
        int lista[] = new int[sc.nextInt()];
        lista[0] = 0;
        lista[1] = 1;

        for(int i=2; i<lista.length; i++) {
            lista[i] = lista[i - 1] + lista[i - 2];
        }

        System.out.print("Lista com os primeiros " + lista.length + " números da sequência de Fibonnaci: ");
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
