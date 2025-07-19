package Terceira_Unidade.Exercícios;

public class questao1 {
    public static int contarNos(No raiz) {
        if (raiz == null) {
            return 0;
        }
    }

    // Pós-ordem: esquerda → direita → nó
    int totalEsquerda = contarNos(raiz.esquerda);
    int totalDireita = contarNos(raiz.direita);
    return 1+totalEsquerda+totalDireita;

    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);

        int total = contarNos(raiz);
        System.out.println("Total de nós: " + total);
    }
}

// Classe que representa um nó da árvore
class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
