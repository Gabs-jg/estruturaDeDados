package Segunda_Unidade.ListaDinamica.src;

/**
 * Implementação de uma classe de uma lista dinâmica duplamente encadeada.
 * Essa classe implementa uma lista que pode armazenar elementos de qualquer
 * tipo, utilizando uma estrutura de nós duplamente encadeados.
 * 
 * @param <T> o tipo dos elementos que vão ser armazenados na lista.
 * @author João Gabriel Oliveira Maglhães
 * @version 1.0
 * @since 2025-06-16
 */
public class ListaDinamicaGenerica<T> implements Listavel<T> {

    /** Tamanho atual da lista. */
    private int tamanho;

    /** Ponteiro para o primeiro nó da lista. */
    private NoDuplo<T> inicio;

    /** Ponteiro para o último nó da lista. */
    private NoDuplo<T> ultimo;

    /** Constante que guarda uma String para ser usada em verificações se a posição é inválida. */
    private final String POSICAO_INVALIDA = "Posição inválida.";

    /** Constante que guarda uma String para ser usada em verificações se a lista está vazia */
    private final String ESTA_VAZIA = "Lista vazia.";

    /**
     * Construtor padrão onde seta o inicio e o ultimo como null e o tamanho como 0.
     */
    public ListaDinamicaGenerica() {
        this.tamanho = 0;
        inicio = null;
        ultimo = null;
    }

    /**
     * Método que adiciona um elemento no início da lista.
     * @param elemento elemento a ser adicionado na lista.
     */
    @Override
    public void adicionarInicio(T elemento) {
        NoDuplo<T> noTemporario = new NoDuplo<>();
        noTemporario.setDado(elemento);
        if (estaVazia()) {
            this.inicio = noTemporario;
            this.ultimo = noTemporario;
        } else {
            noTemporario.setProximo(this.inicio);
            this.inicio.setAnterior(noTemporario);
            this.inicio = noTemporario;
        }
        this.tamanho++;
    }

    /**
     * Método que adiciona um elemento no final da lista.
     * @param elemento elemento a ser adicionado na lista.
     */
    @Override
    public void adicionarFinal(T elemento) {
        NoDuplo<T> noTemporario = new NoDuplo<>();
        noTemporario.setDado(elemento);
        if (estaVazia()) {
            adicionarInicio(elemento);
            return;
        }
        this.ultimo.setProximo(noTemporario);
        noTemporario.setAnterior(this.ultimo);
        this.ultimo = noTemporario;
        this.tamanho++;
    }

    /**
     * Método que adiciona um elemento em uma posição específica da lista.
     * @param posicao posição da lista onde será adicionado o elemento.
     * @param elemento elemento a ser adicionado na lista.
     * @throws IndexOutOfBoundsException se a posição passada como parâmetro for inválida.
     */
    @Override
    public void adicionarPosEspecifica(int posicao, T elemento) throws IndexOutOfBoundsException {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        if (estaVazia() || posicao == 0) {
            adicionarInicio(elemento);
            return;
        }
        if (posicao == tamanho) {
            adicionarFinal(elemento);
            return;
        }
        NoDuplo<T> noAnterior = buscarNo(posicao - 1);
        NoDuplo<T> novoNo = new NoDuplo<>();
        novoNo.setDado(elemento);
        novoNo.setProximo(noAnterior.getProximo());
        noAnterior.setProximo(novoNo);
        novoNo.setAnterior(noAnterior);
        if (novoNo.getProximo() != null) {
            novoNo.getProximo().setAnterior(novoNo);
        }
        this.tamanho++;
    }

    /**
     * Método que seleciona e retorna um elemento de uma determinada posição.
     * @param posicao posição que contém o elemento a ser selecionado.
     * @throws IndexOutOfBoundsException se a posição passada como parâmetro for inválida.
     * @return o elemento selecionado.
     */
    @Override
    public T selecionar(int posicao) {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        NoDuplo<T> noTemporario = buscarNo(posicao);
        return noTemporario.getDado();
    }

