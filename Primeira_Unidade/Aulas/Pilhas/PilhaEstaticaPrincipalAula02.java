package Primeira_Unidade.Aulas.Pilhas;

public class PilhaEstaticaPrincipalAula02 {
	public static void main(String[] args) {
		PilhaEstaticaAula02 pilha = new PilhaEstaticaAula02(7);
		pilha.empilhar("Instituto");
		pilha.empilhar("Federal");
		System.out.println("Espiar:" + pilha.espiar());
		pilha.empilhar("de");
		pilha.empilhar("Educação");
		pilha.empilhar("Ciência");
		pilha.empilhar("e");
		System.out.println("Espiar:" + pilha.espiar());
		String conteudo = (String) pilha.desempilhar();
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
