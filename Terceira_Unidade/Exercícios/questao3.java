package Terceira_Unidade.Exercícios;

/**
 * Classe principal para calcular a altura de uma árvore binária.
 * @author João Gabriel Oliveira Magalhães
 * @version 1.0
 */
public class questao3 {
    /**
     * Calcula a altura de uma árvore binária de forma recursiva.
     * A altura é definida como o número de níveis da árvore.
     * Uma árvore vazia tem altura 0.
     * @param raiz Nó raiz da árvore.
     * @return Altura da árvore.
     */
    public static int calcularAltura(No raiz) {
        if (raiz == null) {
            return 0; // Árvore vazia tem altura 0
        }
        int alturaEsquerda = calcularAltura(raiz.esquerda);
        int alturaDireita = calcularAltura(raiz.direita);

        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }

    /**
     * Método principal para testar o cálculo da altura.
     * Cria uma árvore binária e exibe sua altura.
     */
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);

        int altura = calcularAltura(raiz);
        System.out.println("Altura da árvore: " + altura); // Saída esperada: 3
    }
}

/**
 * Classe que representa um nó da árvore binária.
 */
class No {
    int valor;         // Valor armazenado no nó
    No esquerda, direita; // Referências para os filhos esquerdo e direito

    /**
     * Construtor do nó.
     * @param valor Valor a ser armazenado.
     */
    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}