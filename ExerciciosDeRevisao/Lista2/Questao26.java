//26. Crie um algoritmo/fluxograma/programa que gere um array com os N primeiros números primos.

package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista de números primos: ");
        int primos[] = new int[sc.nextInt()];
        int num = 2;

        for(int i=0; i<primos.length; i++) {
            if(verificarPrimo(num)) {
                primos[i] = num;
                num++;
            } else {
                num++;
                i--;
            }
        }

        System.out.print("Lista dos primeiros " + primos.length + " números primos: [");
        for(int i=0; i<primos.length; i++) {
            if(i==primos.length-1) {
                System.out.print(primos[i]);
            } else {
                System.out.print(primos[i] + ", ");
            }
        }
        System.out.println("]");
        sc.close();
    }

    public static boolean verificarPrimo(int num) {
        boolean aux = true;
        if(num <= 1) {
            aux = false;
        }
        for(int i=2; i<=num /2; i++) {
            if(num%i == 0) {
                aux = false;
            }
        }
        return aux;
    }
}