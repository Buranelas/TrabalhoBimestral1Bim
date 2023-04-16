package model;

public class ItemVenda {
 
    private Livro livro;
    private int quantidade;
    private double vlUnitario;
    private double vlDesconto;
    private double vlTotal;

    public ItemVenda() {
    }

    public ItemVenda(Livro livro, int quantidade, double vlUnitario, double vlDesconto, double vlTotal) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.vlUnitario = vlUnitario;
        this.vlDesconto = vlDesconto;
        this.vlTotal = vlTotal;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(Livro livro) {
        this.vlTotal = (livro.getVlrVenda() - this.vlDesconto) * this.quantidade;
    }
    
    

    @Override
    public String toString() {
        return "ItemVenda{" + "Livro=" + livro + 
                "\nQuantidade=" + quantidade + 
                "\nValor Unitario=" + vlUnitario + 
                "\nValor Desconto=" + vlDesconto + 
                "\nValor Total=" + vlTotal + '}';
    }
    
    
    
}
