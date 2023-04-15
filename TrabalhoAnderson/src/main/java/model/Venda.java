package model;

import java.util.ArrayList;


public class Venda {
    
    private ArrayList<Livro> livro;
    private ArrayList<FormaPagamento> formaPagamento;
    private double valorTotal;

    public Venda() {
    }

    public Venda(ArrayList<Livro> livro, ArrayList<FormaPagamento> formaPagamento, double valorTotal) {
        this.livro = livro;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livro = livro;
    }

    public ArrayList<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ArrayList<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void vendaAprovada(){
        System.out.println("Venda Realizada");
    }

    @Override
    public String toString() {
        return "Venda{" + "\nLivro=" + livro + 
                "\nForma De Pagamento=" + formaPagamento + 
                "\nValor Total=" + valorTotal + '}';
    }
    
    

    
    
}
