public class ListaDinamica {
    private No primeiroElemento;

    public ListaDinamica(String conteudo) {
        this.primeiroElemento = new No(conteudo);
    }

    public void insereElemento(String conteudo) {
        No novoNo = new No(conteudo);
        if(estaVazia()) {
            this.primeiroElemento = novoNo;
        } else {
            No aux = this.primeiroElemento;
            while(aux.getProx() != null) { //Garanto que existem elementos a serem percorridos
                aux = aux.getProx();
            }
            //Apto para inserir o novo NO
            aux.setProx(novoNo);
        }
    }

    public void percorrerElementos() {
        if(estaVazia()) {
            System.out.println("A lista se encontra vazia.");
        } else {
            No aux = this.primeiroElemento;
            while(aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        }
    }

    public boolean estaVazia() {
        if(this.primeiroElemento == null) { //não existem elementos na lista
            return true;
        }
        return false;
    }

    //to do
    //método de remoção por elemento (verificar casos)
    //método de busca por elemento


}