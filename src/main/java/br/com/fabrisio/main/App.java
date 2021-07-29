package br.com.fabrisio.main;

import java.util.Arrays;
import java.math.BigDecimal;

import br.com.fabrisio.main.domain.Cliente;
import br.com.fabrisio.main.domain.Compra;
import br.com.fabrisio.main.domain.Produto;
import br.com.fabrisio.main.domain.ItemCompra;

public class App {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Café", BigDecimal.valueOf(2.53));
    	Produto p2 = new Produto("RXT 4098 TI", BigDecimal.valueOf(4000.00));
    	Produto p3 = new Produto("Monitor Alienware", BigDecimal.valueOf(2000.00));

        Cliente j = new Cliente("João");
        Compra c = new Compra(p1, 3);
        c.addList(p3, 5);
        c.addList(p2, 2);
        
        System.out.println("Id.........: " + j.getId());
        System.out.println("Nome.......: " + j.getNome());
        c.mostrarItens();
        
        c.confirmarPagamento(BigDecimal.valueOf(20000.00));
        
    }
}
