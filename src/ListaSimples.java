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
}
