package model;


public class Estoque {
    
    private int qtdEstoque;
    private Livro livro;

    public Estoque() {
    }
    
    public Estoque(int qtdEstoque, Livro livro) {
        this.qtdEstoque = qtdEstoque;
        this.livro = livro;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Estoque{" + "Quantidade Estoque =" + qtdEstoque + 
                "\nLivro Selecionado =" + livro + '}';
    }
    
}
