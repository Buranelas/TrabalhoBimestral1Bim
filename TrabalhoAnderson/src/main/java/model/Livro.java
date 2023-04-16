package model;

import java.util.ArrayList;


public class Livro {
    
    private String titulo;
    private String editora;
    private ArrayList<String> autor; //Um livro pode ter mais de um autor
    private ArrayList<String> genero;//Um livro pode ter mais de um genero
    private int nrPaginas;
    private int qtdEstoque;
    private double vlrVenda;

    public Livro() {
    }

    public Livro(String titulo, String editora, ArrayList<String> autor, ArrayList<String> genero, int nrPaginas, int qtdEstoque, double vlrVenda) {
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.genero = genero;
        this.nrPaginas = nrPaginas;
        this.qtdEstoque = qtdEstoque;
        this.vlrVenda = vlrVenda;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public ArrayList<String> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<String> autor) {
        this.autor = autor;
    }

    public ArrayList<String> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<String> genero) {
        this.genero = genero;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }
    
    public void addEstoque(int addEstoque){
        this.qtdEstoque += addEstoque;
    }
    
    public void remEstoque(int remEstoque){
        if(remEstoque > qtdEstoque){
            System.out.println("Estoque Insuficiente!");
        }else{
            this.qtdEstoque -= remEstoque;
        }
    }

    @Override
    public String toString() {
        return "Livro{" + "\nTitulo=" + titulo 
                + "\nEditora=" + editora 
                + "\nAutores=" + autor 
                + "\nGeneros=" + genero 
                + "\nNumero de Paginas=" + nrPaginas 
                + "\n Quantidade em Estoque=" + qtdEstoque 
                + "\n Valor de Venda=" + vlrVenda + '}';
    }
    
    
    
    
}
