package Primeira_Unidade.Aulas.Filas;

public interface EnfileiravelAula03 {

    void enfileirar(Object dado);

    Object frente();

    void atualizarInicio(Object dado);

    void atualizarFim(Object dado);

    Object desenfileirar();

    boolean estaCheia();

    boolean estaVazia();

    String imprimir();

}
