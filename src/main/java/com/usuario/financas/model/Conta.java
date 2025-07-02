package com.usuario.financas.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class Conta extends Transacao{
    public String carteiraInter;


    List<Transacao> listTransacao = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao){
        listTransacao.add(transacao);
    }

    public  BigDecimal getSaldo(){
        for (Transacao t: listTransacao){
            BigDecimal saldo= BigDecimal.ZERO;
            if (t.getTipoTransacao()== TipoTransacao.RECEITA){
                saldo = saldo.add(t.getValor());

            }else{
                saldo = saldo.subtract(t.getValor());
            }
        }
        return getSaldo();
    }
    public String getTransacoes(){
        for(Transacao list : listTransacao){
            System.out.println(list);
        }
        return getTransacoes();
    }


}
