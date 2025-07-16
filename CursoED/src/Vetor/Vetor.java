package Vetor;
public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
     * public void adiciona(String elemento) {
     * for(int i=0; i<this.elementos.length; i++) {
     * if(this.elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break;
     * }
     * }
     * }
     */

    public void adiciona(String elemento) /*throws Exception*/ {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } /*else {
            throw new Exception("Vetor cheio. Não é possível adicionar mais elementos.");
        } Esse código lançaria uma exceção caso o vetor estivesse cheio e se não existisse
           o método aumentarCapacidade() */
    }

    public void adiciona(int posicao, String elemento) throws ArrayIndexOutOfBoundsException /*ArrayIndexOutOfBoundsException*/{
        if (posicao < 0 || posicao > tamanho) {
            throw new ArrayIndexOutOfBoundsException("Posição não existe no vetor");
        }

        this.aumentaCapacidade();

        /*
        Esse código lançaria uma exceção se não tivesse mais espaço no vetor
        e caso não existisse o método aumentarCapacidade()
            if (this.tamanho >= this.elementos.length) {
                throw new ArrayIndexOutOfBoundsException("Vetor com capacidade máxima atingida.");
            }
        */
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length*2];
            for(int i=0; i<this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public String busca(int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição não existe no vetor.");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(String elemento) {
        int ultimaPosicao = -1;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                ultimaPosicao = i;
            }
        }
        return ultimaPosicao;
    }

    public void remove(int posicao) {
        if(posicao < 0 || posicao>tamanho) {
            throw new ArrayIndexOutOfBoundsException("Posição do vetor não existe.");
        }
        for(int i=posicao; i<this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        //elementos[tamanho] = null; Código para apagar o dado.
        this.tamanho--;
        // a  c  d  d
        // 0  1  2  3
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
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

        /*
         * String s = "[";
         * for(int i=0; i<tamanho-1; i++) {
         * s += this.elementos[i];
         * s += ", ";
         * 
         * if(this.tamanho>0) {
         * s += this.elementos[i];
         * }
         * }
         * return s + "]";
         */
    }
}