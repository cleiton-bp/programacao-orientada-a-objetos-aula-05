# Projeto Java - Exercícios de Orientação a Objetos

Este projeto foi desenvolvido com o objetivo de demonstrar a implementação de conceitos básicos de Orientação a Objetos (OO) em Java, como a criação de classes, objetos, métodos e a interação entre eles. O projeto consiste em três exercícios principais, cada um representando uma situação prática de programação orientada a objetos.

## Estrutura do Projeto

O projeto está organizado em pacotes separados para cada exercício:

- `exercicio01`: Implementação de um sistema de carrinho de compras e produtos.
- `exercicio02`: Implementação de uma classe de veículos com funcionalidades como ligar e desligar.
- `exercicio03`: Implementação de diferentes tipos de contas bancárias utilizando herança e polimorfismo.

## Exercício 1 - Carrinho de Compras

Neste exercício, foi criada uma classe `Produto` que contém os seguintes atributos:

- `nome`: O nome do produto.
- `valor`: O valor do produto.
- `descricao`: Uma breve descrição do produto.

Além disso, foi criada a classe `CarrinhoDeCompras`, que permite:

- Adicionar produtos ao carrinho através do método `adicionarAoCarrinho()`.
- Calcular o valor total dos produtos no carrinho com o método `getTotal()`.
- Exibir os produtos adicionados ao carrinho usando o método `exibirProdutos()`.

## Exercício 2 - Veículo

Este exercício envolve a criação de uma classe `Veiculo`, que tem os atributos:

- `marca`: A marca do veículo.
- `modelo`: O modelo do veículo.
- `ano`: O ano de fabricação.

Os métodos implementados incluem:

- `ligar()`: Para ligar o veículo.
- `desligar()`: Para desligar o veículo.

A classe `Main` executa esses métodos em instâncias da classe `Veiculo`.

## Exercício 3 - Contas Bancárias

Neste exercício, foi criada uma classe abstrata `Conta`, a partir da qual foram derivadas três subclasses: `ContaCorrente`, `ContaPoupanca` e `ContaSalario`. Essas subclasses implementam os seguintes métodos herdados da classe `Conta`:

- `depositar()`: Para realizar depósitos na conta.
- `sacar()`: Para realizar saques.
- `transferir()`: Para realizar transferências entre contas.
- `consultarSaldo()`: Para consultar o saldo atual da conta.

Cada subclasse possui comportamentos específicos que se ajustam às regras de cada tipo de conta, e a classe `Main` executa operações para demonstrar essas funcionalidades.
