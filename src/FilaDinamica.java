public class FilaDinamica {
    private No primeiro;
    private No ultimo;
    private int qtdElementos;

    public FilaDinamica(String conteudo) {
        this.primeiro = new No (conteudo);
        this.ultimo = this.primeiro;
        this.qtdElementos = 1;
    }

    public void enfileira(String conteudo) {
        No novoNo = new No (conteudo);
        if(vazia()) {
            this.primeiro = novoNo;
            this.ultimo = this.primeiro;
            this.qtdElementos = 1;
        } else {
            this.ultimo.setProx(novoNo);
            this.ultimo = novoNo;
            this.qtdElementos++;
        }
    }

    public void desinfileira() {
        if(vazia()) {
            System.out.println("Não existem elementos na fila.");
        } else {
            if(this.primeiro == this.ultimo) {
                this.primeiro = this.primeiro.getProx();
                this.ultimo = this.primeiro;
                this.qtdElementos--;
            } else {
                this.primeiro = this.primeiro.getProx();
                this.qtdElementos--;
            }
        }
    }

    public No buscarElemento(String conteudo) {
        if(vazia()) {
            System.out.println("Não existem elementos para serem buscados.");
        } else {
            No atual = this.primeiro;
            int posicao = 1;
            while(atual != null) {
                if(atual.getConteudo().equals(conteudo)) {
                    System.out.println("O conteudo " + conteudo + " existe na fila, na posição " + posicao + ".");
                    return atual;
                }
                posicao++;
                atual = atual.getProx();
            }
            System.out.println("O elemento " + conteudo + " não existe na fila.");
        }
        return null;
    }

    public void percorrerFila() {
        if(vazia()) {
            System.out.println("Não existem elementos para serem exibidos.");
        } else {
            No atual = this.primeiro;
            for (int i = 0; i < this.qtdElementos; i++) {
                System.out.println((i+1) + " - " + atual.getConteudo());
                atual = atual.getProx();
            }
        }
    }

    public boolean vazia() {
        if(qtdElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void editarElemento(String conteudo, String conteudoAtualizado) {
        if(buscarElemento(conteudo) != null) {
            buscarElemento(conteudo).setConteudo(conteudoAtualizado);
            System.out.println("O conteúdo " + conteudo + " foi atualizado para: " + conteudoAtualizado + ".");
        } else {
            return;
        }
    }

}
