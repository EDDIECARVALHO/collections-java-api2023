package main.java.set.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {

        //variavel p armazenar valor total estoque

        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {

            //criar laço repetição para pegar só o valor de cada elemento do Map

            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }

        }

        return produtoMaisCaro;
    }

    public  static  void main(String[] args){
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, " Produto A", 10, 5.0);
        estoque.adicionarProduto(1L, " Produto B", 5, 10.0);
        estoque.adicionarProduto(1L, " Produto C", 2, 25.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());



    }
}
