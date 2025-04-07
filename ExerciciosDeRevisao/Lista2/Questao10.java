//10. Crie um algoritmo/fluxograma/programa que substitua todos os elementos negativos em um array por zero.
package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("[");
        for(int i=0; i<lista.length; i++) {
            if(lista[i] < 0) {
                lista[i] = 0;
            }
            if(i == lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
