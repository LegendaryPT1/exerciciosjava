import java.util.Scanner;

public class exercicio3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int caixa;
        double cilindradas;
        int identificacao = 0;

        do {
            identificacao = 5;
            System.out.println("O numero de identificação deste carro é o numero: " + identificacao);

            System.out.println("\nEscolha a marca do seu carro:");
            System.out.println("1- BMW ");
            System.out.println("2 - Audi ");
            System.out.println("3 - Outro");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("O seu carro é alemão");
                    System.out.println("Quantas cilindradas tem o carro?");
                    cilindradas = scanner.nextDouble();

                    if(cilindradas >= 2000){
                        System.out.println("motor potente");
                    } else {
                        System.out.println("motor normal");
                    }

                    System.out.println("Qual caixa o seu carro usa?");
                    System.out.println("1- Automatico");
                    System.out.println("2- Manual");
                    caixa = scanner.nextInt();

                    switch (caixa){
                        case 1:
                            System.out.println("O seu carro têm caixa automatica");
                            break;
                        case 2:
                            System.out.println("O seu carro têm caixa manual");
                            break;
                        default:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("O seu carro é alemão");
                    System.out.println("Quantas cilindradas tem o carro?");
                    cilindradas = scanner.nextDouble();

                    if(cilindradas >= 2000){
                        System.out.println("motor potente");
                    } else {
                        System.out.println("motor normal");
                    }

                    System.out.println("Qual caixa o seu carro usa?");
                    System.out.println("1- Automatico");
                    System.out.println("2- Manual");
                    caixa = scanner.nextInt();

                    switch (caixa){
                        case 1:
                            System.out.println("O seu carro têm caixa automatica");
                            break;
                        case 2:
                            System.out.println("O seu carro têm caixa manual");
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.println("O seu carro é de outra fabricante");
                    System.out.println("Quantas cilindradas tem o carro?");
                    cilindradas = scanner.nextDouble();

                    if(cilindradas >= 2000){
                        System.out.println("motor potente");
                    } else {
                        System.out.println("motor normal");
                    }

                    System.out.println("Qual caixa o seu carro usa?");
                    System.out.println("1- Automatico");
                    System.out.println("2- Manual");
                    caixa = scanner.nextInt();

                    switch (caixa){
                        case 1:
                            System.out.println("O teu carro usa caixa automatica");
                            break;
                        case 2:
                            System.out.println("O teu carro usa caixa manual");
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    System.out.println("opção inválida");
            }

        } while(true);
    }
}