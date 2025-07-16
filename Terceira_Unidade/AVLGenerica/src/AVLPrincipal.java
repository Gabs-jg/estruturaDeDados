package Terceira_Unidade.AVLGenerica.src;

import java.util.Scanner;

/**
 * Classe principal com interface de linha de comando (CLI)
 * para testar uma Árvore Binária de Busca Balanceada (AVL).
 * @author João Gabriel Oliveira Magalhães
 * @version 1.0
 */
public class AVLPrincipal {

    public static void main(String args[]) {
        /*
         * Exemplo de entrada recomendada para testes:
         * Inserir: 4 2 6 1 3 5 7
         * Resultado esperado:
         * - Pré-Ordem: [4,2,1,3,6,5,7]
         * - Em-Ordem:  [1,2,3,4,5,6,7]
         * - Pós-Ordem: [1,3,2,5,7,6,4]
         */

        Scanner scanner = new Scanner(System.in);
        int opcao, valor;

        // Instancia uma árvore AVL com valores inteiros
        Arborizavel<Integer> arvore = new AVL<>();

        // Loop do menu principal
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo da ABP. Até mais!");
                    break;

                case 1:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();
                    arvore.inserir(valor);
                    break;

                case 2:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();                
                    arvore.apagar(valor);
                    break;

                case 3:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();                
                    System.out.println(arvore.existe(valor));
                    break;

                case 4:
                    // Submenu para impressões em diferentes ordens
                    exibirMenuImprimir();
                    int opcaoImprimir = scanner.nextInt();
                    switch (opcaoImprimir) {
                        case 1:
                            System.out.println();
                            System.out.println("Pré-Ordem: " + arvore.imprimirPreOrdem());
                            System.out.println();                           
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("Em-Ordem: " + arvore.imprimirEmOrdem());
                            System.out.println();                           
                            break;

                        case 3:
                            System.out.println();                
                            System.out.println("Pós-Ordem: " + arvore.imprimirPosOrdem());
                            System.out.println();                            
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 5:
                    arvore.limpar();
                    System.out.println("Árvore limpa!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();        
    }

    /**
     * Exibe o menu principal com as opções disponíveis ao usuário.
     */
    private static void exibirMenu() {
        System.out.println("=== Árvore Binária AVL ===");
        System.out.println("0. SAIR");
        System.out.println("1. Inserir");
        System.out.println("2. Apagar");
        System.out.println("3. Existe?");
        System.out.println("4. Imprimir");
        System.out.println("5. Limpar");        
        System.out.print("Escolha uma opção (0-5): ");
    }   

    /**
     * Exibe o submenu com opções de impressão em diferentes ordens.
     */
    private static void exibirMenuImprimir() {
        System.out.println("1. Imprimir Pré-Ordem");
        System.out.println("2. Imprimir Em-Ordem");
        System.out.println("3. Imprimir Pós-Ordem");                
        System.out.print("Escolha uma opção (1-3): ");
    }         
}

