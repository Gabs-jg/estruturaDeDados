package Segunda_Unidade.ListaDinamica;

public class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> anterior;
    private NoDuplo<T> proximo;

    public T getDado() {
        return dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }
    public NoDuplo<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }
    public NoDuplo<T> getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}
