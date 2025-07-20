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
}

class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
