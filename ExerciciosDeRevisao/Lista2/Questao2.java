//2. Crie um algoritmo/fluxograma/programa que preencha um array com os quadrados dos números de 1 a N, onde N é um valor informado pelo usuário.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int n = sc.nextInt();
        int lista[] = new int[n];

        for(int i=0; i<lista.length; i++) {
                lista[i] = ((i+1)*(i+1));
        }

        System.out.print("[");
        for(int i=0; i<lista.length; i++) {
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
