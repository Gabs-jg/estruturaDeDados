package Primeira_Unidade.Aulas.Listas;

public interface ListavelAula04 {

    void inserir(Object dado, int posicao); // C

    void anexar(Object dado); // C

    Object selecionar(int posicao); // R

    Object[] selecionarTodos(); // R

    void atualizar(Object dado, int posicao); // U

    Object apagar(int posicao); // D

    boolean contem(Object dado);

    public int primeiroIndice(Object dado);

    void limpar(); // D

    // Extra
    int primeiraOcorrencia(Object dado);

    int ultimaOcorrencia(Object dado);

    boolean estaCheia();

    boolean estaVazia();

    String imprimir();

}
