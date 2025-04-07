//20. Crie um algoritmo/fluxograma/programa que remova todas as ocorrências de um texto específico em um array de strings.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        String lista[] = new String[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o texto da posição " + (i+1) + " da lista: ");
            lista[i] = sc.next();
        }
        
        System.out.print("Digite o texto que deseja remover da lista: ");
        String remover = sc.next();

        System.out.print("Lista 1 original: [");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        for(int i=0; i<lista.length; i++) {
            if(lista[i].equalsIgnoreCase(remover)) {
                lista[i] = " ";
            }
        }

        System.out.print("Lista com a remoção da palavra " + remover + ": [");
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
