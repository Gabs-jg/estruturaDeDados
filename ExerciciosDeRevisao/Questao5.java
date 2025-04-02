//5. Crie um algoritmo/fluxograma/programa que encontre o segundo maior elemento em um array.
package ExerciciosDeRevisao;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho do array: ");
        int lista[] = new int[sc.nextInt()];

        for(int i=0; i<lista.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            lista[i] = sc.nextInt();
        }

        int maiorValor = 0;
        int segundoMaiorValor = 0;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] > maiorValor) {
                segundoMaiorValor = maiorValor;
                maiorValor = lista[i];
            }
            
            if(lista[i] > segundoMaiorValor & lista[i] < maiorValor) {
                segundoMaiorValor = lista[i];
            }
        }
        System.out.println("O segundo maior valor da lista é: " + segundoMaiorValor + ".");
        sc.close();
     }
    
}
