package br.com.fabrisio.main.domain;

/**
 * Compra
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Compra {

    private List<ItemCompra> itens;
    private BigDecimal troco;
    BigDecimal TotalBig = BigDecimal.valueOf(0);

    public Compra(Produto p1, Integer qtd) {
	this.itens = new ArrayList<ItemCompra>();
	this.addList(p1, qtd);
    }

    public void addList(Produto p1, Integer qtd){
	this.itens.add(new ItemCompra(p1, qtd));
    }
    
    public void confirmarPagamento(BigDecimal saldo){
        System.out.println("Valor do cliente:"+ saldo);
        if(saldo.compareTo(TotalBig) == 1){
            saldo = saldo.subtract(TotalBig);
            System.out.println( "Status do pagamento : " + getStatus(saldo));
            System.out.println("Troco .: " + saldo);
        }else if(saldo.compareTo(TotalBig) == 0){
            saldo = saldo.subtract(TotalBig);
            System.out.println("Status do pagamento : " + getStatus(saldo));
            System.out.println("Troco .: " + saldo);
        }else if(saldo.compareTo(TotalBig) == -1){
            saldo = saldo.subtract(TotalBig);
            System.out.println("Status do pagamento : " + getStatus(saldo));
            System.out.println("Falta .: " + saldo.abs());         
        }
        
    }
    
    public void mostrarItens(){;
        for (ItemCompra iten : itens) {
            System.out.println(": ("+iten.getQtd() + ").......:"+ iten.getTotal());
            TotalBig = TotalBig.add(iten.getTotal());
        }
        System.out.println("Total.......: " + TotalBig);
        System.out.println("Status do pagamento : " + getStatusAguardando());
    }
    
    public EnumStatus getStatusAguardando(){
        return EnumStatus.Aguardando;
    }
    
    public EnumStatus getStatus (BigDecimal troco){
        
        BigDecimal zero = BigDecimal.valueOf(0); 
        
        if(troco.compareTo(zero) == 1){
            return EnumStatus.Pago;
        }
        if(troco.compareTo(zero) == -1){
            return EnumStatus.Cancelado;
        }
        return EnumStatus.Pago;
    }

}