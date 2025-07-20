package Terceira_Unidade.Exercícios;

public class questao6 {
    // Retorna o maior valor encontrado na árvore
    public static int encontrarMaiorValor(No raiz) {
        if (raiz == null) {
            return Integer.MIN_VALUE; // Valor mínimo possível para comparação
        }

        int maiorEsquerda = encontrarMaiorValor(raiz.esquerda);
        int maiorDireita = encontrarMaiorValor(raiz.direita);

        return Math.max(raiz.valor, Math.max(maiorEsquerda, maiorDireita));
    }

    public static void main(String[] args) {
        No raiz = new No(7);
        raiz.esquerda = new No(3);
        raiz.direita = new No(10);
        raiz.esquerda.esquerda = new No(1);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(9);
        raiz.direita.direita = new No(12);

        int maior = encontrarMaiorValor(raiz);
        System.out.println("Maior valor na árvore: " + maior); // Saída esperada: 12
    }

}

class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
