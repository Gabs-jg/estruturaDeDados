package Primeira_Unidade.Aulas.Filas.FilasComPilhas;

public interface EmpilhavelAula01 {
    // Operações principais:
    void empilhar(Object dado); // "C" push - Adiciona um elemento no topo da pilha.

    Object espiar(); // "R" peek - Mostra o elemento que está no topo da pilhas mas não o remove.

    void atualizar(Object dado); // "U "update - Atualiza o valor do elemento do topo da pilha.

    Object desempilhar(); // "D" pop - Remove e retorna o elemento que está no topo da pilha.

    // Operações auxiliares:
    boolean estaCheia(); // isFull - overflow.

    boolean estaVazia(); // isEmpty - underflow.

    String imprimir(); // print
}
