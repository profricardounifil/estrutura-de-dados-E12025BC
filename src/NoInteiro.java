public class NoInteiro {
    private Integer conteudo;
    private NoInteiro prox;

    public NoInteiro(Integer conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public NoInteiro getProx() {
        return prox;
    }

    public void setProx(NoInteiro prox) {
        this.prox = prox;
    }
}