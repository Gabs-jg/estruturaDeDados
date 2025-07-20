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

class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
