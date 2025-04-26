package Primeira_Unidade.Aulas.Filas;

public interface DuplamenteEnfileiravelAula03 {

    void enfileirarInicio();

    void enfileirarFim(Object dado); // v

    Object frente(); // v

    Object tras();

    void atualizarInicio(Object dado); // v

    void atualizarFim(Object dado); // v

    Object desenfileirarInicio(); // v

    Object desenfileirarFim();

    boolean estaCheia(); // v

    boolean estaVazia(); // v

    String imprimirTrasFrente();

    String imprimirFrenteTras(); // v

}
