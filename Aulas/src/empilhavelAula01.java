public interface EmpilhavelAula01 {
    //Operações principais:
    void empilhar(Object dado); //push - Adiciona um elemento no topo da pilha.
    Object desempilhar(); //pop - Remove e retorna o elemento que está no topo da pilha.
    Object espiar(); //peek - Mostra o elemento que está no topo da pilhas mas não o remove.
    void atualizar(Object dado); //update - Atualiza o valor do elemento do topo da pilha.
    
    //Operações auxiliares:
    boolean estaCheia(); //isFull - overflow.
    boolean estaVazia(); //isEmpty - underflow.
    String imprimir(); //print
}
    
