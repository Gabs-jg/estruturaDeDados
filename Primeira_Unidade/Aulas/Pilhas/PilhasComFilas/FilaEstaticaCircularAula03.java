package Primeira_Unidade.Aulas.Pilhas.PilhasComFilas;

public class FilaEstaticaCircularAula03 implements EnfileiravelAula03 {

    // Variáveis de instância
    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;

    public FilaEstaticaCircularAula03() {
        this(10);
    }

    public FilaEstaticaCircularAula03(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
    }

    @Override
    public Object frente() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
        } else {
            System.out.println("A fila está vazia.");
        }
        return aux;
    }

    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()) {
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.err.println("A fila está cheia");
        }
    }

    @Override
    public Object desenfileirar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio = avancar(ponteiroFim);
            quantidade--;
        } else {
            System.out.println("A fila está vazia.");
        }
        return aux;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("A fila está vazia");
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("A fila está vazia");
        }
    }

    @Override
    public boolean estaCheia() {
        return (quantidade == dados.length);
    }

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public String imprimir() {
        int ponteiroAux = ponteiroInicio;
        String retorno = "[";
        for (int i = ponteiroInicio; i < quantidade + ponteiroInicio; i++) {
            /*
             * if(i == dados.length) {
             * i = 0;
             * }
             */
            if (i == (quantidade - 1)) {
                retorno += dados[ponteiroAux]; // Resto da divisão do i pelo tamanho da lista dados.
            } else {
                retorno += dados[ponteiroAux] + ",";
            }
            ponteiroAux = avancar(ponteiroAux);
        }
        return retorno + "]";
    }

    private int avancar(int ponteiro) {
        return (ponteiro + 1) % dados.length;
    }

}
