package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDao {
    private static Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pizzaria", "root", "root");
        return conectado;   
    }
    
    public static ResultSet Logar(String email, String senha) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stEntrar = conectado.prepareStatement("select * from tbl_usuario where email = ? and senha = ?");
        stEntrar.setString(1, email);
        stEntrar.setString(2, senha);
            
        ResultSet resultado = stEntrar.executeQuery();
        
        return resultado;
    }
}
