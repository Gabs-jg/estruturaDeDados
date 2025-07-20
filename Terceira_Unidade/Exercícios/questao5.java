package Terceira_Unidade.Exercícios;

/**
 * Classe principal para contar o número de nós internos em uma árvore binária.
 * Um nó interno é aquele que possui pelo menos um filho.
 */
public class questao5 {
    /**
     * Conta o número de nós internos em uma árvore binária de forma recursiva.
     * Um nó interno é aquele que possui pelo menos um filho.
     * @param raiz Nó raiz da árvore.
     * @return Número total de nós internos.
     */
    public static int contarNosInternos(No raiz) {
        if (raiz == null) {
            return 0;
        }

        // Se for folha (sem filhos), não conta
        if (raiz.esquerda == null && raiz.direita == null) {
            return 0;
        }

        // Se tiver pelo menos um filho, conta 1 + filhos internos
        return 1 + contarNosInternos(raiz.esquerda) + contarNosInternos(raiz.direita);
    }

    /**
     * Método principal para testar a contagem de nós internos.
     * Cria uma árvore binária e exibe o total de nós internos.
     */
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.direita = new No(6);

        int internos = contarNosInternos(raiz);
        System.out.println("Total de nós internos: " + internos);  // Saída esperada: 3 (nós 1, 2, 3)
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