public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(3);
        listaSimples.inserirElemento(1);
        listaSimples.inserirElemento(2);
        listaSimples.inserirElemento(3);
        listaSimples.percorrerElementos();
        listaSimples.editarPorIndice(2, -4);
        listaSimples.percorrerElementos();
    }
}