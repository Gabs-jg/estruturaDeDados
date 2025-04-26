package Primeira_Unidade.Aulas.Pilhas.PilhasComFilas;

public class FilaPilhaAula03 implements EmpilhavelAula01 {

    private EnfileiravelAula03 f1;
    private EnfileiravelAula03 f2;

    public FilaPilhaAula03(int tamanho) {
        f1 = new FilaEstaticaCircularAula03(tamanho);
        f2 = new FilaEstaticaCircularAula03(tamanho);
    }

    public FilaPilhaAula03() {
        this(10);
    }

    @Override
    public void empilhar(Object elemento) {
        if (!estaCheia()) {
            f1.enfileirar(elemento);
        } else {
            System.err.println("Stack is full!");
        }
    }

    @Override
    public Object desempilhar() {
        Object dadoAux = null;
        if (!estaVazia()) {
            while (!f1.estaVazia()) {
                f2.enfileirar(f1.desenfileirar());
            }
            dadoAux = f2.desenfileirar();
            while (!f2.estaVazia()) {
                f1.enfileirar(f2.desenfileirar());
            }
        } else {
            System.err.println("Stack is empty!");
        }
        return dadoAux;
    }

    @Override
    public void atualizar(Object elemento) {
        if (!estaVazia()) {
            f1.atualizarFim(elemento);
        } else {
            System.err.println("Stack is full!");
        }
    }

    @Override
    public Object espiar() {
        Object dadoAux = null;
        if (!estaVazia()) {
            while (!f1.estaVazia()) {
                f2.enfileirar(f1.desenfileirar());
            }
            dadoAux = f2.frente();
            while (!f2.estaVazia()) {
                f1.enfileirar(f2.desenfileirar());
            }
        } else {
            System.err.println("Stack is empty!");
        }
        return dadoAux;
    }

    @Override
    public boolean estaCheia() {
        return f1.estaCheia();
    }

    @Override
    public boolean estaVazia() {
        return f1.estaVazia();
    }

    @Override
    public String imprimir() {
        return f1.imprimir();
    }

}
