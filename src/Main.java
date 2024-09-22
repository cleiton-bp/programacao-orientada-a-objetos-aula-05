import exercicio01.*;
import exercicio02.*;
import exercicio03.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------exercicio 1-------------");

        // Criação de alguns produtos
        Produto produto1 = new Produto("Laranja", 3.00, "melhor fruta 1");
        Produto produto2 = new Produto("pessego", 2.00, "melhor fruta 2");
        Produto produto3 = new Produto("abacaxi", 8.00, "melhor fruta 3");

        // Criação do carrinho de compras
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        // Adicionando produtos ao carrinho
        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);
        carrinho.adicionarAoCarrinho(produto3);

        // Exibindo os produtos no carrinho
        System.out.println("Produtos no carrinho:");
        carrinho.exibirProdutos();

        // Exibindo o valor total dos produtos no carrinho
        System.out.println("\nValor total: R$" + carrinho.getTotal());


        System.out.println("-------------exercicio 2-------------");

        Veiculo carro1 = new Veiculo("Volkswagen", "Up", 2017);
        Veiculo carro2 = new Veiculo("Honda", "Civic", 2018);

        // Executando métodos em carro1
        System.out.println("Veículo: " + carro1.getMarca() + " " + carro1.getModelo() + " (" + carro1.getAno() + ")");
        carro1.ligar();
        carro1.desligar();

        System.out.println();

        // Executando métodos em carro2
        System.out.println("Veículo: " + carro2.getMarca() + " " + carro2.getModelo() + " (" + carro2.getAno() + ")");
        carro2.ligar();
        carro2.desligar();


        System.out.println("-------------exercicio 3-------------");
        // Criando objetos das classes de contas
        ContaCorrente contaCorrente = new ContaCorrente(123, "Alice", 0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(456, "Bob", 0);
        ContaSalario contaSalario = new ContaSalario(789, "Charlie", 0);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);
        contaSalario.depositar(2000);

        System.out.println("Saldo da Conta Corrente: R$ " + contaCorrente.consultarSaldo());
        System.out.println("Saldo da Conta Poupança: R$ " + contaPoupanca.consultarSaldo());
        System.out.println("Saldo da Conta Salário: R$ " + contaSalario.consultarSaldo());

        contaCorrente.sacar(200);
        contaPoupanca.sacar(100);
        contaSalario.sacar(500);

        System.out.println("Saldo da Conta Corrente após saque: R$ " + contaCorrente.consultarSaldo());
        System.out.println("Saldo da Conta Poupança após saque: R$ " + contaPoupanca.consultarSaldo());
        System.out.println("Saldo da Conta Salário após saque: R$ " + contaSalario.consultarSaldo());

        contaCorrente.transferir(300, contaPoupanca);

        System.out.println("Saldo da Conta Corrente após transferência: R$ " + contaCorrente.consultarSaldo());
        System.out.println("Saldo da Conta Poupança após receber transferência: R$ " + contaPoupanca.consultarSaldo());
    }
}