package Segunda_Unidade.ListaDinamica.src;

/**
 * Interface que define as operações básicas de uma lista dinâmica.
 * Esta interface define os métodos que devem ser implementados por 
 * qualquer classe que represente uma estrutura de dado que represente uma lista dinâmica.
 * 
 * @param <T> o tipo dos elementos armazenados na lista.
 * @author João Gabriel Oliveira Magalhães.
 * @version 1.0
 * @since 2025-06-15
 */
public interface Listavel<T> {

    /**
     * Método que adiciona um elemento no início da lista.
     * @param elemento dado a ser adicionado na lista.
     */
    public void adicionarInicio(T elemento);

    /**
     * Método que adiciona um elemento no final da lista.
     * @param elemento dado a ser adicionado no final da lista.
     */
    public void adicionarFinal(T elemento);

    /**
     * Método que adiciona um elemento em uma posição específica da lista.
     * @param posicao posição da lista que o elemento vai ser adicionado.
     * @param elemento elemento que vai ser adicionado na lista.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     */
    public void adicionarPosEspecifica(int posicao, T elemento);

    /**
     * Método que seleciona e retorna um elemento de uma determinada posição da lista.
     * @param posicao posição do elemento da lista a ser selecionado.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     * @return o elemento na posição especificada.
     */
    public T selecionar(int posicao);

    /**
     * Método que seleciona e retorna um array com todos os elementos da lista.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     * @return um array com todos os elementos da lista.
     */
    public T[] selecionarTodos();

    /**
     * Método que atualiza um elemento de uma determinada posição da lista.
     * @param posicao posição do elemento a ser atualizado da lista.
     * @param elemento novo elemento da posição especificada da lista.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     */
    public void atualizar(int posicao, T elemento);

    /**
     * Método que apaga e retorna um elemento do início da lista.
     * @throws IndexOutOfboundsException se a lista estiver vazia.
     * @return o dado removido.
     */
    public T apagarInicio();

    /**
     * Método que apaga e retorna um elemento do final da lista.
     * @throws IndexOutOfBoundsException se a lista estiver vazia.
     * @return o dado removido.
     */
    public T apagarFinal();

    /**
     * Método que apaga e retorna um elemento de uma posição específica.
     * @param posicao posição do elemento que irá ser apagado.
     * @throws IndexOutOfBoundsException se tentar apagar de uma lista vazia.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     * @return o elemento apagado da lista.
     */
    public T apagarPosEspecifica(int posicao);

    /**
     * Método que apaga todos os elementos da lista.
     */
    public void limpar();

    /**
     * Método que verifica se a lista está vazia.
     * @return true caso a lista esteja vazia, false caso o contrário.
     */
    public boolean estaVazia();

    /**
     * Método que verifica e retorna se uma posição é inválida.
     * @param posicao a posição que irá ser verificada.
     * @return true caso a posição for inválida, false caso o contrário.
     */
    public boolean posicaoInvalida(int posicao);

    /**
     * Método que busca e retorna a posição de um nó.
     * @param posicao posicao que quer ser buscada.
     * @return a posicao
     */
    public NoDuplo<T> buscarNo(int posicao);

    /**
     * Método que retorna uma representação em string da lista.
     * @return string representando a lista.
     */
    public String toString();
}