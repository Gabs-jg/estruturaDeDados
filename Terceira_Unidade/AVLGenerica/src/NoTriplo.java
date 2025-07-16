package Terceira_Unidade.AVLGenerica.src;

/**
 * Representa um nó de uma árvore binária com referência ao genitor (pai),
 * ao filho esquerdo, ao filho direito e à sua altura.
 * @author João Gabriel Oliveira Magalhães
 * @param <T> Tipo do dado armazenado no nó.
 * @version 1.0
 */
public class NoTriplo<T> {

    private T dado;
    private NoTriplo<T> genitor;
    private NoTriplo<T> esquerda;
    private NoTriplo<T> direita;
    private int altura;

    /**
     * Construtor padrão. Inicializa o nó com altura 0.
     */
    public NoTriplo() {
        altura = 0;
    }

    /**
     * Retorna a altura do nó.
     *
     * @return Altura do nó.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define a altura do nó.
     *
     * @param altura Nova altura.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Retorna o dado armazenado no nó.
     *
     * @return Valor do nó.
     */
    public T getDado() {
        return dado;
    }

    /**
     * Define o dado armazenado no nó.
     *
     * @param dado Novo valor.
     */
    public void setDado(T dado) {
        this.dado = dado;
    }	

    /**
     * Retorna o genitor (pai) do nó.
     *
     * @return Referência ao nó pai.
     */
    public NoTriplo<T> getGenitor() {
        return genitor;
    }

    /**
     * Define o genitor (pai) do nó.
     *
     * @param genitor Referência ao novo pai.
     */
    public void setGenitor(NoTriplo<T> genitor) {
        this.genitor = genitor;
    }

    /**
     * Retorna o filho à esquerda.
     *
     * @return Nó à esquerda.
     */
    public NoTriplo<T> getEsquerda() {
        return esquerda;
    }

    /**
     * Define o filho à esquerda.
     *
     * @param esquerda Novo filho à esquerda.
     */
    public void setEsquerda(NoTriplo<T> esquerda) {
        this.esquerda = esquerda;
    }	

    /**
     * Retorna o filho à direita.
     *
     * @return Nó à direita.
     */
    public NoTriplo<T> getDireita() {
        return direita;
    }

    /**
     * Define o filho à direita.
     *
     * @param direita Novo filho à direita.
     */
    public void setDireita(NoTriplo<T> direita) {
        this.direita = direita;
    }
}

