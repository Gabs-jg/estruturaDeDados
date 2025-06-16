import java.util.NoSuchElementException;

/**
 * Implementação de uma fila dinâmica duplamente encadeada genérica.
 * Esta classe implementa uma fila que pode armazenar elementos de qualquer
 * tipo,
 * utilizando uma estrutura de nós duplamente encadeados.
 *
 * @param <T> o tipo dos elementos armazenados na fila
 * @author João Gabriel Oliveira Magalhães
 * @version 1.1
 * @since 2025-06-04
 */
public class FilaDinamicaGenerica<T> implements Enfileiravel<T> {

	/** Tamanho máximo da fila */
	private int tamanho;

	/** Ponteiro para o primeiro nó da fila */
	private NoDuplo<T> inicio;

	/** Ponteiro para o último nó da fila */
	private NoDuplo<T> ultimo;

	private final String ESTA_VAZIA = "Lista vazia";

	/**
	 * Construtor padrão onde seta o inicio e o ultimo como null e o tamanho como 0.
	 */
	public FilaDinamicaGenerica() {
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	/**
	 * Método que adiciona um elemento no final da fila.
	 * @param elemento elemento a ser adicionado no final da fila.
	 */
	@Override
	public void enfileirarFim(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>();
		novoNo.setDado(elemento);
		if (estaVazia()) {
			this.inicio = novoNo;
			this.ultimo = novoNo;
		} else {
			this.ultimo.setProximo(novoNo);
			novoNo.setAnterior(this.ultimo);
			this.ultimo = novoNo;
		}
		tamanho++;
	}

	/**
	 * Método que apaga e retorna o elemento do início da fila.
	 * @throws NoSuchElementException caso a fila esteja vazia.
	 * @return elemento que foi apagado do início da fila.
	 */
	@Override
	public T desenfileirarInicio() throws IndexOutOfBoundsException {
		if (estaVazia()) {
			throw new NoSuchElementException(ESTA_VAZIA);
		}
		T elemento = this.inicio.getDado();
		this.inicio = this.inicio.getProximo();
		this.tamanho--;
		if (estaVazia()) {
			this.ultimo = null;
		} else {
			this.inicio.setAnterior(null);
		}
		return elemento;
	}

	/**
	 * Método que retorna o elemento que está no início da fila.
	 * @throws NoSuchElementException caso a lista esteja vazia.
	 * @return o elemento que está no início da fila.
	 */
	@Override
	public T espiarFim() throws IndexOutOfBoundsException {
		if (estaVazia()) {
			throw new NoSuchElementException(ESTA_VAZIA);
		}
		return ultimo.getDado();
	}

	/**
	 * Método que verifica se a lista está vazia.
	 * @return true caso a fila esteja vazia, false caso o contrário.
	 */
	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}
}