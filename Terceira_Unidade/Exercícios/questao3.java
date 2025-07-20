package Terceira_Unidade.Exercícios;

public class questao3 {
    // Método recursivo para calcular altura da árvore
    public static int calcularAltura(No raiz) {
        if (raiz == null) {
            return 0; // Árvore vazia tem altura 0
        }
        int alturaEsquerda = calcularAltura(raiz.esquerda);
        int alturaDireita = calcularAltura(raiz.direita);

        return 1 + Math.max(alturaEsquerda, alturaDireita);
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

