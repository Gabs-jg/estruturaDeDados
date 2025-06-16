/**
 * Classe que representa um nó duplamente encadeado.
 * Esta classe é utilizada para implementar estruturas de dados que
 * necessitem de nós com referências para o próximo e o anterior.
 * 
 * @param <T> O tipo de dado armazenado no nó.
 * @author João Gabriel Oliveira Magalhães.
 * @version 1.0
 * @since 2025-06-09
 */
public class NodoDuplo<T> {
    /** O dado armazenado no nó. */
    private T dado;

    /** Referência para o nó anterior. */
    private NodoDuplo<T> anterior;

    /** Referência para o próximo nó. */
    private NodoDuplo<T> proximo;

    /**
     * Método que retorna o dado armazenado no nó.
     * 
     * @return Dado armazenado no nó.
     */
    public T getDado() {
        return dado;
    }

    /**
     * Método para definir o dado que irá ser armazenado no nó.
     * 
     * @param dado Dado que vai ser armazenado no nó.
     */
    public void setDado(T dado) {
        this.dado = dado;
    }

    /**
     * Método que retorna a referência do nó anterior.
     * 
     * @return Nó anterior.
     */
    public NodoDuplo<T> getAnterior() {
        return anterior;
    }

    /**
     * Método que irá definir a referência para o nó anterior.
     * 
     * @param anterior Novo nó anterior.
     */
    public void setAnterior(NodoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * Método que retorna a referência do próximo nó.
     * 
     * @return Próximo nó.
     */
    public NodoDuplo<T> getProximo() {
        return proximo;
    }

    /**
     * Método que irá definir a referênica para o próximo nó.
     * 
     * @param proximo Novo próximo nó.
     */
    public void setProximo(NodoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}