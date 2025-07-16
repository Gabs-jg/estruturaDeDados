/**
 * Interface que define operações básicas para uma estrutura de dados
 * baseada em árvores binárias.
 * @author João Gabriel Oliveira Magalhães
 * @version 1.0
 * @param <T> Tipo de dado armazenado nos nós da árvore.
 */
public interface Arborizavel<T> {

    /**
     * Retorna a raiz da árvore.
     *
     * @return Nó raiz da árvore ou null se a árvore estiver vazia.
     */
    NoTriplo<T> getRaiz();

    /**
     * Insere um novo dado na árvore.
     *
     * @param dado Valor a ser inserido.
     */
    void inserir(T dado);

    /**
     * Remove um dado da árvore, se existir.
     *
     * @param dado Valor a ser removido.
     * @return O valor removido, ou null se não encontrado.
     */
    T apagar(T dado);

    /**
     * Verifica se um dado existe na árvore.
     *
     * @param dado Valor a ser buscado.
     * @return true se o valor existir na árvore, false caso contrário.
     */
    boolean existe(T dado);

    /**
     * Remove todos os elementos da árvore, esvaziando-a.
     */
    void limpar();

    /**
     * Retorna uma representação textual da árvore na ordem de
     * percurso pré-ordem (raiz, esquerda, direita).
     *
     * @return String com os elementos em pré-ordem.
     */
    String imprimirPreOrdem();

    /**
     * Retorna uma representação textual da árvore na ordem de
     * percurso em ordem (esquerda, raiz, direita).
     *
     * @return String com os elementos em ordem.
     */
    String imprimirEmOrdem();

    /**
     * Retorna uma representação textual da árvore na ordem de
     * percurso pós-ordem (esquerda, direita, raiz).
     *
     * @return String com os elementos em pós-ordem.
     */
    String imprimirPosOrdem();
}

