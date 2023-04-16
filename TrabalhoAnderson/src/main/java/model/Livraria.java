package model;

import java.util.List;


public class Livraria {
 
    private String nome;
    private Endereco endereco;
    private List<Cliente> pessoas;
    private List<Livro> livros;
    private List<Venda> vendas;

    public Livraria() {
    }

    public Livraria(String nome) {
        this.nome = nome;
    }
    
    

    public Livraria(String nome, Endereco endereco, List<Cliente> pessoas, List<Livro> livros, List<Venda> vendas) {
        this.nome = nome;
        this.endereco = endereco;
        this.pessoas = pessoas;
        this.livros = livros;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Cliente> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Cliente> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    public void addCliente(Cliente cliente){
        this.pessoas.add(cliente);
    }
    
    public void addLivro(Livro livro){
        this.livros.add(livro);
    }
        
    
}
