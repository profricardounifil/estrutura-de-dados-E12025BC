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

    public void removerElemento(String conteudo) {
        if(estaVazia()) {
            System.out.println("Não há elementos na lista.");
        } else if(verificaExistencia(conteudo)){
            if(this.primeiroElemento.getConteudo().equals(conteudo)) {// removendo primeiro elemento
                this.primeiroElemento = this.primeiroElemento.getProx();
            } else {
                No aux = this.primeiroElemento;
                while(aux.getProx().getConteudo() != conteudo) {
                        aux = aux.getProx();
                }
                aux.setProx(aux.getProx().getProx());
            }
        } else {
            System.out.println("O elemento buscado não existe.");
        }
    }

    public boolean verificaExistencia(String conteudo) {
        No aux = this.primeiroElemento;
        while(aux != null) {
            if(aux.getConteudo() == conteudo) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

}