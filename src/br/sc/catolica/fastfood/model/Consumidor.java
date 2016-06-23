package br.sc.catolica.fastfood.model;

public class Consumidor {
    
    private long id;
    private String nome;
    private String cpf;

    public Consumidor(long id, String nome, String cpf){
       this.id = id;
       this.nome = nome;
       this.cpf = cpf;
        
    }

    public Consumidor() {
        super();
    }
    
    /**
     * @return the id
     */
    public long getInd() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setInd(long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
