package Primeira_Unidade.Aulas.Pilhas;

public class PilhaInvertidaPrincipalAula02 {
    public static void main(String args[]) {
        EmpilhavelAula01 pilha = new PilhaEstaticaInvertidaAula02(7);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        System.out.println("Espiar:" + pilha.espiar());
        pilha.empilhar("de");
        pilha.empilhar("Educação");
        pilha.empilhar("Ciência");
        pilha.empilhar("e");
        System.out.println("Espiar:" + pilha.espiar());
        Object conteudo = pilha.desempilhar();
        pilha.desempilhar();
        pilha.empilhar("Tecnologia");
        pilha.empilhar("da");
        pilha.empilhar("Bahia");
        pilha.atualizar("São Paulo");
        pilha.empilhar(pilha.desempilhar());
        pilha.empilhar(conteudo);
        System.out.println("Pilha=" + pilha.imprimir());
    }
}
