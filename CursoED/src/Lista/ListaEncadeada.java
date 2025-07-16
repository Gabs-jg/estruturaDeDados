package Lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private final int NAO_ENCONTRADO = -1;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (estaVazia()) {
            this.inicio = celula;
            this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (estaVazia()) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.setElemento(elemento);
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adicionaPosEspecifica(int posicao, T elemento) throws IllegalArgumentException {
        if (this.posicaoInvalida(posicao)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        if (posicao == 0) { // Adiciona no começo
            this.adicionaInicio(elemento);
        } else if (posicao == this.tamanho) { // Adiciona no final
            this.adiciona(elemento);
        } else { // Adiciona no meio.
            No<T> noAnterior = buscaNo(posicao - 1);
            No<T> novoNo = new No(elemento);
            novoNo.setProximo(noAnterior.getProximo());
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T remove() throws NullPointerException {
        if (estaVazia()) {
            throw new NullPointerException("Lista está vazia");
        }
        T elemento = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
        if (estaVazia()) {
            this.ultimo = null;
        }
        return elemento;
    }

    public T removeFinal() throws NullPointerException {
        if (estaVazia()) {
            throw new NullPointerException("Lista está vazia");
        }
        if (this.tamanho == 1) {
            return remove();
        }

        No<T> penultimoNo = buscaNo(this.tamanho - 2);
        T exUltimo = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;
        return exUltimo;
    }

    public T removePosEspecifica(int posicao) throws NullPointerException, IllegalArgumentException {
        if (estaVazia()) {
            throw new NullPointerException("Lista está vazia");
        }
        if (this.posicaoInvalida(posicao)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        if (posicao == 0) {
            return this.remove();
        }
        if (posicao == this.tamanho - 1) {
            return this.removeFinal();
        }
        No<T> noAnterior = buscaNo(posicao-1);
        T elemento = noAnterior.getProximo().getElemento();
        No<T> proximoNo = noAnterior.getProximo().getProximo();
        noAnterior.setProximo(proximoNo);
        this.tamanho--;
        return elemento;
    }

    private boolean posicaoInvalida(int posicao) {
        return posicao < 0 || posicao > this.tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limpa() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;

        /*
         * this.inicio = null;
         * this.ultimo = null;
         * this.tamanho = 0;
         * ==Opção mais simples==
         */
    }

    private No<T> buscaNo(int posicao) throws IllegalArgumentException {
        if (this.posicaoInvalida(posicao)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();

        }
        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int posicao = 0;
        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return posicao;
            }
            posicao++;
            noAtual = noAtual.getProximo();
        }
        return NAO_ENCONTRADO;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (estaVazia()) {
            return "[]";
        }
        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        /*
         * builder.append(atual.getElemento()).append(", ");
         * while(atual.getProximo() != null) {
         * atual = atual.getProximo();
         * builder.append(atual.getElemento()).append(", ");
         * }
         * Opção de código usando while.
         */

        return builder.toString();
    }
}