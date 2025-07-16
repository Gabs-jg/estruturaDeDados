package Lista;

import java.util.LinkedList;

public class ListaEncadeadaMain {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Métodos simples:
        System.out.println("Métodos simples:");
        lista.adiciona(1);
        lista.adiciona(2);
        System.out.println(lista);
        System.out.println("Tamanho: " + lista.getTamanho());
        lista.adiciona(3);
        System.out.println(lista);
        lista.limpa();
        System.out.println(lista);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        lista.adiciona(3);
        System.out.println();

        // Busca por elemento.
        System.out.println("Busca por elemento:");
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));
        System.out.println(lista.busca(5));
        System.out.println();

        // Busca por posição.
        System.out.println("Busca por posição:");
        System.out.println(lista.buscaPorPosicao(3));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println();

        // Adiciona no início
        System.out.println("Adiciona no início:");
        lista2.adicionaInicio(3); // [3].
        lista2.adicionaInicio(2); // [2, 3].
        lista2.adicionaInicio(1); // [1, 2, 3].
        System.out.println(lista2); // [1, 2, 3] (Imprime toda a lista).
        System.out.println();

        // Adiciona na posição específica.
        System.out.println("Adiciona na posição específica:");
        lista.adicionaPosEspecifica(0, 7);
        System.out.println(lista);
        lista.adicionaPosEspecifica(3, 10);
        System.out.println(lista);
        lista.adicionaPosEspecifica(6, 8);
        System.out.println(lista);
        System.out.println();

        // Remove elementos do início:
        System.out.println("Remove elementos do início:");
        System.out.println("Removendo: " + lista2.remove()); // [2, 3].
        System.out.println(lista2); // [2, 3] (Imprime a toda a lista).
        System.out.println("Removendo: " + lista2.remove()); // [3].
        System.out.println(lista2); // [3] (Imprime toda a lista).
        System.out.println("Removendo: " + lista2.remove());; // [].
        System.out.println(lista2); // [] (Imprime toda a lista).
        // lista2.remove(); Erro.
        System.out.println();
        
        // Remove elementos do final:
        System.out.println("Remove elementos do final:");
        // Adicionando:
        lista2.adicionaInicio(3); // [3].
        lista2.adicionaInicio(2); // [2, 3].
        lista2.adicionaInicio(1); // [1, 2, 3].
        // Removendo:
        System.out.println("Removendo: " + lista2.removeFinal()); // [1, 2].
        System.out.println(lista2); // [1, 2] (Imprime a toda a lista).
        System.out.println("Removendo: " + lista2.removeFinal()); // [1].
        System.out.println(lista2); // [1] (Imprime toda a lista).
        System.out.println("Removendo: " + lista2.removeFinal());; // [].
        System.out.println(lista2); // [] (Imprime toda a lista).
        //lista2.remove(); Erro.
        System.out.println();

        // Remove elementos do meio:
        System.out.println("Remove elementos do meio:");
        // Adicionando:
        lista2.adicionaInicio(4); // [4].
        lista2.adicionaInicio(3); // [3, 4].
        lista2.adicionaInicio(2); // [2, 3, 4].
        lista2.adicionaInicio(1); // [1, 2, 3, 4].
        // Removendo:
        System.out.println("Removendo: " + lista2.removePosEspecifica(2)); // [1, 2, 4].
        System.out.println(lista2); // [1, 2] (Imprime a toda a lista).
        System.out.println("Removendo: " + lista2.removePosEspecifica(1)); // [1, 4].
        System.out.println(lista2); // [1, 4] (Imprime toda a lista).
        System.out.println("Removendo: " + lista2.removePosEspecifica(1));; // [1].
        System.out.println(lista2); // [1] (Imprime toda a lista).
        System.out.println("Removendo: " + lista2.removePosEspecifica(0)); // [].
        System.out.println(lista2); // [] (Imprime a lista toda).
        // System.out.println(lista2.removePosEspecifica(0)); Erro.
        System.out.println();

        // Linked List:
        System.out.println("Linked List:");
        // Adicionando:
        linkedList.add(1);
        linkedList.addFirst(0);
        linkedList.addLast(3);
        System.out.println(linkedList.contains(2));
        linkedList.add(2, 2);
        System.out.println(linkedList.contains(1));
        System.out.println(linkedList);
        // Removendo:
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}