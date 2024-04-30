package src.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String descricao, int quantidade, double preco) {
        this.produtos.add(new Produto(descricao, quantidade, preco));
    }

    public void removerProduto(String descricao) {
        List<Produto> produtosARemover = new ArrayList<>();
        for (Produto produto : this.produtos) {
            if (produto.getDescricao().equalsIgnoreCase(descricao)) {
                produtosARemover.add(produto);
            }
        }
        produtos.removeAll(produtosARemover);
    }

    public double obterValorTotal() {
        double valorTotal = 0;
        for (Produto produto : this.produtos) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(produtos);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarProduto("Arroz", 2, 10.0);
        carrinhoDeCompras.adicionarProduto("Feijão", 3, 8.0);
        carrinhoDeCompras.adicionarProduto("Macarrão", 1, 5.0);
        carrinhoDeCompras.adicionarProduto("Carne", 2, 25.0);
        carrinhoDeCompras.adicionarProduto("Frango", 3, 15.0);

        carrinhoDeCompras.obterValorTotal();
    }

}
