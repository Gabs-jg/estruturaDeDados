package Pilha;
import java.util.Stack;

public class PilhaPrincipal {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();

        //Pilha estática:
        System.out.println("Pilha Estática:"); // Pilha Estática:
        System.out.println(pilha.desempilha()); // null.
        System.out.println(pilha.espia()); // null.
        System.out.println(pilha.estaVazia()); // true.
        //Empilhando
        for(int i=0; i<=10; i++) { // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] cada iteração adiciona 1 elemento.
            pilha.empilha(i);
        }
        System.out.println(pilha); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] (imprime toda a pilha).
        System.out.println(pilha.getTamanho()); // 11.
        System.out.println(pilha.estaVazia()); // false.
        System.out.println(pilha.espia()); // 10.
        System.out.println("Desempilhando elemento: " + pilha.desempilha()); // Desempilhando o elemento: 10.
        System.out.println(pilha.espia()); // 9.
        System.out.println(pilha); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] (imprime toda a pilha).
        pilha.atualizar(10); // Coloca o número 10 no lugar do número 9.
        System.out.println(pilha); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 10] (imprime toda a pilha).
        System.out.println();

        //Stack (collections):
        System.out.println("Stack:"); // Stack:
        System.out.println(stack.isEmpty()); //true.
        stack.push(1); // [1] adiciona o 1.
        stack.push(2); // [1, 2] adiciona o 2.
        stack.push(3); // [1, 2, 3] adiciona o 3.
        System.out.println(stack.isEmpty()); // false.
        System.out.println(stack.size()); // 3.
        System.out.println(stack); // [1, 2, 3] (imprime toda a pilha).
        System.out.println(stack.peek()); // 3.
        System.out.println(stack.pop()); // 3 (retorna o removido).
        System.out.println(stack); // [1, 2] (imprime toda a pilha).
    }
}
