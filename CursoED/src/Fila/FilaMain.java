package Fila;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaMain {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> filaPrioridade = new PriorityQueue<>();

        // Fila:
        System.out.println("Fila:"); // Fila:
        System.out.println(fila.estaVazia()); // true.
        fila.enfileira(1); // [1].
        fila.enfileira(2); // [1, 2].
        fila.enfileira(3); // [1, 2, 3].
        System.out.println(fila.estaVazia()); // false
        System.out.println(fila); // [1, 2, 3] (Imprime toda a fila).
        System.out.println(fila.espia()); // 1.
        System.out.println(fila.desenfileira()); // 1. retorna o número 1 removido (primeira posição da fila).
        System.out.println(fila); // [2, 3].
        System.out.println();

        //Queue:
        System.out.println("Queue:"); // Queue:
        queue.add(1); // [1].
        queue.add(2); // [1, 2].
        System.out.println(queue); // [1, 2] (Imprime toda a lista).
        System.out.println(queue.peek()); // 1.
        System.out.println(queue.remove()); // 1.
        System.out.println(queue); // [2].
        System.out.println();

        //Fila prioridade (collections):
        System.out.println("Fila prioridade:"); // Fila prioridade.
        filaPrioridade.add(2); // [2].
        filaPrioridade.add(1); // [2, 1].
        System.out.println(filaPrioridade); // [1, 2].

    }
}
