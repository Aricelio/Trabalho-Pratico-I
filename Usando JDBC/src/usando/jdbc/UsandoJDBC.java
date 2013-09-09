/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usando.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alisson 02
 */
public class UsandoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*------------- Carrega o Drive -------------------------*/ 
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Classe encontrada!");
        
       //Cria a conexão com um SGBD 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/teste","root","alisson");
        
        //Cria um comando
        Statement comando = conn.createStatement();
        
        //Atualiza dados
        //comando.executeUpdate("insert into Pessoa(nome) values('Ari')");
        //comando.executeUpdate("insert into Carro(nome) values('Novo Uno')");
        //comando.executeUpdate("create table Carro ( codCarro int auto_increment primary key, nome varchar(50))");
        comando.executeUpdate("");
        //Consulta dados
        ResultSet rs = comando.executeQuery("SELECT * FROM Carro");
        
        while(rs.next()){
            String x = rs.getString("Nome");
            System.out.println(x);
        }
        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
