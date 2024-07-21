package main.java.list.OperacoesBasicas.Pesquisa;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros<autor, titulo> {
    //atributo

    private List<Livro> livroList;

    public CatalogoLivros()
        {this.livroList = new ArrayList<>(); }

       public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisaPorAutor(String autor){
      List<Livro> livrosPorAutor = new ArrayList<>();
      if (!livroList.isEmpty()) {
          for (Livro l : livroList){
              if (l.getAutor().equalsIgnoreCase(autor)){
                  livrosPorAutor.add(l);
              }
          }
        }
      return livrosPorAutor;
}

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (! livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao()<= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo =l;
                    break;
                }
            }
        }
        return  livroPorTitulo;
    }
     public  static  void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro( "Livro 1", "Autor: Autor 1",2020);
        catalogoLivros.adicionarLivro( "Livro 1", "Autor: Autor 2",2021);
        catalogoLivros.adicionarLivro( "Livro 2", "Autor: Autor 2",2022);
        catalogoLivros.adicionarLivro( "Livro 3", "Autor: Autor 3",2023);
        catalogoLivros.adicionarLivro( "Livro 4", "Autor: Autor 4",1994);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
     }
}