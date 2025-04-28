package Primeira_Unidade.Aulas.Filas;

public class DuplaEnfileiravelAula03 implements DuplamenteEnfileiravelAula03 {

    // Variáveis de Instância - Boa prática ser private.
    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;

    public DuplaEnfileiravelAula03() {
        this(10);
    }

    public DuplaEnfileiravelAula03(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
    }

    @Override
    public void enfileirarInicio(Object dado) {
        if (!estaCheia()) {
            ponteiroFim = ((ponteiroFim - 1) + dados.length) % 8;
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.err.println("A fila está cheia");
        }
    }

    @Override
    public void enfileirarFim(Object dado) {
        if (!estaCheia()) {
            ponteiroFim++;
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("A fila está cheia");
        }
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
    public Object tras() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroFim];
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
    public Object desenfileirarInicio() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio++;
        } else {
            System.out.println("A fila está vazia.");
        }
        return aux;
    }

    @Override
    public Object desenfileirarFim() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroFim];
            ponteiroInicio = ((ponteiroFim - 1) + dados.length) % dados.length;
            quantidade--;
        } else {
            System.out.println("A fila está vazia.");
        }
        return aux;
    }

    @Override
    public boolean estaCheia() {
        return (ponteiroFim == dados.length - 1);
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroFim == ponteiroInicio - 1);
    }

    @Override
    public String imprimirTrasFrente() {
        String retorno = "[";
        for (int i = +ponteiroFim; i < ponteiroFim - quantidade; i--) {
            if (i == (quantidade + ponteiroInicio) - 1) {
                retorno += dados[i % dados.length]; // Resto da divisão do i pelo tamanho da lista dados.
            }
            retorno += dados[i % dados.length] + ",";
        }
        return retorno + "]";
    }

    @Override
    public String imprimirFrenteTras() {
        String retorno = "[";
        for (int i = ponteiroInicio; i <= quantidade + ponteiroInicio; i++) {
            /*
             * if(i == dados.length) {
             * i = 0;
             * }
             */
            if (i == (quantidade + ponteiroInicio) - 1) {
                retorno += dados[i % dados.length]; // Resto da divisão do i pelo tamanho da lista dados.
            }
            retorno += dados[i % dados.length] + ",";
        }
        return retorno + "]";
    }
}
