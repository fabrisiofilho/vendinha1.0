package br.com.fabrisio.main.domain;

import java.math.BigDecimal;

/**
 * ItemCompra
 */
public class ItemCompra {

    private Produto p;
    private Integer qtd;
    private BigDecimal total;

    public ItemCompra(Produto p, Integer qtd){
        
        BigDecimal valor = p.getValor();
        this.qtd = qtd;
        this.total = valor.multiply(BigDecimal.valueOf(qtd));
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Produto getP() {
        return p;
    }
    
    public Integer getQtd() {
        return qtd;
    }
    
 
    
}