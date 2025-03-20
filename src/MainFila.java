public class MainFila {
    public static void main(String[] args) {
        FilaSimples filaSimples = new FilaSimples(5);
        filaSimples.enfileira(4);
        filaSimples.enfileira(3);
        filaSimples.enfileira(5);
        filaSimples.enfileira(6);
        filaSimples.enfileira(4);
        filaSimples.desinfileira();
        filaSimples.enfileira(20);
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.desinfileira();
        filaSimples.enfileira(5);
        filaSimples.percorrerFila();
    }
}
