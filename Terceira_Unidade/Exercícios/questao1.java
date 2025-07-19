package Terceira_Unidade.Exercícios;

/**
 * Classe principal para contar o número de nós em uma árvore binária.
 * @author João Gabriel Oliveira Magalhães
 * @version 1.0
 */
public class questao1 {
    /**
     * Conta o número de nós de uma árvore binária usando pós-ordem.
     * @param raiz Nó raiz da árvore.
     * @return Número total de nós.
     */
    public static int contarNos(No raiz) {
        if (raiz == null) {
            return 0;
        }
        // Pós-ordem: esquerda → direita → nó
        int totalEsquerda = contarNos(raiz.esquerda);
        int totalDireita = contarNos(raiz.direita);
        return 1 + totalEsquerda + totalDireita;
    }

    /**
     * Método principal para testar a contagem de nós.
     * Cria uma árvore binária e exibe o total de nós.
     */
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);

        int total = contarNos(raiz);
        System.out.println("Total de nós: " + total);
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