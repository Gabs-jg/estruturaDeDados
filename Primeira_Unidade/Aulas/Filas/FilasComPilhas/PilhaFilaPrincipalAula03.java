package Primeira_Unidade.Aulas.Filas.FilasComPilhas;

public class PilhaFilaPrincipalAula03 {

    public static void main(String[] args) {
        EnfileiravelAula03 fila = new PilhaFilaAula03();
        fila.enfileirar("A");
        System.out.println(fila.frente());
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.atualizarInicio("R");
        fila.enfileirar("D");
        fila.desenfileirar();
        fila.enfileirar("E");
        Object conteudo = fila.desenfileirar();
        fila.enfileirar("F");
        System.out.println(fila.frente());
        System.out.println(fila.frente());
        fila.enfileirar("G");
        fila.enfileirar(conteudo);
        fila.enfileirar("I");
        fila.enfileirar("J");
        fila.atualizarFim("S");
        fila.enfileirar("K");
        System.out.println("Fila: " + fila.imprimir());
    }

}
