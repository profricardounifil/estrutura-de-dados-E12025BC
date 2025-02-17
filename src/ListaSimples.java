public class ListaSimples {
    private int tamanho;
    private Integer lista [];

    public ListaSimples(int tamanhoDaLista) {
        this.tamanho = tamanhoDaLista;
        lista = new Integer[tamanhoDaLista];
        System.out.println("A lista foi criada com sucesso! Seu tamanho é igual a:" + tamanhoDaLista);
    }

    public void inserirElemento(int elemento) {
        for (int i = 0; i < this.tamanho ; i++) {
            if(posicaoEstaVazia(i)) {
                this.lista[i] = elemento;
                break;
            }
        }
    }

//    public boolean estaVazia() {
//
//    }

    public boolean posicaoEstaVazia(int posicao) {
        if (this.lista[posicao] == null) {
            return true;
        }
        return false;
    }

    public void percorrerElementos() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.lista[i]);
        }
    }

    public void removerPorIndice(int indice) {
        if(verificarIntervalo(indice)) {
            if(posicaoEstaVazia(indice)) {
                System.out.println("A posição informada já está vazia.");
            } else {
                this.lista[indice] = null;
            }
        }
    }

    public boolean verificarIntervalo(int indice) {
        if(indice >= 0 && indice <= this.tamanho-1) {
            return true;
        } else {
            System.out.println("O indice informado está fora do intervalo da lista.");
            return false;
        }
    }

    public boolean buscaElemento(int elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.lista[i] == elemento) {
                System.out.println("O elemento " + elemento + " existe na lista, no índice " + (i+1));
                return true;
            }
        }
        System.out.println("O elemento não foi encontrado!");
        return false;
    }

    public void editarPorIndice(int indice, int elemento) {
        if(verificarIntervalo(indice)) {
            if(posicaoEstaVazia(indice)) {
                System.out.println("A posição informada já está vazia.");
            } else {
                this.lista[indice] = elemento;
            }
        }
    }
}
