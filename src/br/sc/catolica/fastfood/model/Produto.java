package br.sc.catolica.fastfood.model;

public class Produto {
    
    private long id;
    private String descricao;
    private double valorUnitario;

    
    public Produto(long id, String descricao, double valorUnitario){
        this.id = id;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }
    
    public Produto(){
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
    
}
