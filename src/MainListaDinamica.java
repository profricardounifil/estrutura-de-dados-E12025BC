public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica salaENSW = new ListaDinamica("Pedro");
        salaENSW.insereElemento("Gustavo");
        salaENSW.insereElemento("Marcos");
        //salaENSW.insereElemento("Victor");
        salaENSW.removerElemento("Gustavo");
        salaENSW.percorrerElementos();
    }
}
