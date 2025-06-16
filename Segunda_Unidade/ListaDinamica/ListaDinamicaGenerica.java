package Segunda_Unidade.ListaDinamica;

public class ListaDinamicaGenerica<T> implements Listavel<T> {

    private int tamanho;
    private NoDuplo<T> inicio;
    private NoDuplo<T> ultimo;
    private final String POSICAO_INVALIDA = "Posição inválida.";
    private final String ESTA_VAZIA = "Lista vazia.";

    public ListaDinamicaGenerica() {
        this.tamanho = 0;
        inicio = null;
        ultimo = null;
    }

    @Override
    public void adicionarInicio(T elemento) {
        NoDuplo<T> noTemporario = new NoDuplo<>();
        noTemporario.setDado(elemento);
        if (estaVazia()) {
            this.inicio = noTemporario;
            this.ultimo = noTemporario;
        } else {
            noTemporario.setProximo(this.inicio);
            this.inicio.setAnterior(noTemporario);
            this.inicio = noTemporario;
        }
        this.tamanho++;
    }

    @Override
    public void adicionarFinal(T elemento) {
        NoDuplo<T> noTemporario = new NoDuplo<>();
        noTemporario.setDado(elemento);
        if (estaVazia()) {
            adicionarInicio(elemento);
            return;
        }
        this.ultimo.setProximo(noTemporario);
        noTemporario.setAnterior(this.ultimo);
        this.ultimo = noTemporario;
        this.tamanho++;
    }

    @Override
    public void adicionarPosEspecifica(int posicao, T elemento) throws IndexOutOfBoundsException {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        if (estaVazia() || posicao == 0) {
            adicionarInicio(elemento);
            return;
        }
        if (posicao == tamanho) {
            adicionarFinal(elemento);
            return;
        }
        NoDuplo<T> noAnterior = buscarNo(posicao - 1);
        NoDuplo<T> novoNo = new NoDuplo<>();
        novoNo.setDado(elemento);
        novoNo.setProximo(noAnterior.getProximo());
        noAnterior.setProximo(novoNo);
        novoNo.setAnterior(noAnterior);
        if (novoNo.getProximo() != null) {
            novoNo.getProximo().setAnterior(novoNo);
        }
        this.tamanho++;
    }

    @Override
    public T selecionar(int posicao) {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        NoDuplo<T> noTemporario = buscarNo(posicao);
        return noTemporario.getDado();
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] selecionarTodos() throws IndexOutOfBoundsException {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        T[] dados = (T[]) java.lang.reflect.Array.newInstance(inicio.getDado().getClass(), tamanho);
        NoDuplo<T> ponteiroAux = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            dados[i] = ponteiroAux.getDado();
            ponteiroAux = ponteiroAux.getProximo();
        }
        return dados;
    }

    @Override
    public void atualizar(int posicao, T elemento) throws IndexOutOfBoundsException {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        NoDuplo<T> novoNo = buscarNo(posicao);
        novoNo.setDado(elemento);
    }

    @Override
    public T apagarInicio() {
        if(estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        T elemento = this.inicio.getDado();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
        if(estaVazia()) {
            this.ultimo = null;
        } else {
            this.inicio.setAnterior(null);
        }
        return elemento;
    }

    @Override
    public T apagarFinal() throws IndexOutOfBoundsException {
        if(estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        if(tamanho==1) {
            return apagarInicio();
        }
        T elemento = this.ultimo.getDado();
        this.ultimo = this.ultimo.getAnterior();
        this.ultimo.setProximo(null);
        this.tamanho--;

        return elemento;
    }

    @Override
    public T apagarPosEspecifica(int posicao) throws IndexOutOfBoundsException {
        if(estaVazia()) {
            throw new IndexOutOfBoundsException(ESTA_VAZIA);
        }
        if(posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        if(tamanho==1) {
            return apagarInicio();
        }
        if(posicao == tamanho-1) {
            return apagarFinal();
        }
        NoDuplo<T> noRemovido = buscarNo(posicao);
        T elemento = noRemovido.getDado();
        noRemovido.getAnterior().setProximo(noRemovido.getProximo());
        noRemovido.getProximo().setAnterior(noRemovido.getAnterior());
        this.tamanho--;

        return elemento;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean posicaoInvalida(int pos) {
        return !(pos >= 0 && pos <= this.tamanho);
    }

    @Override
    public NoDuplo<T> buscarNo(int posicao) {
        if (posicaoInvalida(posicao)) {
            throw new IndexOutOfBoundsException(POSICAO_INVALIDA);
        }
        NoDuplo<T> noTemporario = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noTemporario = noTemporario.getProximo();
        }
        return noTemporario;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (estaVazia()) {
            return "[]";
        }
        NoDuplo<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getDado()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getDado()).append("]");
        return builder.toString();
    }
}
