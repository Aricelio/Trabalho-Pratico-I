/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalhopratico1;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alisson 02
 */
public class Caixa 
{
    private int codigo;
    private String nome;
    private double saldo;

    /*------------- Construtor -----------------------------------------------*/   
    public Caixa() 
    {
        this.saldo = 0;
        this.codigo = 0;
    }
    
    /*------------- Métodos Getters ------------------------------------------*/
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    /*------------- Métodos Setters ------------------------------------------*/
    public void setCodigo(int codigo) 
    {
        if(codigo >= 1)
            this.codigo = codigo;
    }

    public void setNome(String nome) 
    {
        Pattern Nome = Pattern.compile("[\\w\\s]{3,}");
        Matcher verifica = Nome.matcher(nome);
        
        if(verifica.matches())
             this.nome = nome;
    }

    public void setSaldo(double saldo) 
    {
        if(saldo >= 0)
            this.saldo = saldo;
    }
    /*------------------ hashCode --------------------------------------------*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        return hash;
    }
    /*------------------ Equals ----------------------------------------------*/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caixa other = (Caixa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        return true;
    }
 
    /*----------------- toString() -------------------------------------------*/
    @Override
    public String toString() {
        return "Caixa{" + "Codigo=" + codigo + ", Nome=" + nome + ", Saldo=" + saldo + '}';
    }
}
