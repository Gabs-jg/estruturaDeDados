//27. Crie um algoritmo/fluxograma/programa que preencha um array com os números perfeitos menores que N.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para obter os números perfeitos menores que ele: ");
        int n = sc.nextInt();
        int quantidadePerfeitos = 0;

        for(int i=1; i<=n; i++) {
            if(verificarNumeroPerfeito(i)) {
                quantidadePerfeitos++;
            }
        }

        int lista[] = new int[quantidadePerfeitos];
        int indice = 0;

        for(int i=1; i<=n; i++) {
            if(verificarNumeroPerfeito(i)) {
                lista[indice] = i;
                indice++;
            }
        }

        System.out.print("Lista dos números perfeitos menores que " + n + ": [");
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

    public static boolean verificarNumeroPerfeito(int num) {
        int soma = 0;
        for(int i=1; i<num; i++) {
            if(num%i==0) {
                soma += i;
            }
        }
        return soma == num;
    }
}
