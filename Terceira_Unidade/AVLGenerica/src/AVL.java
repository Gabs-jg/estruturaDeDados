/**
 * Implementação de uma árvore AVL genérica.
 * Garante balanceamento automático após inserções e remoções.
 * @author João Gabriel Oliveira Magalhães
 * @version 1.0
 * @param <T> Tipo dos dados armazenados nos nós (deve ser castável para Integer).
 */
public class AVL<T> implements Arborizavel<T> {

    private NoTriplo<T> raiz;

    public AVL() {
        raiz = null;
    }

    /**
     * Retorna a raiz da árvore.
     */
    @Override    
    public NoTriplo<T> getRaiz() {
        return raiz;
    }

    /**
     * Limpa toda a árvore, definindo a raiz como null.
     */
    @Override
    public void limpar() {
        raiz = null;
    }
    
    /**
     * Retorna o fator de balanceamento de um nó.
     * @param nodo Nó a ser avaliado.
     * @return diferença entre altura da subárvore esquerda e direita.
     */
    private int balanceamento(NoTriplo<T> nodo) {
        int alturaEsquerda = nodo.getEsquerda() != null ? nodo.getEsquerda().getAltura(): -1;
        int alturaDireita = nodo.getDireita() != null ? nodo.getDireita().getAltura(): -1;
        return alturaEsquerda - alturaDireita;
    }

    /**
     * Atualiza a altura de um nó com base na altura de seus filhos.
     * @param nodo Nó a ser atualizado.
     */
    private void atualizaAltura(NoTriplo<T> nodo) {
        int alturaEsquerda = nodo.getEsquerda() != null ? nodo.getEsquerda().getAltura(): -1;
        int alturaDireita = nodo.getDireita() != null ? nodo.getDireita().getAltura(): -1;
        nodo.setAltura(1 + Math.max(alturaEsquerda, alturaDireita));
    }

    /**
     * Executa rotação simples à direita.
     * @param y Subárvore desbalanceada.
     * @return Nova raiz da subárvore.
     */
    private NoTriplo<T> rotacaoDireita(NoTriplo<T> y) {
        NoTriplo<T> T0 = y.getGenitor();
        NoTriplo<T> x  = y.getEsquerda();
        NoTriplo<T> T2 = x.getDireita();

        // Reconecta ponteiros
        if (T0 != null)
            if (y.equals(T0.getEsquerda()))
                T0.setEsquerda(x);
            else
                T0.setDireita(x);
        x.setGenitor(T0);

        x.setDireita(y);
        y.setGenitor(x);

        y.setEsquerda(T2);        
        if (T2 != null)
            T2.setGenitor(y);

        atualizaAltura(y);
        atualizaAltura(x);
        return x;
    }

    /**
     * Executa rotação simples à esquerda.
     * @param y Subárvore desbalanceada.
     * @return Nova raiz da subárvore.
     */
    private NoTriplo<T> rotacaoEsquerda(NoTriplo<T> y) {
        NoTriplo<T> T0 = y.getGenitor();        
        NoTriplo<T> x  = y.getDireita();
        NoTriplo<T> T2 = x.getEsquerda();

        if (T0 != null)        
            if (y.equals(T0.getEsquerda()))
                T0.setEsquerda(x);
            else
                T0.setDireita(x);
        x.setGenitor(T0);
        
        x.setEsquerda(y);
        y.setGenitor(x); 

        y.setDireita(T2);        
        if (T2 != null)
            T2.setGenitor(y);

        atualizaAltura(y);
        atualizaAltura(x);
        return x;
    }

