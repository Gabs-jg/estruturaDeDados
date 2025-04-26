package Primeira_Unidade.Aulas.AlgoritmosDeOrdenação;

public class InsertionSortAula05 {

    int dados[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

    public void insertionSort() {
        for (int j = 1; j < dados.length; j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (dados[i + 1] < dados[i]) {
                    troca(i + 1, i);
                } else {
                    break;
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
        InsertionSortAula05 sort = new InsertionSortAula05();
        System.out.println("Antes: ");
        sort.imprimirTela();
        sort.insertionSort();

        System.out.println("Depois:");
        sort.imprimirTela();
    }

}
