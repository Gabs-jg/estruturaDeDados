//32. Crie um algoritmo/fluxograma/programa que implemente uma busca binária em um array ordenado.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor para preencher a lista: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Informe o número que deseja buscar: ");
        int num = sc.nextInt();

        int resultado = buscaBinaria(lista, num);

        if(resultado != -1) {
            System.out.println("Número encontrado na posição " + resultado + ".");
        } else {
            System.out.println("Número não encontrado na lista.");
        }

        sc.close();
    }

    public static int buscaBinaria(int lista[], int num) {
        int inicio = 0;
        int fim = lista.length-1;

        while(inicio <= fim) {
            int meio = (inicio+fim) / 2;

            if(lista[meio] == num) {
                return meio;
            } else if(lista[meio] < num) {
                inicio = meio+1;
            } else {
                fim = meio-1;
            }
        }
        return -1;
    }
}
