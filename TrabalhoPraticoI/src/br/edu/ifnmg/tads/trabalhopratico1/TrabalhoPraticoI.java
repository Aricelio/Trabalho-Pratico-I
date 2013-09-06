/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalhopratico1;

/**
 *
 * @author alisson 02
 */
public class TrabalhoPraticoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Funcionario ari = null;
        
        ari.setNome("Aricelio");
        ari.setCargo("Instrutor");
        ari.setCodigo(2);
        ari.setCpf("115.825.116-59");
        ari.setRg("17.791.878");
        ari.setEndereco("Rua Coronel");
        
        System.out.print(ari.toString());        
    }
}
