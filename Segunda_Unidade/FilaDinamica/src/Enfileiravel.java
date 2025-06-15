public interface Enfileiravel<T> {


    void enfileirarInicio(T dado);

    T desenfileirar();



    Boolean estaVazia();

    Boolean estaCheia();


}