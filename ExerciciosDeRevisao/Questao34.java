//34. Crie um algoritmo/fluxograma/programa que insira um elemento em uma posição específica de um array.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + i + " da lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Lista original: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.print("Digite o número que queira adicionar na lista: ");
        int num = sc.nextInt();

        System.out.print("Informe a posição que queira adicionar o número: ");
        int pos = sc.nextInt();


        if(pos<0 || pos>lista.length) {
            System.out.println("Posição inválida.");
            sc.close();
            return;
        }

        int novaLista[] = new int[lista.length+1];
        for(int i=0; i<pos; i++) {
            novaLista[i] = lista[i];
        }

        novaLista[pos] = num;

        for(int i=pos; i<lista.length; i++) {
            novaLista[i+1] = lista[i];
        }

        System.out.print("Lista com elemento adicionado: [");
        for(int i=0; i<novaLista.length; i++) {
            if(i==novaLista.length-1) {
                System.out.print(novaLista[i]);
            } else {
                System.out.print(novaLista[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
