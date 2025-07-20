package Terceira_Unidade.Exercícios;

/**
 * Classe principal para contar o número de nós folha em uma árvore binária.
 */
public class questao4 {
    /**
     * Conta o número de nós folha em uma árvore binária de forma recursiva.
     * Um nó folha é aquele que não possui filhos.
     * @param raiz Nó raiz da árvore.
     * @return Número total de nós folha.
     */
    public static int contarNosFolha(No raiz) {
        if (raiz == null) {
            return 0;
        }
        if (raiz.esquerda == null && raiz.direita == null) {
            return 1; // Nó folha
        }
        return contarNosFolha(raiz.esquerda) + contarNosFolha(raiz.direita);
    }

    /**
     * Método principal para testar a contagem de nós folha.
     * Cria uma árvore binária e exibe o total de nós folha.
     */
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.direita = new No(6);

        int folhas = contarNosFolha(raiz);
        System.out.println("Total de nós folha: " + folhas); // Saída esperada: 3 (nós 4, 5, 6)
    }
}

/**
 * Classe que representa um nó da árvore binária.
 */
class No {
    int valor;             // Valor armazenado no nó
    No esquerda, direita;  // Referências para os filhos esquerdo e direito

    /**
     * Construtor do nó.
     * @param valor Valor a ser armazenado.
     */
    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}