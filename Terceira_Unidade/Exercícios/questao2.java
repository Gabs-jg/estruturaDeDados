package Terceira_Unidade.Exercícios;

/**
 * Classe principal para contar o número de folhas em uma árvore binária.
 * @author João Gabriel Oliveira Magalhães
 * @version 1.0
 */
public class questao2 {
    /**
     * Conta o número de nós folha em uma árvore binária.
     * Um nó folha é aquele que não possui filhos.
     * @param raiz Nó raiz da árvore.
     * @return Número total de folhas.
     */
    public static int contarFolhas(No raiz) {
        if (raiz == null) {
            return 0;
        }
        if (raiz.esquerda == null && raiz.direita == null) {
            return 1; // Nó folha
        }
        // Soma folhas da esquerda e direita
        return contarFolhas(raiz.esquerda) + contarFolhas(raiz.direita);
    }

    /**
     * Método principal para testar a contagem de folhas.
     * Cria uma árvore binária e exibe o total de folhas.
     */
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);

        int totalFolhas = contarFolhas(raiz);
        System.out.println("Total de folhas: " + totalFolhas); // Saída esperada: 3 (nós 4, 5, 6)
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