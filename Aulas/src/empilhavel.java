public interface empilhavel {

    //Operações principais:
    void empilhar(); //push - Adiciona um elemento no topo da pilha.
    Object desempilhar(); //pop - Remove e retorna o elemento que está no topo da pilha.
    Object topo(); //top - Mostra o elemento que está no topo da pilhas mas não o remove.
    void atualizar(Object dado); //update - Atualiza o valor do elemento do topo da pilha.

    //Operações auxiliares:
    boolean estaCheia(); //isFull - overflow.
    boolean estaVazia(); //isEmpty - underflow.
    String imprimir(); //print

    /*
    --------------------------------
    Conjunto de Estruturas de Dados:
    --------------------------------
    C - Create. (Criar);
    R - Read. (Ler);
    U - Update. (Atualizar);
    D - Delete. (Deletar);
    S - Sort. (Ordenar).
    ---------------------------------

    TIPOS DE DADOS:
        - Numéricos(positivos ou negativos):
            - Inteiros:
                - unsigned int;
                - tinyint, smallint;
                - int;
                - long, longint, bigint.
            - Ponto flutuante:
                - float;
                - double.
            - Ponto fixo.
        - String = " ".
        - Char = ' '.
        - Lógico:
            - boolean (bool).
        - Matriz unidimensional:
            - Vetor;
            - Array.
        - Ponteiro:
            - É uma variável que guarda o endereço de um local de memória.
        - Objeto.
     */
}
