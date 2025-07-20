package Terceira_Unidade.Exercícios;

public class questao5 {
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
}

class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
