public class PilhaEstaticaInvertidaAula02 implements EmpilhavelAula01 {
    //Variaveis de instancia
    private Object[] dados;
    private int ponteiroTopo;

    //Métodos
    //Cosntrutores (inicializar variaveis de instância)
    public PilhaEstaticaInvertidaAula02() { //Construtor retorna o PilhaEstatica
        //dados = new Object[10];
        //ponteiroTopo = -1;
        this(10); //O this chama outro construtor em outro construtor; chama o construtor de baixo;
        //Como foi passado um valor int, o construtor não tem dificuldades em encontrar o construtor, pois não há duplicidade.
    }

    public PilhaEstaticaInvertidaAula02(int tamanho){
        dados = new Object[tamanho];
        ponteiroTopo = tamanho;
    }
    //Métodos principais - Todo mundo tem acesso
    @Override
    public void empilhar(Object dado) {
        if(!estaCheia()) {
            ponteiroTopo--;
            dados[ponteiroTopo] = dado;
        } else {
            System.err.println("A pilha está cheia.");
        }
    }

    @Override
    public void atualizar(Object dado) {
        if(!estaVazia()) {
            dados[ponteiroTopo] = dado;
        } else {
            System.err.println("A pilha está vazia.");
        }
    }
    @Override
    public Object desempilhar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroTopo];
            //dados[ponteiroTopo] = null; -Para apagar o dado, para não ser rastreado(Quando é um dado importante.)
            ponteiroTopo++;
        } else {
            System.out.println("A pilha está vazia.");
        }
        return aux ;
    }

    @Override
    public Object espiar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroTopo];
        } else {
            System.out.println("A pilha está vazia.");
        }
        return aux ;
    }

    //Métodos auxiliares - Geralmente é privado.
    @Override
    public boolean estaCheia() {
        return (ponteiroTopo == 0);
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroTopo == dados.length);
    }
    @Override
    public String imprimir() {
        String aux = "[";
        //Não usa o for each por que não precisa passar por todos os índices do array.
        for (int i = ponteiroTopo; i > dados.length; i++) {
            if (i == dados.length - 1) {
                aux += dados[i];
            } else {
                aux += dados[i] + ","; //O mais concatena, já que é string.
            }
        }
        return aux + "]";
    }
}
