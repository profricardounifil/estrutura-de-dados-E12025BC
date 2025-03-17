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

    public boolean estaVazia() {
        if(this.lista[0] == null) {
            return true;
        } else {
            return false;
        }
    }

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

    public void contarElementos() {
        int cont = 0;
        if(estaVazia()) {
            System.out.println("Existem " + cont + " elementos na lista.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (this.lista[i] != null) {
                    cont = cont + 1;
                } else {
                    break;
                }
            }
            System.out.println("Existem " + cont + " elementos na lista.");
        }
    }

    public void ordenarCrescente() {
        if(estaVazia()) {
            System.out.println("Não existem elementos para serem ordenados.");
        } else {
            Integer aux;
            for (int h = 0; h < this.tamanho; h++) {// 3
                for (int i = 0; i < (this.tamanho - 1); i++) {// 2
                    if(this.lista[i+1] != null &&this.lista[i] > this.lista[i+1]) {
                        aux = this.lista[i];
                        this.lista[i] = this.lista[i+1];
                        this.lista[i+1] = aux;
                    }
                }
            }

        }
    }

    public void insereOrdenado(int elemento) {
        ordenarCrescente();
        inserirElemento(elemento);

    }
}
