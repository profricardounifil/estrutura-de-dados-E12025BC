public class MainFilaDinamica {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica("Marcos");
        filaDinamica.enfileira("Gustavo");
        filaDinamica.enfileira("Pedro");
        //filaDinamica.desinfileira();
        //filaDinamica.buscarElemento("Marcos");
        filaDinamica.editarElemento("Marcos", "Marcos Vinicius");
        filaDinamica.percorrerFila();
    }
}