    /**
     * Rebalanceia a árvore após inserção ou remoção.
     * @param dado Valor inserido/removido (usado para decidir rotações).
     * @param noAuxiliar Nó a partir do qual subir e rebalancear.
     */
    private void rebalancear(T dado, NoTriplo<T> noAuxiliar) {
        while (noAuxiliar != null) {
            atualizaAltura(noAuxiliar);
            int desnivel = balanceamento(noAuxiliar);
             
            if (desnivel > 1 && (Integer) dado < (Integer) noAuxiliar.getEsquerda().getDado()) {
                noAuxiliar = rotacaoDireita(noAuxiliar);
            } else if (desnivel < -1 && (Integer) dado > (Integer) noAuxiliar.getDireita().getDado()) {
                noAuxiliar = rotacaoEsquerda(noAuxiliar);
            } else if (desnivel > 1 && (Integer) dado > (Integer) noAuxiliar.getEsquerda().getDado()) {
                noAuxiliar.setEsquerda(rotacaoEsquerda(noAuxiliar.getEsquerda()));
                noAuxiliar = rotacaoDireita(noAuxiliar);
            } else if (desnivel < -1 && (Integer) dado < (Integer) noAuxiliar.getDireita().getDado()) {
                noAuxiliar.setDireita(rotacaoDireita(noAuxiliar.getDireita()));
                noAuxiliar = rotacaoEsquerda(noAuxiliar);
            }

            if (noAuxiliar.getGenitor() != null) {
                if (noAuxiliar.equals(noAuxiliar.getGenitor().getEsquerda())) {
                    noAuxiliar.getGenitor().setEsquerda(noAuxiliar);
                } else {
                    noAuxiliar.getGenitor().setDireita(noAuxiliar);
                }
            } else {
                raiz = noAuxiliar;
            }

            noAuxiliar = noAuxiliar.getGenitor();
        }            
    }

