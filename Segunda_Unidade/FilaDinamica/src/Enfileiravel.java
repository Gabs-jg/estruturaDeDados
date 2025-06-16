/**
 * Interface que define as operações básicas de uma fila genérica.
 * Esta interface define os métodos que devem ser implementados
 * por qualquer classe que represente uma estrutura de dados do tipo fila.
 *
 * @param <T> o tipo dos elementos armazenados na fila
 * @author João Gabriel Oliveira Magalhães
 * @version 1.1
 */
public interface Enfileiravel<T> {

	/**
	 * Método que adiciona um elemento no final da fila.
	 * @param elemento elemento a ser adicionado no final da fila.
	 */
	public void enfileirar(T elemento);

	/**
	 * Método que apaga e retorna o elemento do começo da fila.
	 * @throws IndexOutOfBoundsException caso a fila esteja vazia.
	 * @return
	 */
	public T desenfileirar();

	/**
	 * Método que retorna o elemento do início da fila.
	 * @throws IndexOutOfBoundsException caso a fila esteja vazia.
	 * @return o elemento que está no início da fila.
	 */
	public T espiar();

	/**
	 * Método que verifica e retorna se a lista está vazia
	 * @return true caso a fila esteja vazia, false caso contrário.
	 */
	public boolean estaVazia();

	/**
	 * Método que retorna uma string representando a lista.
	 * @return string representando a fila.
	 */
	public String toString();
}