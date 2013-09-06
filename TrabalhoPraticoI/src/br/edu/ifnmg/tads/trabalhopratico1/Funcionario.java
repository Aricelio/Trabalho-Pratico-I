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
public class Funcionario 
{
    private int codigo;
    private String nome;
    private String cargo;
    private String login;
    private String senha;
    private String endereco;
    private String rg;
    private String cpf;
    
    /*----- Construtor --------*/
    public Funcionario(){
        
    }
    
    /*------ Métodos Getters -------------------------------------------------*/
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
    
    /*-------- Métodos Setters -----------------------------------------------*/
    public void setCodigo(int codigo) 
    {
        if(codigo >= 1 )
            this.codigo = codigo;
    }

    public void setNome(String nome) 
    {
        Pattern Nome = Pattern.compile("[\\w\\s]{3,}");
        Matcher verifica = Nome.matcher(nome);
        
        if(verifica.matches())
             this.nome = nome;
    }

    public void setCargo(String cargo) 
    {
        Pattern Cargo = Pattern.compile("[\\w\\s]{5,}");
        Matcher verifica = Cargo.matcher(cargo);
        
        if(verifica.matches())             
             this.cargo = cargo;
    }

    public void setLogin(String login) 
    {
        Pattern Login = Pattern.compile("[\\w\\s]{3,}");
        Matcher verifica = Login.matcher(login);
        
        if(verifica.matches()) 
             this.login = login;
    }

    public void setSenha(String senha) 
    {
        Pattern Senha = Pattern.compile("[\\w\\S]{8,16}");
        Matcher verifica = Senha.matcher(cargo);
        
        if(verifica.matches()) 
             this.senha = senha;
    }

    public void setEndereco(String endereco) 
    {
        Pattern Endereco = Pattern.compile("[\\w\\s]{5,}");
        Matcher verifica = Endereco.matcher(endereco);
        
        if(verifica.matches()) 
             this.endereco = endereco;
    }

    public void setRg(String rg) 
    {
        Pattern RG = Pattern.compile("\\d{2}.\\d{3}.\\d{3}");
        Matcher verifica = RG.matcher(rg);
        
        if(verifica.matches())
             this.rg = rg;
    }

    public void setCpf(String cpf) 
    {
        Pattern CPF = Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
        Matcher verifica = CPF.matcher(cpf);
        
        if(verifica.matches())
             this.cpf = cpf;
    }
    /*-------------- hashCode ------------------------------------------------*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.cargo);
        hash = 83 * hash + Objects.hashCode(this.login);
        hash = 83 * hash + Objects.hashCode(this.senha);
        hash = 83 * hash + Objects.hashCode(this.endereco);
        hash = 83 * hash + Objects.hashCode(this.rg);
        hash = 83 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    /*------------- Equals ---------------------------------------------------*/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    /*------------ Método toString -------------------------------------------*/
    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", cargo=" + cargo + ", endereco=" + endereco + ", rg=" + rg + ", cpf=" + cpf + '}';
    }    
    
}