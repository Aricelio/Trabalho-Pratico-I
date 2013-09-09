/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalhopratico1;

import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
        this.codigo = 0;
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
        if(codigo > 0)
            this.codigo = codigo;
    }

    public void setDataCadastrada(Date dataCadastrada) {
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1900,1,1);
        
        if(calendario.getTime().after(dataCadastrada))
             this.dataCadastrada = dataCadastrada;
    }

    public void setDataLiquidacao(Date dataLiquidacao) {
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1900,1,1);
        
        if(calendario.getTime().after(dataLiquidacao))
             this.dataLiquidacao = dataLiquidacao;
    }

    public void setDataBaixa(Date dataBaixa) {
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1900,1,1);
        
        if(calendario.getTime().after(dataBaixa))
             this.dataBaixa = dataBaixa;
    }

    public void setValorIntegral(double valorIntegral) {
        if(valorIntegral > 0)
             this.valorIntegral = valorIntegral;
    }

    public void setMulta(double multa) {
        if(multa >0)
             this.multa = multa;
    }

    public void setDesconto(double desconto) {
        if(desconto > 0)
             this.desconto = desconto;
    }

    public void setHistorico(String historico) {        
        Pattern Historico = Pattern.compile("[\\w\\s]{3,}");
        Matcher verifica = Historico.matcher(historico);
        
        if(verifica.matches())
             this.historico = historico;
    }

    public void setFormaPagamento(String formaPagamento) {
        Pattern FormaPagamento = Pattern.compile("[\\w\\s]{6,}");
        Matcher verifica = FormaPagamento.matcher(formaPagamento);
        
        if(verifica.matches())
            this.formaPagamento = formaPagamento;
    }

    public void setTipo(String tipo) {
        Pattern Tipo = Pattern.compile("[\\w]{6,7}");
        Matcher verifica = Tipo.matcher(tipo);
        
        if(verifica.matches())
            this.tipo = tipo;
    }

    public void setFuncionarioCadastrou(Funcionario funcionarioCadastrou) {
        this.funcionarioCadastrou = funcionarioCadastrou;
    }

    public void setFuncionarioBaixa(Funcionario funcionarioBaixa) {
        this.funcionarioBaixa = funcionarioBaixa;
    }
    
    /*------------------ HashCode --------------------------------------------*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigo;
        hash = 83 * hash + Objects.hashCode(this.dataCadastrada);
        hash = 83 * hash + Objects.hashCode(this.dataLiquidacao);
        hash = 83 * hash + Objects.hashCode(this.dataBaixa);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.valorIntegral) ^ (Double.doubleToLongBits(this.valorIntegral) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.multa) ^ (Double.doubleToLongBits(this.multa) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.desconto) ^ (Double.doubleToLongBits(this.desconto) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.historico);
        hash = 83 * hash + Objects.hashCode(this.formaPagamento);
        hash = 83 * hash + Objects.hashCode(this.tipo);
        hash = 83 * hash + Objects.hashCode(this.funcionarioCadastrou);
        hash = 83 * hash + Objects.hashCode(this.funcionarioBaixa);
        return hash;
    }
    /*------------------------ Equals ----------------------------------------*/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lancamento other = (Lancamento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.dataCadastrada, other.dataCadastrada)) {
            return false;
        }
        if (!Objects.equals(this.dataLiquidacao, other.dataLiquidacao)) {
            return false;
        }
        if (!Objects.equals(this.dataBaixa, other.dataBaixa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorIntegral) != Double.doubleToLongBits(other.valorIntegral)) {
            return false;
        }
        if (Double.doubleToLongBits(this.multa) != Double.doubleToLongBits(other.multa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.desconto) != Double.doubleToLongBits(other.desconto)) {
            return false;
        }
        if (!Objects.equals(this.historico, other.historico)) {
            return false;
        }
        if (!Objects.equals(this.formaPagamento, other.formaPagamento)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.funcionarioCadastrou, other.funcionarioCadastrou)) {
            return false;
        }
        if (!Objects.equals(this.funcionarioBaixa, other.funcionarioBaixa)) {
            return false;
        }
        return true;
    }

    /*-------------------------- toString ------------------------------------*/
    @Override
    public String toString() {
        return "Lancamento{" + "Codigo=" + codigo + ", Data que foi cadastrada=" + dataCadastrada + ", Data de liquidacao=" + dataLiquidacao + ", Data de Baixa=" + dataBaixa + ", Valor Integral=" + valorIntegral + ", Multa=" + multa + ", Desconto=" + desconto + ", Historico=" + historico + ", Forma de Pagamento=" + formaPagamento + ", Tipo=" + tipo + ", Funcionario que cadastrou=" + funcionarioCadastrou + ", Funcionario que deu baixa=" + funcionarioBaixa + '}';
    }
    
    
}
