package Terceira_Unidade.Exercícios;

public class questao2 {
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
}

// Reutilizando a classe No do exercício anterior
class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
