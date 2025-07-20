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

    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);

        int altura = calcularAltura(raiz);
        System.out.println("Altura da árvore: " + altura); // Saída esperada: 3
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
