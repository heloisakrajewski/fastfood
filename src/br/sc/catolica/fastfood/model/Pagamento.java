package br.sc.catolica.fastfood.model;

public class Pagamento {
    
    private long id;
    private TipoPagamento tipoPagamento;
    private double valorPagamento;
    private int numeroCartao;
    private boolean pagamentoValido;

    public Pagamento(){
        super();
    }
    
    public Pagamento(long id, TipoPagamento tipoPagamento, double valorPagamento, int numeroCartao, boolean pagamentoValido){
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorPagamento = valorPagamento;
        this.numeroCartao = numeroCartao;
        this.pagamentoValido = pagamentoValido;      
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the tipoPagamento
     */
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * @return the valorPagamento
     */
    public double getValorPagamento() {
        return valorPagamento;
    }

    /**
     * @param valorPagamento the valorPagamento to set
     */
    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    /**
     * @return the numeroCartao
     */
    public int getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * @return the pagamentoValido
     */
    public boolean isPagamentoValido() {
        return pagamentoValido;
    }

    /**
     * @param pagamentoValido the pagamentoValido to set
     */
    public void setPagamentoValido(boolean pagamentoValido) {
        this.pagamentoValido = pagamentoValido;
    }
    
}
