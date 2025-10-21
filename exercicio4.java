public class StockVeiculos {

    public String[] registoVeiculos() {
        String[] marcas = {"Mercedes", "Opel", "Ford", "Yamaha"};
        String[] cores = {"Cinza", "Vermelho", "Cinza", "Preto"};
        double[] cilindradas = {2.0, 1.6, 2.0, 0.7};
        String[] mudancas = {"Automáticas", "Manuais", "Automáticas", "Manuais"};
        int[] anos = {2010, 2019, 2011, 2019};
        String msg;

        String[] mensagens = new String[marcas.length];

        for (int i = 0; i < marcas.length; i++) {
            msg = "Veículo:\nMarca: " + marcas[i] + "\nCor:\n" + cores[i] +
                    "Cilindrada: " + cilindradas[i] + "\nMudanças:\n" + mudancas[i] +
                    "Ano: " + anos[i];

            if (cilindradas[i] >= 2.0) {
                msg += "\nMotor potente";
            } else {
                msg += "\nMotor moderado";
            }

            mensagens[i] = msg;
        }

        return mensagens;
    }

    public String[] detalhesVeiculos(String[] marcas, String[] cores, double[] cilindradas,
                                     String[] mudancas, int[] anos) {
        int n = marcas.length;
        String[] mensagens = new String[n];

        for (int i = 0; i < n; i++) {
            String msg = "Veículo:\nMarca: " + marcas[i] + "\nCor: " + cores[i] +
                    "\nCilindrada: " + cilindradas[i] + "\nMudanças: " + mudancas[i] +
                    "\nAno: " + anos[i];

            if (marcas[i].equalsIgnoreCase("Audi") || marcas[i].equalsIgnoreCase("BMW")) {
                msg += "\nCarro alemão";
            } else {
                msg += "\nOutro fabricante";
            }

            if (cilindradas[i] >= 2.0) {
                msg += "\nMotor potente";
            } else {
                msg += "\nMotor moderado";
            }

            if (mudancas[i].equalsIgnoreCase("Automáticas")) {
                msg += "\nCaixa automática";
            } else {
                msg += "\nCaixa manual";
            }

            mensagens[i] = msg;
        }

        return mensagens;
    }

    public String[] filtrosVeiculos(String[] marcas, String[] cores, double[] cilindradas,
                                    String[] mudancas, int[] anos) {
        int n = marcas.length;
        String[] mensagens = new String[n];

        for (int i = 0; i < n; i++) {
            String msg = "Veículo:\nMarca: " + marcas[i] + "\nCor:\n" + cores[i] +
                    "Cilindrada: " + cilindradas[i] + "\nMudanças:\n" + mudancas[i] +
                    "Ano: " + anos[i];

            if (cores[i].equalsIgnoreCase("Cinza")) {
                msg += "\nFiltrado: Cor cinza";
            }

            if (cilindradas[i] > 2.0) {
                msg += "\nFiltro: Cilindrada acima de 2.0";
            }

            if (anos[i] >= 2015) {
                msg += "\nFiltro: Carro recente";
            }

            mensagens[i] = msg;
        }

        return mensagens;
    }

    public static void main(String[] args) {
        StockVeiculos stock = new StockVeiculos();

        System.out.println("=== 1. Registo de Veículos ===");
        String[] registo = stock.registoVeiculos();
        for (String msg : registo) {
            System.out.println(msg + "\n");
        }

        String[] marcas = {"Mercedes", "Opel", "Ford", "Yamaha"};
        String[] cores = {"Cinza", "Vermelho", "Cinza", "Preto"};
        double[] cilindradas = {2.0, 1.6, 2.0, 0.7};
        String[] mudancas = {"Automáticas", "Manuais", "Automáticas", "Manuais"};
        int[] anos = {2010, 2019, 2011, 2019};

        System.out.println("=== 2. Detalhes de Veículos ===");
        String[] detalhes = stock.detalhesVeiculos(marcas, cores, cilindradas, mudancas, anos);
        for (String msg : detalhes) {
            System.out.println(msg + "\n");
        }

        System.out.println("=== 3. Filtros de Veículos ===");
        String[] filtros = stock.filtrosVeiculos(marcas, cores, cilindradas, mudancas, anos);
        for (String msg : filtros) {
            System.out.println(msg + "\n");
        }
    }
}
