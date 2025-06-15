package Segunda_Unidade.ListaDinamica;

public class ListaDinamicaGenerica<T> implements Listavel<T> {
    /**
 * Implementação de uma lista dinâmica duplamente encadeada genérica.
 * Esta classe implementa uma lista que pode armazenar elementos de qualquer tipo,
 * utilizando uma estrutura de nós duplamente encadeados.
 *
 * @param <T> o tipo dos elementos armazenados na lista
 * @author Cláudio Rodolfo Sousa de Oliveira
 * @version 1.1
 * @since 2025-06-04
 */

	/** Quantidade atual de elementos na lista */
	private int quantidade;
	
	/** Tamanho máximo da lista */
	private int tamanho;
	
	/** Ponteiro para o primeiro nó da lista */
	private NoDuplo<T> ponteiroInicio;
	
	/** Ponteiro para o último nó da lista */
	private NoDuplo<T> ponteiroFim;

	/**
	 * Construtor padrão que cria uma lista com capacidade para 10 elementos.
	 */
	public ListaDinamicaGenerica() {
		this(10);
	}

	/**
	 * Construtor que cria uma lista com capacidade personalizada.
	 *
	 * @param tamanho a capacidade máxima da lista
	 */
	public ListaDinamicaGenerica(int tamanho) {
		ponteiroInicio = null;
		ponteiroFim = null;
		quantidade = 0;
		this.tamanho = tamanho;
	}

	/**
	 * Adiciona um elemento ao final da lista.
	 *
	 * @param dado o elemento a ser adicionado
	 * @throws OverflowException se a lista estiver cheia
	 */
	@Override
	public void anexar(T dado) {
		//if (estaCheia()) {
			//throw new OverflowException("Lista Cheia!");
		//}
		NoDuplo<T> noTemporario = new NoDuplo<>();
		noTemporario.setDado(dado);
		if (!estaVazia()) {
			ponteiroFim.setProximo(noTemporario);
			noTemporario.setAnterior(ponteiroFim);
		} else {
			ponteiroInicio = noTemporario;
		}
		ponteiroFim = noTemporario;
		quantidade++;
	}

	/**
	 * Insere um elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição onde o elemento será inserido
	 * @param dado o elemento a ser inserido
	 * @throws OverflowException se a lista estiver cheia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	@Override
	public void inserir(int posicao, T dado) {
		///if (estaCheia()) {
			//throw new OverflowException("Lista Cheia!");
		//}
		if (!(posicao >= 0 && posicao <= quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}
		NoDuplo<T> noTemporario = new NoDuplo<>();
		noTemporario.setDado(dado);

		NoDuplo<T> ponteiroAnterior = null;
		NoDuplo<T> ponteiroProximo = ponteiroInicio;

		for (int i = 0; i < posicao; i++) {
			ponteiroAnterior = ponteiroProximo;
			ponteiroProximo = ponteiroProximo.getProximo();
		}

		if (ponteiroAnterior != null) {
			ponteiroAnterior.setProximo(noTemporario);
			// se o anterior é nulo é pq a insercao está sendo no inicio
		} else {
			ponteiroInicio = noTemporario;
		}

		if (ponteiroProximo != null) {
			ponteiroProximo.setAnterior(noTemporario);
			// se o proximo é nulo é pq a insercao está sendo no fim (append)
		} else {
			ponteiroFim = noTemporario;
		}

		noTemporario.setAnterior(ponteiroAnterior);
		noTemporario.setProximo(ponteiroProximo);

		quantidade++;
	}

	/**
	 * Retorna o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento desejado
	 * @return o elemento na posição especificada
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	@Override
	public T selecionar(int posicao) {
		if (estaVazia()) {
			throw new IndexOutOfBoundsException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < posicao; i++) {
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}
		return ponteiroAuxiliar.getDado();
	}

	/**
	 * Retorna um array contendo todos os elementos da lista.
	 *
	 * @return array com todos os elementos da lista
	 * @throws UnderflowException se a lista estiver vazia
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T[] selecionarTodos() {
		if (estaVazia()) {
			throw new IndexOutOfBoundsException("Lista Vazia!");
		}
		T[] dadosTemporario = (T[]) new Object[quantidade];
		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < quantidade; i++) {
			dadosTemporario[i] = ponteiroAuxiliar.getDado();
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}
		return dadosTemporario;
	}

	/**
	 * Atualiza o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento a ser atualizado
	 * @param novoDado o novo elemento
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	@Override
	public void atualizar(int posicao, T novoDado) {
		if (estaVazia()) {
			throw new IndexOutOfBoundsException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < posicao; i++) {
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}
		ponteiroAuxiliar.setDado(novoDado);
	}

	/**
	 * Remove o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento a ser removido
	 * @return o elemento removido
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	@Override
	public T apagar(int posicao) {
		if (estaVazia()) {
			throw new IndexOutOfBoundsException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < posicao; i++) {
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}

		NoDuplo<T> ponteiroAnterior = ponteiroAuxiliar.getAnterior();
		NoDuplo<T> ponteiroProximo = ponteiroAuxiliar.getProximo();

		if (ponteiroAnterior != null) {
			ponteiroAnterior.setProximo(ponteiroProximo);
			// remocao do inicio, joga o ponteiro de inicio para o proximo nodo.
		} else {
			ponteiroInicio = ponteiroInicio.getProximo();
		}
		if (ponteiroProximo != null) {
			ponteiroProximo.setAnterior(ponteiroAnterior);
			// remocao do fim, joga o ponteiro de fim para o nodo anterior.
		} else {
			ponteiroFim = ponteiroFim.getAnterior();
		}

		quantidade--;
		return ponteiroAuxiliar.getDado();
	}

	/**
	 * Verifica se a lista está cheia.
	 *
	 * @return true se a lista estiver cheia, false caso contrário
	 */

	/**
	 * Verifica se a lista está vazia.
	 *
	 * @return true se a lista estiver vazia, false caso contrário
	 */
	@Override
	public boolean estaVazia() {
		return (quantidade == 0);
	}

	/**
	 * Retorna uma representação em string da lista.
	 * Os elementos são separados por vírgula e delimitados por colchetes.
	 *
	 * @return string representando a lista
	 */
	@Override
	public String imprimir() {
		String resultado = "[";
		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < quantidade; i++) {
			resultado += ponteiroAuxiliar.getDado();
			if (i != quantidade - 1) {
				resultado += ",";
			}
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}
		return resultado + "]";
	}
}
    /*private int quantidade;
    private int tamanho;
    private NoDuplo<T> inicio;
    private NoDuplo<T> ultimo;

    public ListaDinamicaGenerica() {
        this(10);
    }

    public ListaDinamicaGenerica(int quantidade) {
        this.quantidade = quantidade;
        this.tamanho = 0;   
        inicio = null;
        ultimo = null;
    }

    @Override
    public void anexar(T elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'anexar'");
    }

    @Override
    public void inserir(int posicao, T elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public T selecionar(int posicao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionar'");
    }

    @Override
    public T[] selecionarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarTodos'");
    }

    @Override
    public void atualizar(int posicao, T elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public T apagar(int posicao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'apagar'");
    }

    @Override
    public boolean estaVazia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaVazia'");
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }   */
    

