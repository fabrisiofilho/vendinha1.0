package br.com.fabrisio.main.domain;

/**
 * Cliente
 */

import java.util.SplittableRandom;

public class Cliente {

    private String nome;
	private long id;

    public Cliente(String nome){
        this.nome = nome;
        SplittableRandom rand = new SplittableRandom();
        Long int_random = rand.nextLong(1 , Long.MAX_VALUE);
	this.id = int_random;
    }
 
    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }
}