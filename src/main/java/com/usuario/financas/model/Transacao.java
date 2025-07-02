package com.usuario.financas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Transacao{
    private String descricao;
    private BigDecimal valor;
    private LocalDate data = LocalDate.now();
    protected TipoTransacao tipoTransacao;
    private Categoria categoria;

    public Transacao(){}

    public Transacao(String descricao, BigDecimal valor, LocalDate data, TipoTransacao tipoTransacao, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.tipoTransacao = tipoTransacao;
        this.categoria = categoria;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}