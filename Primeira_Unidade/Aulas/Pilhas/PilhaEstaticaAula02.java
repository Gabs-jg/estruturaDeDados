package Pilhas;
public class PilhaEstaticaAula02 implements EmpilhavelAula01 {

    //Variáveis de instância
    private Object[] dados;
    private int ponteiroTopo;

    //Métodos
    //Construtores (Inicializar as variáveis de instância)
    public PilhaEstaticaAula02() { 
        this(10); //O this chama um construtor dentro de outro construtor.
        //Como foi passado um valor int, o construtor não tem dificuldades em encontrar o construtor, pois não há duplicidade.
    }

    public PilhaEstaticaAula02(int tamanho) {
        dados = new Object[tamanho];
        ponteiroTopo = -1;
    }

    //Métodos principais - Todo mundo tem acesso.
    @Override
    public void empilhar(Object dado) {
        if(!estaCheia()) {
            ponteiroTopo++;
            dados[ponteiroTopo] = dado;
        } else {
            System.err.println("A pilha está cheia");
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
        if(!estaVazia()) {
            aux = dados[ponteiroTopo];
            //dados[ponteiroTopo] =  null; - Para apagar o dado, para não ser rastreado (Quando é um dado importante) por exemplo.
            ponteiroTopo--;
        } else {
            System.err.println("A pilha está vazia.");
        }
        return aux;
    }

    @Override
    public Object espiar() {
        Object aux = null;
        if(!estaVazia()) {
            aux = dados[ponteiroTopo];
        } else {
            System.err.println("A pilha está vazia.");
        }
        return aux;
    }

    //Métodos auxiliares - Geralmente é privado (Mas nesse exemplo vai ficar public).
    @Override
    public boolean estaCheia() {
            return (ponteiroTopo == dados.length - 1);
    }

    @Override
    public boolean estaVazia() {
        return(ponteiroTopo == -1);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        //Não usa for each por que não precissa passar por todos os indíces do array.
        for(int i = ponteiroTopo; i>= 0; i--) {
            if(i==0) {
                aux += dados[i];
            } else {
                aux += dados[i] + ","; //O sinal + no aux concatena, já que a variável é string, e no java quando se trata de String o + concatena .
            }
        }
        return aux + "]";
    }
}