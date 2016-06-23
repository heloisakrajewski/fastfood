package br.sc.catolica.fastfood.model;

import java.util.Date;
import java.util.List;

public class Pedido {
    
    private long id;
    private Date dataHoraGeracao;
    private Date dataHoraPrevisao;
    private boolean embalagemEntrega;
    private Pagamento pagamento;
    private Consumidor consumidor;
    private List<Item> listaItens;
    
    public Pedido(long id, Date dataHoraGeracao, Date dataHoraPrevisao, boolean embalagemEntrega, Pagamento pagamento, Consumidor consumidor, List<Item> listaItens){
        
        this.id = id;
        this.dataHoraGeracao = dataHoraGeracao;
        this.dataHoraPrevisao = dataHoraPrevisao;
        this.embalagemEntrega = embalagemEntrega;
        this.pagamento = pagamento;
        this.consumidor = consumidor;
        this.listaItens = listaItens;
    }
    
    public Pedido(){
        super();
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
     * @return the dataHoraGeracao
     */
    public Date getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    /**
     * @param dataHoraGeracao the dataHoraGeracao to set
     */
    public void setDataHoraGeracao(Date dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }

    /**
     * @return the dataHoraPrevisao
     */
    public Date getDataHoraPrevisao() {
        return dataHoraPrevisao;
    }

    /**
     * @param dataHoraPrevisao the dataHoraPrevisao to set
     */
    public void setDataHoraPrevisao(Date dataHoraPrevisao) {
        this.dataHoraPrevisao = dataHoraPrevisao;
    }

    /**
     * @return the embalagemEntrega
     */
    public boolean isEmbalagemEntrega() {
        return embalagemEntrega;
    }

    /**
     * @param embalagemEntrega the embalagemEntrega to set
     */
    public void setEmbalagemEntrega(boolean embalagemEntrega) {
        this.embalagemEntrega = embalagemEntrega;
    }

    /**
     * @return the pagamento
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * @return the consumidor
     */
    public Consumidor getConsumidor() {
        return consumidor;
    }

    /**
     * @param consumidor the consumidor to set
     */
    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }
            
    public Double calcularPedido(List<Item> items) {
        int tam = items.size();
        double valor = 0;
        for (int i = 0; i < tam; i++) {
            valor = valor + (items.get(i).getValorUnitario() * items.get(i).getQuantidade());
            System.out.println(i);
        }
        System.out.println(valor);
        return valor;
    }
    
}
