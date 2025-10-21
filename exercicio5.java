abstract class EstadoVeiculo {
    public void mover() {
        System.out.println("Veículo a andar");
    }


    public void parar() {
        System.out.println("Veículo parado");
    }
}


class Veiculo extends EstadoVeiculo {
    private String marca;
    private String modelo;
    private int ano;


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public int getAno() {
        return ano;
    }


    public void modoAcelerar() {
        System.out.println("O veículo está a acelerar.");
    }
}


class CarroNovo extends Veiculo {
    private int numeroDePortas;
    private boolean descapotavel;


    public CarroNovo(String marca, String modelo, int ano, int numeroDePortas, boolean descapotavel) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.descapotavel = descapotavel;
    }


    public int getNumeroDePortas() {
        return numeroDePortas;
    }


    public boolean isDescapotavel() {
        return descapotavel;
    }


    public void modoAcelerar() {
        System.out.println("O carro acelera rapidamente com o turbo!");
    }
}


class Mota extends Veiculo {
    public Mota(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }


    public void modoAcelerar() {
        System.out.println("A mota acelera rapidamente com o punho!");
    }
}


public class exercicio5 {
    public static void main(String[] args) {
        CarroNovo meuCarro = new CarroNovo("Toyota", "Corolla", 2022, 4, false);
        Mota minhaMota = new Mota("Yamaha", "MT-07", 2021);


        System.out.println("=== CARRO ===");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Portas: " + meuCarro.getNumeroDePortas());
        System.out.println("Descapotável: " + (meuCarro.isDescapotavel() ? "Sim" : "Não"));
        meuCarro.parar();
        meuCarro.modoAcelerar();
        meuCarro.mover();


        System.out.println("\n=== MOTA ===");
        System.out.println("Marca: " + minhaMota.getMarca());
        System.out.println("Modelo: " + minhaMota.getModelo());
        System.out.println("Ano: " + minhaMota.getAno());
        minhaMota.parar();
        minhaMota.modoAcelerar();
        minhaMota.mover();
    }
}
