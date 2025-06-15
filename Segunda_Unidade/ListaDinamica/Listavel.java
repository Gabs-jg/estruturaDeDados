package Segunda_Unidade.ListaDinamica;
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
     * Método que adiciona um elemento no final da lista.
     * 
     * @param elemento dado a ser anexado no final da lista.
     */
    public void anexar(T elemento);

    /**
     * Método que adiciona um elemento em uma posição específica da lista.
     * @param posicao posição da lista que o elemento vai ser adicionado.
     * @param elemento elemento que vai ser adicionado na lista.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     */
    public void inserir(int posicao, T elemento);

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
     * Método que apaga e retorna um elemento de uma posição específica.
     * @param posicao posição do elemento que irá ser apagado.
     * @throws IndexOutOfBoundsException se tentar apagar de uma lista vazia.
     * @throws IndexOutOfBoundsException se for passado como parâmetro uma posição inválida.
     * @return o elemento apagado da lista.
     */
    public T apagar(int posicao);

    /**
     * Método que verifica se a lista está vazia.
     * @return true caso esteja vazia, false caso o contrário.
     */
    public boolean estaVazia();

    /**
     * Método que retorna uma representação em string da lista.
     * @return string representando a lista.
     */
    public String imprimir();

}
