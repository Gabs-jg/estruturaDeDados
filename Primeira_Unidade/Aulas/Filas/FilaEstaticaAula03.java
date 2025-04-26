package Filas;

public class FilaEstaticaAula03 implements EnfileiravelAula03 {
    
    //Variáveis de Instância - Boa prática ser private.
    private Object [] dados;
    private int ponteiroInicio;
    private int ponteiroFim;

    public FilaEstaticaAula03() {
         this(10);
    }

    public FilaEstaticaAula03(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
    }

    @Override
    public void enfileirar(Object dado) {
        if(!estaCheia()) {
            ponteiroFim++;
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("A fila está cheia");
        }
    }

    @Override
    public Object frente() {
        Object aux = null;
        if(!estaVazia()) {
            aux = dados[ponteiroInicio];
        } else {
            System.out.println("A fila está vazia.");
        }
        return aux;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if(!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("A fila está vazia");
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if(!estaVazia()) {
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("A fila está vazia");
        }
    }

    @Override
    public Object desenfileirar() {
        Object aux = null;
        if(!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio++;
        } else {
            System.out.println("A fila está vazia.");
        }
        return aux;
    }

    @Override
    public boolean estaCheia() {
        return (ponteiroFim == dados.length -1);
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroFim == ponteiroInicio -1);
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for(int i = ponteiroInicio; i<= ponteiroFim; i++) {
            if(i==ponteiroFim) {
                retorno += dados[i];
            }
            retorno += dados[i] + ",";
        }
        return retorno + "]";
    }

}
