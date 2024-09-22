package exercicio02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado; // Atributo para saber se o veículo está ligado ou desligado

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // Inicialmente, o veículo está desligado
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " está ligado.");
        } else {
            System.out.println(modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(modelo + " está desligado.");
        } else {
            System.out.println(modelo + " já está desligado.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
