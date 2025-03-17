public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica salaENSW = new ListaDinamica("4");
        salaENSW.insereElemento("3");
        salaENSW.insereElemento("1");
        salaENSW.percorrerElementos();
        System.out.println("+++++++");
        salaENSW.inserirOrdenado("25");
        //salaENSW.insereElemento("Marcos");
        //salaENSW.insereElemento("Victor");
        //salaENSW.removerElemento("Gustavo");
        //salaENSW.percorrerElementos();
        //salaENSW.percorrerElementos();
        //salaENSW.ordenarCrescente();
        salaENSW.percorrerElementos();
    }
}
