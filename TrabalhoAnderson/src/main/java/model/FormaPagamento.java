package model;

public class FormaPagamento {
    
    private String tipoPagamento;
    private double vlrPago;
    private int parcelas;

    public FormaPagamento() {
    }

    public FormaPagamento(String tipoPagamento, double vlrPago, int parcelas) {
        this.tipoPagamento = tipoPagamento;
        this.vlrPago = vlrPago;
        this.parcelas = parcelas;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getVlrPago() {
        return vlrPago;
    }

    public void setVlrPago(double vlrPago) {
        this.vlrPago = vlrPago;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" 
                + "\n Metódo de Pagamento=" + tipoPagamento 
                + "\nValor Pago=" + vlrPago 
                + "\nQuantidade de Parcelas=" + parcelas + '}';
    }
    
    
    
}
