package Primeira_Unidade.Aulas.Listas;

public class ListaPrincipalAula04 {

    public static void main(String[] args) {
        ListavelAula04 lista1 = new ListaEstaticaCircularAula04(5);
        ListavelAula04 lista2 = new ListaEstaticaCircularAula04(5);
        ListavelAula04 lista3 = new ListaEstaticaCircularAula04(10);
        ListavelAula04 lista4 = new ListaEstaticaCircularAula04(50);
        Object[] dados;

        lista1.anexar("O");
        lista1.anexar("Astronauta");
        lista1.anexar("de");
        lista1.anexar("Azul");
        lista1.anexar("Mármore");
        lista1.apagar(3);

        lista2.anexar("O");
        lista2.anexar("Azul");
        lista2.anexar("Astronauta");
        lista2.anexar("de");
        lista2.anexar("Mármore");
        lista2.apagar(1);

        lista3.anexar("O");
        lista3.anexar("Azul");
        lista3.anexar("Astronauta");
        lista3.anexar("de");
        lista3.anexar("Azul");
        lista3.anexar("Azul");
        lista3.anexar("Azul");
        lista3.anexar("Azul");
        lista3.inserir("Mármore", 6);
        lista3.apagar(1);

        dados = lista3.selecionarTodos();

        for (int i = 0; i < 40; i++) {
            lista4.anexar("a");
        }

        lista4.inserir("b", 0);

        System.out.println(lista1.imprimir());
        System.out.println(lista2.imprimir());
        System.out.println(lista3.imprimir());
        System.out.println(dados[2]);
        System.out.println(lista4.imprimir());
        System.out.println(lista1.primeiroIndice("Astronauta"));

    }
}
