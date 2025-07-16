package Fila;
public class Fila<T> {
    protected T[] elementos;
    protected int tamanho;

    public Fila() {
        this(10);
    }

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void enfileira(T elemento) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;

        // this.elementos[this.tamanho++] = elemento  #Opção mais simplificada 
    }

    public T desenfileira() {
        T dadoInicio = null;
        final int POS = 0;
        if(!(this.estaVazia())) {
            dadoInicio = elementos[POS];
            for(int i=POS; i<tamanho-1; i++) {
                elementos[i] = elementos[i+1];
            }
            tamanho--;
        }
        return dadoInicio;
    }

    public T espia() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
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
