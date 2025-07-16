package Heap;

public class Heap {
    private int vetor[];
    private int n;

    public Heap(int tamanho) {
        this.vetor = new int[tamanho];
    }

    public void inserir(int elemento) {
        this.vetor[++n] = elemento;
        subir(n);
    }

    private void subir(int filho) {
        int pai = filho / 2;
        if (pai >= 1) {
            if (this.vetor[filho] > this.vetor[pai]) {
                int aux = this.vetor[pai];
                this.vetor[pai] = this.vetor[filho];
                this.vetor[filho] = aux;
                subir(pai);
            }
        }
    }

    public int remover() {
        int removido = this.vetor[1];
        this.vetor[1] = this.vetor[n];
        this.n--;
        descer(1);
        return removido;
    }

    private void descer(int pai) {
        int filhoEsquerdo = pai*2;
        int filhoDireito = (pai*2) + 1;
        int maior = pai;
        if((filhoEsquerdo<=n) && this.vetor[filhoEsquerdo] > this.vetor[maior]) {
            maior = filhoEsquerdo;
        }
        if((filhoDireito<=n) && this.vetor[filhoDireito] > this.vetor[maior]) {
            maior = filhoDireito;
        }
        if(maior != pai) {
            int aux = this.vetor[pai];
            this.vetor[pai] = this.vetor[maior];
            this.vetor[maior] = aux;
            descer(maior);
        }
    }
}