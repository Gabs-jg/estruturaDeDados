import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Classe principal que demonstra o uso da Pilha Dinâmica.
 * Esta classe implementa um menu interativo que permite ao usuário testar todas as
 * operações disponíveis na implementação da pilha.
 * 
 * @author João Gabriel Oliveira Magalhães.
 * @version 1.0
 * @since 2025-06-11
 */
public class PilhaDinamicaPrincipal {
    public static void main(String[] args) {
        Empilhavel<String> pilha = new PilhaDinamica<>(7);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            menu();
            System.out.print("Escolha uma opção (0-7): ");
            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 0:
                        System.out.println("Saindo da pilha.");
                        break;
                    case 1: 
                        System.out.print("Digite o valor a ser empilhado: ");
                        String valor = sc.nextLine();
                        try {
                            pilha.empilhar(valor);
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            pilha.desempilhar();
                            System.out.println("Dado desempilhado com sucesso.");
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Topo da pilha: " + pilha.espiar());
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Digite o novo valor para atualizar o topo da pilha: ");
                        String novoValor = sc.nextLine();
                        try {
                            pilha.atualizar(novoValor);
                            System.out.println("Topo da pilha atualizado com sucesso.");
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println(pilha.imprimir());
                        break;
                        case 6:
                            if(pilha.estaVazia()) {
                                System.out.println("A pilha está vazia.");
                            } else {
                                System.out.println("A pilha não está vazia.");
                            }
                            break;
                        case 7:
                            if(pilha.estaCheia()) {
                                System.out.println("A pilha está cheia.");
                            } else {
                                System.out.println("A pilha não está cheia.");
                            }
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                } 
            } catch(InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, tente novamente.");
                sc.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("=== Menu Pilha Dinâmica ===");
        System.out.println("0 - Sair");
        System.out.println("1 - Empilhar");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Espiar");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Imprimir");
        System.out.println("6 - Verificar se está vazia");
        System.out.println("7 - Verificar se está cheia");
    }
}
