//17. Crie um algoritmo/fluxograma/programa que verifique se dois arrays são iguais.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho das listas: ");
        int lista1[] = new int[sc.nextInt()];
        int lista2[] = new int[lista1.length];

        for(int i=0; i<lista1.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista 1: ");
            lista1[i] = sc.nextInt();
        }

        for(int i=0; i<lista2.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + " da lista 2: ");
            lista2[i] = sc.nextInt();
        }

        boolean iguais = false;

        for(int i=0; i<lista1.length; i++) {
            if(lista1[i] == lista2[i]) {
                iguais = true;
            } else {
                iguais = false;
                break;
            }
        }
        if(iguais) {
            System.out.println("As listas fornecidas são iguais.");
        } else{
            System.out.println("As listas fornecidas não são iguais.");
        }
        sc.close();
}
}
