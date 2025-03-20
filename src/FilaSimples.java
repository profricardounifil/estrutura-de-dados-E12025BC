public class FilaSimples {
    private int tamanho;
    private Integer[] fila;
    private int posicaoDisponivel;

    public FilaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.fila = new Integer[tamanho];
        this.posicaoDisponivel = 0;
    }

    public void enfileira(Integer elemento) {
        if(vazia()) {
            this.fila[0] = elemento;
            this.posicaoDisponivel++;
        } else {
            if(cheia()) {
                System.out.println("A fila está cheia.");
            } else {
                this.fila[this.posicaoDisponivel] = elemento;
                this.posicaoDisponivel++;
            }
        }
    }

    public boolean vazia() {
        if(this.fila[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cheia() {
        if(this.fila[this.tamanho-1] != null) {
            return true;
        } else {
            return false;
        }
    }

    public void percorrerFila() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.fila[i]);
        }
    }

    public void desinfileira() {
        if(vazia()) {
            System.out.println("Não existem elementos na fila para remoção.");
        } else {
            //this.fila[0] = null;
            for (int i = 0; i < this.tamanho-1; i++) {
                this.fila[i] = this.fila[i+1];
                //this.posicaoDisponivel--;
            }
            this.fila[tamanho-1] = null;
            this.posicaoDisponivel--;
        }
        //
    }
}
