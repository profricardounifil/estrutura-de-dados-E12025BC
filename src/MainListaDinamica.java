public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica("Pedro");
        No no = listaDinamica.getPrimeiroElemento();
        System.out.println(no.getConteudo());
        
    }
}