    /**
     * Insere um valor na árvore AVL.
     * @param dado Valor a ser inserido.
     */
    @Override
    public void inserir(T dado) {
        NoTriplo<T> novoNo = new NoTriplo<>();
        novoNo.setDado(dado);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            NoTriplo<T> noAuxiliar = raiz;
            while (noAuxiliar != null) {
                if ((Integer) dado < (Integer) noAuxiliar.getDado()) {
                    if (noAuxiliar.getEsquerda() != null) {
                        noAuxiliar = noAuxiliar.getEsquerda();
                    } else {
                        noAuxiliar.setEsquerda(novoNo);
                        novoNo.setGenitor(noAuxiliar);
                        break;
                    }
                } else {
                    if (noAuxiliar.getDireita() != null) {
                        noAuxiliar = noAuxiliar.getDireita();
                    } else {
                        noAuxiliar.setDireita(novoNo);
                        novoNo.setGenitor(noAuxiliar);
                        break;
                    }
                }
            }
            rebalancear(dado, novoNo);
        }
    }

    /**
     * Remove um valor da árvore AVL.
     * @param dado Valor a ser removido.
     * @return O valor removido, ou null se não existir.
     */
    @Override
    public T apagar(T dado) {
        NoTriplo<T> noAuxiliar = buscar(dado);
        if (noAuxiliar == null)   
            return null;

        if (noAuxiliar.getEsquerda() == null && noAuxiliar.getDireita() == null)
            apagarNoFolha(noAuxiliar);
        else if (noAuxiliar.getEsquerda() == null || noAuxiliar.getDireita() == null)
            apagarComUmFilho(noAuxiliar);
        else
            apagarComDoisFilhos(noAuxiliar);

        rebalancear(dado, noAuxiliar);        
        return dado;
    }    

    /**
     * Busca um nó com determinado valor.
     */
    private NoTriplo<T> buscar(T dado) {
        NoTriplo<T> noAuxiliar = raiz;
        while (noAuxiliar != null) {
            if (dado.equals(noAuxiliar.getDado())) {
                return noAuxiliar;
            } else {
                if ((Integer) dado < (Integer) noAuxiliar.getDado())
                    noAuxiliar = noAuxiliar.getEsquerda();
                else
                    noAuxiliar = noAuxiliar.getDireita();
            }
        }
        return null;
    }

    /**
     * Remove nó folha (sem filhos).
     */
    private void apagarNoFolha(NoTriplo<T> nodo) {
        NoTriplo<T> pai = nodo.getGenitor();
        if (pai == null) {
            raiz = null;
        } else {
            if (nodo.equals(pai.getEsquerda()))
                pai.setEsquerda(null);
            else 
                pai.setDireita(null);
            nodo.setGenitor(null);                
        }
    }

    /**
     * Remove nó com exatamente um filho.
     */
    private void apagarComUmFilho(NoTriplo<T> nodo) {
        NoTriplo<T> avo = nodo.getGenitor();
        NoTriplo<T> neto = (nodo.getEsquerda() != null ? nodo.getEsquerda() : nodo.getDireita());        
        if (avo == null) {
            raiz = neto;
            raiz.setGenitor(null);
        } else {
            neto.setGenitor(avo);
            if (nodo.equals(avo.getEsquerda()))
                avo.setEsquerda(neto);
            else
                avo.setDireita(neto);
        }
    }

    /**
     * Remove nó com dois filhos.
     * Substitui pelo menor da subárvore direita.
     */
    private void apagarComDoisFilhos(NoTriplo<T> nodo) {
        NoTriplo<T> sucessor = encontraMenorDireita(nodo);

        T temp = nodo.getDado();
        nodo.setDado(sucessor.getDado());
        sucessor.setDado(temp);

        if (sucessor.getEsquerda() == null && sucessor.getDireita() == null) {
            apagarNoFolha(sucessor);
        } else {
            apagarComUmFilho(sucessor);
        }
    } 

    /**
     * Retorna o menor nó da subárvore direita.
     */
    private NoTriplo<T> encontraMenorDireita(NoTriplo<T> nodo) {
        NoTriplo<T> sucessor = nodo.getDireita();
        while (sucessor.getEsquerda() != null)
            sucessor = sucessor.getEsquerda();
        return sucessor;
    }  

    /**
     * Retorna o maior nó da subárvore esquerda (não utilizado atualmente).
     */
    private NoTriplo<T> encontraMaiorEsquerda(NoTriplo<T> nodo) {
        NoTriplo<T> sucessor = nodo.getEsquerda();
        while (sucessor.getDireita() != null)
            sucessor = sucessor.getDireita();
        return sucessor;
    } 

    /**
     * Verifica se um dado existe na árvore.
     */
    @Override
    public boolean existe(T dado) {
        NoTriplo<T> noAuxiliar = raiz;
        while (noAuxiliar != null) {
            if (dado.equals(noAuxiliar.getDado())) {
                return true;
            } else {
                if ((Integer) dado < (Integer) noAuxiliar.getDado())
                    noAuxiliar = noAuxiliar.getEsquerda();
                else
                    noAuxiliar = noAuxiliar.getDireita();
            }
        }
        return false;
    }

    // Impressão em diferentes ordens:

    @Override
    public String imprimirPreOrdem() {
        return formataSaida(imprimirPreOrdemRec(raiz));
    }

    @Override
    public String imprimirEmOrdem() {
        return formataSaida(imprimirEmOrdemRec(raiz));
    }

    @Override
    public String imprimirPosOrdem() {
        return formataSaida(imprimirPosOrdemRec(raiz));
    }

    private String imprimirPreOrdemRec(NoTriplo<T> raiz) {
        if (raiz != null)
            return raiz.getDado() + " " + imprimirPreOrdemRec(raiz.getEsquerda()) +  " " + imprimirPreOrdemRec(raiz.getDireita());
        return "";
    }

    private String imprimirEmOrdemRec(NoTriplo<T> raiz) {
        if (raiz != null)
            return imprimirEmOrdemRec(raiz.getEsquerda()) + " " + raiz.getDado() + " " + imprimirEmOrdemRec(raiz.getDireita());
        return "";
    }

    private String imprimirPosOrdemRec(NoTriplo<T> raiz) {
        if (raiz != null)
            return imprimirPosOrdemRec(raiz.getEsquerda()) + " " + imprimirPosOrdemRec(raiz.getDireita()) +  " " + raiz.getDado();
        return "";
    }

    /**
     * Formata a string final de saída de impressão.
     * Remove espaços extras e troca por vírgulas.
     */
    private String formataSaida(String msg) {
        String resultado;
        do {
            resultado = msg;
            msg = msg.replace("  ", " ");
        } while (!msg.equals(resultado));
        msg = msg.trim();
        msg = msg.replace(" ", ",");
        return "[" + msg + "]";
    }    
}
