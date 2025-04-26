package Primeira_Unidade.Aulas.Filas.FilasComPilhas;

public class PilhaFilaAula03 implements EnfileiravelAula03 {

    EmpilhavelAula01 p1;
    EmpilhavelAula01 p2;

    public PilhaFilaAula03() {
        this(10);
    }

    public PilhaFilaAula03(int tamanho) {
        p1 = new PilhaEstaticaAula02(tamanho);
        p2 = new PilhaEstaticaAula02(tamanho);
    }

    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()) {
            while (!p1.estaVazia()) {
                p2.empilhar(p1.desempilhar());
            }
            p1.empilhar(dado);
            while (!p2.estaVazia()) {
                p1.empilhar(p2.desempilhar());
            }
        } else {
            System.err.println("Fila está cheia");
        }
    }

    @Override
    public Object desenfileirar() {
        Object dadoInicio = null;
        while (!p1.estaVazia()) {
            p2.empilhar(p1.desempilhar());
        }
        dadoInicio = p2.desempilhar();
        while (!p2.estaVazia()) {
            p1.empilhar(p2.desempilhar());
        }
        return dadoInicio;
    }

    @Override
    public boolean estaCheia() {
        return p1.estaCheia();
    }

    @Override
    public boolean estaVazia() {
        return p1.estaVazia();
    }

    @Override
    public Object frente() {
        Object dadoInicio = null;
        while (!p1.estaVazia()) {
            p2.empilhar(p1.desempilhar());
        }
        dadoInicio = p2.espiar();
        while (!p2.estaVazia()) {
            p1.empilhar(p2.desempilhar());
        }
        return dadoInicio;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            while (!p1.estaVazia()) {
                p2.empilhar(p1.desempilhar());
            }
            p2.atualizar(dado);
            while (!p2.estaVazia()) {
                p1.empilhar(p2.desempilhar());
            }
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if (!estaVazia()) {
            p1.atualizar(dado);
        }
    }

    @Override
    public String imprimir() {
        String impressao = "";
        if (!estaVazia()) {
            while (!p1.estaVazia()) {
                p2.empilhar(p1.desempilhar());
            }

            impressao = p2.imprimir();

            while (!p2.estaVazia()) {
                p1.empilhar(p2.desempilhar());
            }
        }
        return impressao;
    }
}
