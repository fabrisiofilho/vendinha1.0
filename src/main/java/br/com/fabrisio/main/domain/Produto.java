package br.com.fabrisio.main.domain;


import java.math.BigDecimal;
/**
 * Produto
 */
public class Produto {

    private String nome;
    private BigDecimal valor;

    public Produto(String nome, BigDecimal valor) {
	this.nome = nome;
	this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }
}