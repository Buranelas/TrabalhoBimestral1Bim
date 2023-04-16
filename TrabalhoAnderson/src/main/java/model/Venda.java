package model;

import java.util.ArrayList;


public class Venda {
    
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;
    private ArrayList<FormaPagamento> formasPagamento;
    private double valorTotal;
    private double troco;

    public Venda() {
    }

    public Venda(Cliente cliente, ArrayList<ItemVenda> itens, ArrayList<FormaPagamento> formasPagamento, double valorTotal, double troco) {
        this.cliente = cliente;
        this.itens = itens;
        this.formasPagamento = formasPagamento;
        this.valorTotal = valorTotal;
        this.troco = troco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public ArrayList<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }
    
    public void calculaTroco(double vlPago, double vlPagar){
        double troco = vlPago - vlPagar;
        this.setTroco(troco);
    }

    public void setFormasPagamento(ArrayList<FormaPagamento> formasPagamento) {
        double vlPagar = this.getValorTotal();
        double vlPago = 0;
        int resumoFinal = formasPagamento.size() -1;
        int resumo = 0;
        
        for(FormaPagamento formaPagamento: formasPagamento){
            vlPago += formaPagamento.getVlrPago();
            
            if(vlPago < vlPagar && resumo >= resumoFinal){
                System.out.println("Não possui mais formas de pagamento disponíveis");
            }
            resumo++;
        }
        
            if(vlPago > vlPagar){
                this.calculaTroco(vlPago, vlPagar);
            }
        this.formasPagamento = formasPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(ArrayList<ItemVenda> itensVenda) {
        for(ItemVenda itemVenda: itensVenda){
            this.valorTotal += itemVenda.getVlTotal();
        }
    }
    
    public void gerarEstoque(ArrayList<ItemVenda> itensVenda){
        for(ItemVenda itemVenda: itensVenda){
            itemVenda.getLivro().remEstoque(itemVenda.getQuantidade());
        }
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    @Override
    public String toString() {
        return "Venda{" + "Cliente=" + cliente + 
                "\nItens=" + itens + 
                "\nForma De Pagamento=" + formasPagamento + 
                "\nValor Total=" + valorTotal + 
                "\nTroco=" + troco + '}';
    }

    
    
    
}
