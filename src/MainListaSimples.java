public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        listaSimples.inserirElemento(4);
        listaSimples.inserirElemento(3);
        listaSimples.inserirElemento(1);
        listaSimples.percorrerElementos();
        listaSimples.insereOrdenado(25);
        listaSimples.percorrerElementos();
        //listaSimples.inserirElemento(2);
        //listaSimples.inserirElemento(3);
        //listaSimples.inserirElemento(4);
        //listaSimples.percorrerElementos();
        //listaSimples.editarPorIndice(2, -4);
        //listaSimples.percorrerElementos();
        //listaSimples.ordenarCrescente();
        //listaSimples.percorrerElementos();
    }
}