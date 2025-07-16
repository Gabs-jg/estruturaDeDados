package Pilha;
public class Pilha<T> {
    private T[] elementos;
    private int tamanho;

    public Pilha() {
        this(10);
    }

    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public void empilha(T elemento) {
        this.aumentaCapacidade();
        this.elementos[tamanho] = elemento;
        tamanho++;
    }

    public T desempilha() {
        if(estaVazia()) {
            return null;
        }
        // return this.elementos[--tamanho]; Outra opção.
        T elemento = this.elementos[this.tamanho-1]; 
        this.elementos[this.tamanho-1] = null;
        this.tamanho--; // Ou apenas essa linha de código para não perder o dado desempilhado.
        return elemento;
    }

    public void atualizar(T elemento) { //Interessante usar uma exceção.
        if(!(estaVazia())) {
            this.elementos[tamanho-1] = elemento;
        } else {
            System.out.println("Pilha vazia.");
        }
    }

    public T espia() {
        if(estaVazia()) {
            return null;
        }
        return elementos[tamanho-1];
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
