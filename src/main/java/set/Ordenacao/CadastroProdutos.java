package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new  HashSet<>();
    }

    public  void  adicionarproduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public  Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>();

        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }


    public  static void main(String[] args){

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarproduto(1l, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarproduto(2l, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarproduto(1l, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarproduto(9l, "Produto 9" ,2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

