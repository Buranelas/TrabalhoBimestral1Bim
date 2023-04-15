package model;


public class Livro {
    
    private String titulo;
    private String editora;
    private String autor; 
    private String genero;
    private int nrPaginas;
    private int qtdEstoque;
    private double vlrVenda;

    public Livro() {
    }

    public Livro(String titulo, String editora, String autor, String genero, int nrPaginas, int qtdEstoque, double vlrVenda) {
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

    public String getAutor() {
        return autor;
    }

    public void setAutores(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
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
    
    public void atualizarQuantidadeEstoque(int quantidadeVendida) {
    this.qtdEstoque -= quantidadeVendida;
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
