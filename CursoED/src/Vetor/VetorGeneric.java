package Vetor;
import java.lang.reflect.Array;

public class VetorGeneric<T> {
    private T[] elementos;
    private int tamanho;

    public VetorGeneric(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    /*
     * public VetorGeneric(int capacidade) {
     * this.elementos = (T[]) Array.newInstance(tipoClass, capacidade);
     * this.tamanho = 0;
     * } Segunda opção para instanciar um vetor dinamicamente
     */

    public void adiciona(T elemento) {
        this.aumentaCapacidade();

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;

    }

    public void adiciona(int posicao, T elemento) throws ArrayIndexOutOfBoundsException {
        if (posicao < 0 || posicao > tamanho) {
            throw new ArrayIndexOutOfBoundsException("Posição não existe no vetor");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
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

    public T obtem(int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição não existe no vetor.");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // Código iterando o vetor do final para o começo.
        // A depender pode ser mais rápido, pois retorna o primeiro indíce que
        // encontrar.

        /*
         * int ultimaPosicao = -1;
         * for (int i = 0; i < this.tamanho; i++) {
         * if (this.elementos[i].equals(elemento)) {
         * ultimaPosicao = i;
         * }
         * }
         * return ultimaPosicao; Código iterando o vetor do começo para o final.
         */
    }

    public void remove(int posicao) throws ArrayIndexOutOfBoundsException {
        if (posicao < 0 || posicao > tamanho) {
            throw new ArrayIndexOutOfBoundsException("Posição do vetor não existe.");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove(T elemento) {
        int posicao = this.busca(elemento);
        if (posicao >= 0) {
            this.remove(posicao);
        }
    }

    public void limpar() {
        for (int i = this.tamanho; i > 0; i--) {
            elementos[i] = null;
            this.tamanho--;
        }

        /*
         * this.elementos = (T[]) new Object[this.elementos.length]) #Opção 1
         * 
         * this.tamanho = 0; #Opção 2
         * 
         * for(int i=0; i<this.tamanho; i++) { #Opção 3. Do começo para o final.
         * elementos[i] = null;
         * }
         * this.tamanho = 0;
         */
    }

    public boolean contem(T elemento) {
        return busca(elemento) >= 0; // Ou >-1

        /*
         * int pos = busca(elemento);
         * if(pos>=0) {
         * return true;
         * }
         * return false; Faz a mesma coisa que o código acima.
         * 
         * for (int i = 0; i < this.tamanho; i++) {
         * if (this.elementos[i].equals(elemento)) {
         * return true;
         * }
         * }
         * return false; Código mais extenso
         */
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