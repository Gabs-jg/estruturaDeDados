package Segunda_Unidade.ListaDinamica;

public class ListaDinamicaGenericaMain {
    public static void main(String[] args) {
        ListaDinamicaGenerica<Integer> lista = new ListaDinamicaGenerica<>();

        // Adicionar no início
        System.out.println("Adiciona no início:");
        lista.adicionarInicio(1);
        lista.adicionarInicio(2);
        lista.adicionarInicio(3);
        lista.adicionarInicio(4);
        System.out.println(lista);
        System.out.println();

        // Adiciona no final
        System.out.println("Adiciona no final:");
        lista.adicionarFinal(5);
        lista.adicionarFinal(6);
        lista.adicionarFinal(7);
        System.out.println(lista);
        System.out.println();

        // Adiciona na posição específica
        System.out.println("Adiciona na posição específica:");
        lista.adicionarPosEspecifica(4, 10);
        lista.adicionarPosEspecifica(6, 11);
        lista.adicionarPosEspecifica(7, 11);
        System.out.println(lista);
        System.out.println();

        // Selecionando um elemento
        System.out.println("Selecionando um elemento:");
        System.out.println(lista.selecionar(4));
        System.out.println(lista.selecionar(5));
        System.out.println(lista.selecionar(6));
        System.out.println();

        // Selecionando todos os elementos
        Integer elementos[] = lista.selecionarTodos();
        System.out.println("Selecionando todos os elementos:");
        for (Integer elemento : elementos) {
            System.out.print(elemento + " ");
        }
    }
}
