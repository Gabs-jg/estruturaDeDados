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

    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);

        int totalFolhas = contarFolhas(raiz);
        System.out.println("Total de folhas: " + totalFolhas); // Saída esperada: 3 (nós 4, 5, 6)
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
