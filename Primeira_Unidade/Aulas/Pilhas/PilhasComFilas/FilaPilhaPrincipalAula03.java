package Primeira_Unidade.Aulas.Pilhas.PilhasComFilas;

public class FilaPilhaPrincipalAula03 {

    public static void main(String[] args) {
        FilaPilhaAula03 pilha = new FilaPilhaAula03(12);

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(6);

        System.out.println("Pilha: " + pilha.imprimir());
        System.out.println("Topo: " + pilha.espiar());

        System.out.println("Desempilhando...");
        pilha.desempilhar();

        System.out.println("Pilha: " + pilha.imprimir());

        System.out.println("Empilhando...");
        pilha.empilhar(7);
        pilha.empilhar(8);
        pilha.empilhar(9);
        pilha.atualizar(0);

        System.out.println("Pilha: " + pilha.imprimir());
    }

}
