/**
 * Interface que define as operações básicas de uma pilha.
 * Esta interface contém os métodos que devem ser implementados
 * em qualquer classe que represente uma pilha. 
 * 
 * @param <T> Tipo de dado armazenado na pilha.
 * @author João Gabriel Oliveira Magalhães.
 * @version 1.0
 * @since 2025-06-09 
 */

public interface Empilhavel <T> {

    /**
     * Método para adicionar um dado no topo da pilha.
     * 
     * @param dado O dado que irá ser inserido no topo da pilha.
     * @throws NoSuchException Se a pilha estiver cheia.
     */
    void empilhar(T dado);

    /**
     * Método para remover um dado do topo da pilha e retorna-lo.
     * 
     * @return O dado que foi removido da pilha.
     * @throws NoSuchElementException Se a pilha estiver vazia.
     */
    T desempilhar();

    /**
     * Método que retorna o dado que está no topo da pilha.
     * 
     * @return O dado que está no topo da pilha.
     * @throws NoSuchElementException Se a pilha estiver vazia.
     */
    T espiar();

    /**
     * Método para atualizar o topo da pilha.
     * 
     * @param dado O novo dado atualizado.
     * @throws NoSuchElementException Se a pilha estiver vazia.
     */
    void atualizar(T dado);

    /**
     * Método que verifica se a pilha está vazia.
     * 
     * @return true Caso a pilha esteja vazia, false caso não esteja vazia.
     */
    Boolean estaVazia();

    /**
     * Método que verifica se a pilha está cheia.
     * 
     * @return true Caso a pilha esteja cheia, false caso não esteja cheia.
     */
    Boolean estaCheia();

    /**
     * Método onde irá retornar uma representação em string da pilha.
     * 
     * @return string representando a pilha.
     */
    String imprimir();
}