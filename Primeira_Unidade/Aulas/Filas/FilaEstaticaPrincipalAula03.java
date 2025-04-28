package Primeira_Unidade.Aulas.Filas;

public class FilaEstaticaPrincipalAula03 {
    public static void main(String[] args) {
		EnfileiravelAula03 fila = new FilaEstaticaAula03();
		fila.enfileirar("A");
		System.out.println(fila.frente());		
		fila.enfileirar("B");
		fila.enfileirar("C");
		fila.atualizarInicio("H");
		fila.enfileirar("D");
		fila.desenfileirar();
		fila.enfileirar("E");
		Object conteudo = fila.desenfileirar();
		fila.enfileirar("F");
		fila.atualizarFim("J");
		System.out.println(fila.frente());
		System.out.println(fila.frente());		
		fila.enfileirar("G");
		fila.enfileirar(conteudo);
		fila.enfileirar("I");
		fila.atualizarInicio("K");
		fila.enfileirar("J");
		fila.enfileirar("K");					
		System.out.println("Fila: " + fila.imprimir());
	}
}
