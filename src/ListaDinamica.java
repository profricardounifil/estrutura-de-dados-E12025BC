public class ListaDinamica {
    private No primeiroElemento;

    public ListaDinamica(String conteudo) {
        primeiroElemento = new No(conteudo);

    }

    public No getPrimeiroElemento() {
        return this.primeiroElemento;
    }

    public void inserirElemento(String conteudo) {
        No no = new No(conteudo);

        // Encontrar o último elemento da Lista dinâmica
        if(primeiroElemento.getProx() == null) {
            primeiroElemento.setProx(no);
        } else {
            No atual = primeiroElemento;
            while(atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(no);
        }

        primeiroElemento.setProx(no);
    }

    @Override
    public String toString() {
        return "ListaDinamica{" +
                "primeiroElemento=" + primeiroElemento +
                '}';
    }
}
