import java.util.NoSuchElementException;



public class PilhaDinamica<T> implements Empilhavel<T> {

    /** Quantidade de elementos na pilha. */
    private int quantidade;

    /** Tamanho da pilha. */
    private int tamanho;

    /** Ponteiro para o topo da pilha. */
    private NodoDuplo<T> ponteiroTopo;

    /** Método de um construtor padrão que cria uma pilha de tamanho 10 caso não seja passado nenhum parâmetro. */
    public PilhaDinamica() {
        this(10);
    }

    /**
     * Método de um construtor que cria uma pilha com tamanho personalizado.
     * @param tamanho Capacidade máxima da pilha.
     */
    public PilhaDinamica(int tamanho) {
        ponteiroTopo = null;
        quantidade = 0;
        this.tamanho = tamanho;
    }

    /**
     * Método para adicionar um dado na pilha.
     * 
     * @param dado Dado que irá ser adicionado na pilha.
     * @throws NoSuchElementException Se a pilha estiver cheia.
     */
    @Override
    public void empilhar(T dado) {
        if(estaCheia()) {
            throw new NoSuchElementException("Pilha cheia.");
        }
        NodoDuplo<T> noTemporario = new NodoDuplo<>();
        noTemporario.setDado(dado);
        noTemporario.setAnterior(ponteiroTopo);
        if(!estaVazia()) {
            ponteiroTopo.setProximo(noTemporario);
        }
        ponteiroTopo = noTemporario;
        quantidade++;
    }

    /**
     * Método para remover um dado da pilha.
     * 
     * @return Dado removido que estava no topo.
     * @throws NoSuchElementException Se a pilha estiver vazia.
     */
    @Override
    public T desempilhar() {
        if(estaVazia()) {
            throw new NoSuchElementException("Pilha vazia.");
        }
        T dadoTopo = ponteiroTopo.getDado();
        ponteiroTopo = ponteiroTopo.getAnterior();
        quantidade--;
        if(!estaVazia()) {
            ponteiroTopo.setProximo(null);
        }
        return dadoTopo;
    }

    /**
     * Método que retorna o dado no topo da pilha.
     * 
     * @return Dado que está no topo da pilha.
     * @throws NoSuchElementException Se a pilha estiver vazia.
     */
    @Override
    public T espiar() {
        if(estaVazia()) {
            throw new NoSuchElementException("Pilha vazia.");
        }
        return ponteiroTopo.getDado();
    }

    /**
     * Método para atualizar o dado do topo da pilha.
     * 
     * @param dado Novo dado que irá ser adicionado no topo da pilha.
     * @throws NoSuchElementException Se a pilha estiver vazia.
     */
    @Override
    public void atualizar(T dado) {
        if(estaVazia()) {
            throw new NoSuchElementException("Pilha vazia.");
        }
        ponteiroTopo.setDado(dado);
    }

    /**
     * Método que verifica se a pilha está vazia.
     * 
     * @return true caso a quantidade seja igual a 0, ou seja, quando estiver vazia, false quando não estiver vazia.
     */
    @Override
    public Boolean estaVazia() {
        return (quantidade == 0);
    }

    /**
     * Método que verifica se a pilha está cheia.
     * 
     * @return true caso a quantidade for igual o tamanho, ou seja, quando estiver cheia, false quando não estiver cheia.
     */
    @Override
    public Boolean estaCheia() {
        return (quantidade == tamanho);
    }

    /**
     * Método que retorna uma representação em string da pilha.
     * 
     * @return Representação em sting da pilha.
     */
    @Override
    public String imprimir() {
        String resultado = "[";
        NodoDuplo<T> ponteiroAux = ponteiroTopo;
        for(int i=0; i<quantidade; i++) {
            resultado += ponteiroAux.getDado();
            if(i != quantidade-1) {
                resultado += ponteiroAux.getDado() + ", ";
            }
            ponteiroAux = ponteiroAux.getAnterior();
        }
        return resultado + "]";
    }

}