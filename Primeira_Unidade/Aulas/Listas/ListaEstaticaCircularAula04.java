package Primeira_Unidade.Aulas.Listas;

public class ListaEstaticaCircularAula04 implements ListavelAula04 {

    private Object[] dados;
    private int ponteiroInicio, ponteiroFim;
    private int quantidade;

    public ListaEstaticaCircularAula04() {
        this(10);
    }

    public ListaEstaticaCircularAula04(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = -1;
        ponteiroFim = 0;
        quantidade = 0;
    }

    @Override
    public void inserir(Object dado, int posicao) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                int posicaoFisica = mapeamento(posicao);
                int x = ponteiroFim;
                int y = avancar(x);
                for (int i = 0; i < quantidade - posicao; i++) {
                    x = retroceder(x);
                    y = retroceder(y);
                }
                dados[posicaoFisica] = dado;
                quantidade++;
                avancar(ponteiroFim);
            }
        }
    }

    private int avancar(int ponteiro) {
        return (ponteiro + 1) % dados.length;
    }

    private int retroceder(int ponteiro) {
        return ((ponteiro - 1) + dados.length) % dados.length;
    }

    @Override
    public void anexar(Object dado) {
        if (!estaCheia()) {
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.out.println("");
        }
    }

    @Override
    public Object selecionar(int posicao) {
        Object aux = null;
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                int posicaoFisica = mapeamento(posicao);
                aux = dados[posicaoFisica];
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        return aux;
    }

    @Override
    public Object[] selecionarTodos() {
        Object[] dadosAux = null;
        if (!estaVazia()) {
            dadosAux = new Object[quantidade];
            int ponteiroAux = ponteiroInicio;
            for (int i = 0; i < quantidade; i++) {
                dadosAux[i] = dados[ponteiroAux];
                ponteiroAux = avancar(ponteiroAux);
            }
        }
        return dadosAux;
    }

    @Override
    public void atualizar(Object dado, int posicao) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                int posicaoFisica = mapeamento(posicao);
                dados[posicaoFisica] = dado;
            } else {
                System.err.println("Índice inválido.");
            }
        } else {
            System.err.println("A lista está vazia.");
        }
    }

    @Override
    public boolean contem(Object dado) {
        return false;
    }

    @Override
    public int primeiraOcorrencia(Object dado) {
        if (!estaVazia()) {

        }
        return 0;
    }

    // boolean comparator()

    public Object apagar(int posicao) {
        Object dadosAux = null;
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                int posicaoFisica = mapeamento(posicao);
                int x = posicaoFisica;
                dadosAux = dados[posicaoFisica];
                int y = avancar(x);
                for (int i = 0; i < quantidade - posicao - 1; i++) {
                    dados[x] = dados[y];
                    x = avancar(x);
                    y = avancar(y);
                }
                quantidade--;
                ponteiroFim = retroceder(ponteiroFim);
            }
        }
        return dadosAux;
    }

    @Override
    public void limpar() {
        quantidade = 0;
        ponteiroInicio = 0;
        ponteiroFim = 0;
    }

    @Override
    public int ultimaOcorrencia(Object dado) {
        return 0;
    }

    @Override
    public boolean estaCheia() {
        return quantidade == dados.length;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroInicio; i < quantidade + ponteiroInicio; i++) {
            if (i == quantidade + ponteiroInicio - 1) {
                retorno += dados[i % dados.length];
            } else {
                retorno += dados[i % dados.length] + ", ";
            }
        }
        return retorno + "]";
    }

    int mapeamento(int logica) {
        return (logica + ponteiroInicio) % dados.length;
    }

    @Override
    public int primeiroIndice(Object dado) {
        int aux = -1;

        if (!estaVazia()) {
            for (int i = 0; i < quantidade; i++) {
                if (dado == dados[mapeamento(i)]) {
                    aux = i;
                    break;
                }
            }
        }

        return aux;

    }
}
