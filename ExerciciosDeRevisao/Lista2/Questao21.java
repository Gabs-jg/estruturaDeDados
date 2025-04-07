//21. Crie um algoritmo/fluxograma/programa que substitua todas as vogais em um array de caracteres por asteriscos.

package ExerciciosDeRevisao.Lista2;
import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        char lista[] = new char[sc.nextInt()];
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o caracter da posição " + (i+1) + " da lista: ");
            lista[i] = sc.next().charAt(0);
        }

        System.out.print("Lista de caracteres original: ");
        for(int i=0; i<lista.length; i++) {
            if(i==lista.length-1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println("]");

        for(int i=0; i<lista.length; i++) {
            for(int j=0; j<vogais.length; j++) {
                if(lista[i] == vogais[j]) {
                    lista[i] = '*';
                }
            }
        }

        System.out.print("Lista de caracteres sem as vogais: ");
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
