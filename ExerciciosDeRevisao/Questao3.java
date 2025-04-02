//3. Crie um algoritmo/fluxograma/programa que preencha um array com os números em ordem inversa.
package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho do array: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição: " + (i+1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.print("[");
        for(int i=lista.length-1; i>=0; i--) {
            if(i > 0) {
                System.out.print(lista[i] + ", ");
            } else {
                System.out.print(lista[i]);
            }
        }
        System.out.println("]");
        sc.close();
    }
}
