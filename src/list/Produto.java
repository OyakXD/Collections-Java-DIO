package src.list;

public class Produto {

    public String descricao;
    public Integer quantidade;
    public Double preco;

    public Produto(String descricao, Integer quantidade, Double preco) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public String toString() {
        return "Produto{" + "descricao='" + descricao + '\'' + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }

}
