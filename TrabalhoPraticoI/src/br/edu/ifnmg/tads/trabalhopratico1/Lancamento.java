/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalhopratico1;

import java.util.Date;

/**
 *
 * @author alisson 02
 */
public class Lancamento 
{
    private int codigo;
    private Date dataCadastrada;
    private Date dataLiquidacao;
    private Date dataBaixa;
    private double valorIntegral;
    private double multa;
    private double desconto;
    private String historico;
    private String formaPagamento;
    private String tipo;
    private Funcionario funcionarioCadastrou;
    private Funcionario funcionarioBaixa;
    
    /*------------- Construtor -----------------------------------------------*/
    public Lancamento(){
        this.valorIntegral = 0;
        this.multa = 0;
        this.desconto = 0;
    }

    /*------------ Métodos Getters -------------------------------------------*/
    public int getCodigo() {
        return codigo;
    }

    public Date getDataCadastrada() {
        return dataCadastrada;
    }

    public Date getDataLiquidacao() {
        return dataLiquidacao;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public double getValorIntegral() {
        return valorIntegral;
    }

    public double getMulta() {
        return multa;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getHistorico() {
        return historico;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public Funcionario getFuncionarioCadastrou() {
        return funcionarioCadastrou;
    }

    public Funcionario getFuncionarioBaixa() {
        return funcionarioBaixa;
    }
    public double getValorTotal(){
        return getValorIntegral() + getMulta() - getDesconto();
    }

    /*------------- Métodos Setters ------------------------------------------*/
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDataCadastrada(Date dataCadastrada) {
        this.dataCadastrada = dataCadastrada;
    }

    public void setDataLiquidacao(Date dataLiquidacao) {
        this.dataLiquidacao = dataLiquidacao;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    public void setValorIntegral(double valorIntegral) {
        this.valorIntegral = valorIntegral;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFuncionarioCadastrou(Funcionario funcionarioCadastrou) {
        this.funcionarioCadastrou = funcionarioCadastrou;
    }

    public void setFuncionarioBaixa(Funcionario funcionarioBaixa) {
        this.funcionarioBaixa = funcionarioBaixa;
    }
    
    
}