    /**
     * Método que seleciona e retorna todos os elementos da lista.
     * @throws IndexOutOfBoundsException se a lista estiver vazia.
     * @return array contendo todos os elementos da lista.
     */
    @Override
    @SuppressWarnings("unchecked")
    public T[] selecionarTodos() throws IndexOutOfBoundsException {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        T[] dados = (T[]) java.lang.reflect.Array.newInstance(inicio.getDado().getClass(), tamanho);
        NoDuplo<T> ponteiroAux = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            dados[i] = ponteiroAux.getDado();
            ponteiroAux = ponteiroAux.getProximo();
        }
        return dados;
    }

    /**
     * Método que atualiza o elemento de uma determinada posição.
     * @param posicao posição do elemento a ser atualizado.
     * @param elemento novo elemento que irá ser adicionado na lista.
     * @throws IndexOutOfBoundsException caso a posição passada como parâmetro for inválida.
     */
    @Override
    public void atualizar(int posicao, T elemento) throws IndexOutOfBoundsException {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        NoDuplo<T> novoNo = buscarNo(posicao);
        novoNo.setDado(elemento);
    }

    /**
     * Método que apaga e retorna o elemento do início da lista.
     * @throws IndexOutOfBoundsException caso a lista esteja vazia.
     * @return o elemento que foi apagado.
     */
    @Override
    public T apagarInicio() {
        if(estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        T elemento = this.inicio.getDado();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
        if(estaVazia()) {
            this.ultimo = null;
        } else {
            this.inicio.setAnterior(null);
        }
        return elemento;
    }

    /**
     * Método que apaga e retorna o elemento do final da lista
     * @throws IndexOutOfBoundsException caso a lista esteja vazia.
     * @return o elemento que foi apagado.
     */
    @Override
    public T apagarFinal() throws IndexOutOfBoundsException {
        if(estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        if(tamanho==1) {
            return apagarInicio();
        }
        T elemento = this.ultimo.getDado();
        this.ultimo = this.ultimo.getAnterior();
        this.ultimo.setProximo(null);
        this.tamanho--;

        return elemento;
    }

    /**
     * Método que apaga e retorna um elemento de uma determinada posição da lista.
     * @param posicao posição do elemento da lista que vai ser removido.
     * @throws IndexOutOfBoundsException caso a lista esteja vazia.
     * @return o elemento que foi apagado.
     */
    @Override
    public T apagarPosEspecifica(int posicao) throws IndexOutOfBoundsException {
        if(estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        if(posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        if(tamanho==1) {
            return apagarInicio();
        }
        if(posicao == tamanho-1) {
            return apagarFinal();
        }
        NoDuplo<T> noRemovido = buscarNo(posicao);
        T elemento = noRemovido.getDado();
        noRemovido.getAnterior().setProximo(noRemovido.getProximo());
        noRemovido.getProximo().setAnterior(noRemovido.getAnterior());
        this.tamanho--;

        return elemento;
    }

    /**
     * Método que apaga todos os elementos da lista.
     */
    @Override
    public void limpar() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    /**
     * Método que verifica se a lista está vazia.
     * @return true caso esteja vazia, false caso o contrário.
     */
    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    /**
     * Método que verifica se uma posição é inválida.
     * @param posicao posição a ser verificada.
     * @return true caso a posição seja inválida, false caso contrário.
     */
    @Override
    public boolean posicaoInvalida(int posicao) {
        return posicao < 0 || posicao > this.tamanho;
    }

    /**
     * Método que percorre a lista para encontrar um nó de uma determinada posição.
     * @param posicao posição do nó a ser buscado.
     * @throws IndexOutOfBoundsException caso a posição seja inválida.
     * @return o nó da posição passada como parâmetro.
     */
    @Override
    public NoDuplo<T> buscarNo(int posicao) {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        NoDuplo<T> noTemporario = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noTemporario = noTemporario.getProximo();
        }
        return noTemporario;
    }

    /**
     * Método que retorna uma representação em String da lista.
     * @return string representando a lista.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (estaVazia()) {
            return "[]";
        }
        NoDuplo<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getDado()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getDado()).append("]");
        return builder.toString();
    }
}