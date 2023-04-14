package model;


public class Livro {
    
    private String titulo;
    private String editora;
    private String[ ] autores; //O Livro pode conter mais de um autor 
    private String[] generos;//Podemos atribuir mais de um gênero para cada livro
    private int nrPaginas;
    private int qtdEstoque;
    private double vlrVenda;

    public Livro() {
    }

    public Livro(String titulo, String editora, String[] autores, String[] generos, int nrPaginas, int qtdEstoque, double vlrVenda) {
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.generos = generos;
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

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
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

    @Override
    public String toString() {
        return "Livro{" + "\nTitulo=" + titulo 
                + "\nEditora=" + editora 
                + "\nAutores=" + autores 
                + "\nGeneros=" + generos 
                + "\nNumero de Paginas=" + nrPaginas 
                + "\n Quantidade em Estoque=" + qtdEstoque 
                + "\n Valor de Venda=" + vlrVenda + '}';
    }
    
    
    
    
}
