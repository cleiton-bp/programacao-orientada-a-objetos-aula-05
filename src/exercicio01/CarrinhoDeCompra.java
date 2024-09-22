package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Produto> produtos;
    private double valorTotal;

    public CarrinhoDeCompra() {
        produtos = new ArrayList<>();
        valorTotal = 0.0;
    }

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
    }

    public double getTotal() {
        valorTotal = 0.0; // Reinicia o valor total
        for (Produto produto : produtos) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() +
                    ", Valor: R$" + produto.getValor() +
                    ", Descrição: " + produto.getDescricao());
        }
    }
}
