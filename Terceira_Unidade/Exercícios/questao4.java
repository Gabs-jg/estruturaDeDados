package Terceira_Unidade.Exercícios;

public class questao4 {
    // Método recursivo para contar nós folhas
    public static int contarNosFolha(No raiz) {
        if (raiz == null) {
            return 0;
        }
        if (raiz.esquerda == null && raiz.direita == null) {
            return 1; // Nó folha
        }
        return contarNosFolha(raiz.esquerda) + contarNosFolha(raiz.direita);
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
