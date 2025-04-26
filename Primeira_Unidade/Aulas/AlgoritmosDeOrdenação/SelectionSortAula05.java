package Primeira_Unidade.Aulas.AlgoritmosDeOrdenação;

public class SelectionSortAula05 {

    int dados[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

    public void selectionSort() {
        for (int j = 0; j < dados.length; j++) {
            int menor = j;
            for (int i = 1 + j; i < dados.length; i++) {
                if (dados[menor] > dados[i]) {
                    menor = i;
                }
            }
            troca(j, menor);
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
        SelectionSortAula05 sort = new SelectionSortAula05();
        System.out.println("Antes: ");
        sort.imprimirTela();
        sort.selectionSort();

        System.out.println("Depois:");
        sort.imprimirTela();
    }

}
