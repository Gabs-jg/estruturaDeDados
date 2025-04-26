package Primeira_Unidade.Aulas.AlgoritmosDeOrdenação;

public class BubbleSortAula05 {

    int dados[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

    public void bubbleSort() {
        for (int j = 0; j < dados.length - 1; j++) {
            for (int i = 0; i < (dados.length - 1) - j; i++) { // O - j serve para evitar comparações desnecessárias.
                if (dados[i] > dados[i + 1]) {
                    troca(i, i + 1);
                }
            }
        }
    }

    private void troca(int indice1, int indice2) {
        int temp = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = temp;
    }

    public void imprimirTela() {
        for (int dado : dados) {
            System.out.print(dado + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        BubbleSortAula05 sort = new BubbleSortAula05();
        System.out.println("Antes: ");
        sort.imprimirTela();
        sort.bubbleSort();

        System.out.println("Depois:");
        sort.imprimirTela();
    }

}
