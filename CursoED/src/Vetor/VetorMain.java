package Vetor;
import java.util.ArrayList;

public class VetorMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        VetorObject vetor = new VetorObject(1);
        VetorGeneric<String> vetorGeneric = new VetorGeneric<>(1);

        // Vetor genérico:
        System.out.println("Vetor Genérico:");
        vetorGeneric.adiciona("elemento 1");
        System.out.println(vetorGeneric);
        vetorGeneric.adiciona("elemento 2");
        vetorGeneric.adiciona("elemento 3");
        vetorGeneric.adiciona("elemento 4");
        System.out.println(vetorGeneric);
        vetorGeneric.remove("elemento 3");
        System.out.println(vetorGeneric);
        System.out.println(vetorGeneric.obtem(1));
        vetorGeneric.limpar();
        System.out.println(vetor);
        System.out.println(vetorGeneric.getTamanho());

        System.out.println();

        // Vetor Object: 
        System.out.println("Vetor Object:");
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 3");
        System.out.println(vetor.getTamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.busca(0));
        System.out.println(vetor.contem("elemento 1"));
        System.out.println(vetor.ultimoIndice("elemento 1"));
        vetor.adiciona(2, "elemento 2");
        System.out.println(vetor);
        vetor.adiciona(0, "elemento 4");
        System.out.println(vetor);
        vetor.adiciona(0, 67);
        System.out.println(vetor);
        vetor.adiciona(3, "elemento 6");
        System.out.println(vetor);
        vetor.adiciona(0, "elemento 7");
        System.out.println(vetor);
        vetor.remove(4);
        System.out.println(vetor);
        System.out.println(vetor.busca("elemento 7"));

        System.out.println();

        //Array List (collections):
        System.out.println("Array List:");
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);
        arrayList.add(1, "B");
        System.out.println(arrayList);
        boolean existe = arrayList.contains("A");
        if(existe) {
            System.out.println("Elemento existe no array.");
        } else {
            System.out.println("Elemento não existe no array.");
        }
        int pos = arrayList.indexOf("C");
        if(pos>-1) {
            System.out.println("Elemento existe no array. Posição: " + pos);
        } else {
            System.out.println("Elemento não existe no array.");
        }
        System.out.println(arrayList.get(2));
        arrayList.remove("B");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println(arrayList.size());

        System.out.println();
    }
}