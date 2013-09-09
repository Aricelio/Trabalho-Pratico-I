/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalhopratico1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author alisson 02
 */
public class Sessao {
    private int codigo;
    private Funcionario operador;
    private Date dataAbertura;
    private Date dataFechamento;
    private double saldoAbertura;
    private double saldoFechamento;
    private Caixa caixa;
    private List<Lancamento> lancamentos;

    /*----------------- Construtor -------------------------------------------*/
    public Sessao() {
        this.codigo = 0;
        this.dataAbertura = new Date();
        this.saldoFechamento = 0;
        this.lancamentos = new ArrayList<Lancamento>();
    }
    
    /*------------------ Metodos Getters e Setters ---------------------------*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0)
            this.codigo = codigo;
    }

    public Funcionario getOperador() {
        return operador;
    }

    public void setOperador(Funcionario operador) {
        this.operador = operador;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }
    
    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1900,1,1);
        
        if((calendario.getTime().after(dataFechamento)) && (dataAbertura.after(dataFechamento)))
             this.dataFechamento = dataFechamento;
    }

    public double getSaldoAbertura() {
        return saldoAbertura;
    }

    public void setSaldoAbertura(Caixa caixa) {
        
        this.saldoAbertura = caixa.getSaldo();
    }

    public double getSaldoFechamento() {
        return saldoFechamento;
    }

    private void setSaldoFechamento(double saldoFechamento) {
        if(saldoFechamento >= 0){
              this.saldoFechamento = saldoFechamento;
              caixa.setSaldo(saldoFechamento);
        }
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }
    /*--------------- Adiciona um lancamento ---------------------------------*/  
    public void addLancamento(Lancamento lancamento){
        if(!lancamentos.contains(lancamento))
        {
            lancamentos.add(lancamento);
            String credito = "Credito";
            String debito = "Debito";            
            double valor = 0;
            
            if(debito.equals(lancamento.getTipo()))
            {
                valor = getSaldoFechamento() - lancamento.getValorTotal();  
            }
            else if(credito.equals(lancamento.getTipo()))
            {
                valor = getSaldoFechamento() + lancamento.getValorTotal();  
            }    
            
            setSaldoFechamento(valor);
        }
    }
    /*--------------- Remove um lancamento -----------------------------------*/  
    public void removeLancamento(Lancamento lancamento)
    {
        if(lancamentos.contains(lancamento))
        {
            lancamentos.remove(lancamento);            
            double valor = getSaldoFechamento() - lancamento.getValorTotal();
            setSaldoFechamento(valor);
        }
    }
    /*--------------------- hashCode -----------------------------------------*/
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.codigo;
        hash = 41 * hash + Objects.hashCode(this.operador);
        hash = 41 * hash + Objects.hashCode(this.dataAbertura);
        hash = 41 * hash + Objects.hashCode(this.dataFechamento);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.saldoAbertura) ^ (Double.doubleToLongBits(this.saldoAbertura) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.saldoFechamento) ^ (Double.doubleToLongBits(this.saldoFechamento) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.caixa);
        hash = 41 * hash + Objects.hashCode(this.lancamentos);
        return hash;
    }
    /*-------------------- Equals --------------------------------------------*/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sessao other = (Sessao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.operador, other.operador)) {
            return false;
        }
        if (!Objects.equals(this.dataAbertura, other.dataAbertura)) {
            return false;
        }
        if (!Objects.equals(this.dataFechamento, other.dataFechamento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoAbertura) != Double.doubleToLongBits(other.saldoAbertura)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoFechamento) != Double.doubleToLongBits(other.saldoFechamento)) {
            return false;
        }
        if (!Objects.equals(this.caixa, other.caixa)) {
            return false;
        }
        if (!Objects.equals(this.lancamentos, other.lancamentos)) {
            return false;
        }
        return true;
    }

    /*------------------------ Método toString -------------------------------*/
    @Override
    public String toString() {
        return "Sessao{" + "Codigo=" + codigo + ", Operador=" + operador.getNome() + ", Data de Abertura=" + dataAbertura + ", Data de Fechamento=" + dataFechamento + ", Saldo de Abertura= R$ " + saldoAbertura + ", Saldo de Fechamento= R$ " + saldoFechamento + ", Caixa=" + caixa.getNome() + ", Lancamentos=" + getLancamentos() + '}';
    }
    
    
    
}
