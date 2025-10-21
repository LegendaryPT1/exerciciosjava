import java.util.ArrayList;

 class exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Casimiro");
        nomes.add("Leandro");
        for (String nome: nomes) {
            System.out.println("Ola "+nome);
        }
    }
}