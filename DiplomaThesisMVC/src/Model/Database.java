/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;

/**
 *
 * @author aru
 */
public class Database {
    public Database(){
        
    }
    public Connection getConection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //con = DriverManager.getConnection("jdbc:mysql://fdb17.atspace.me:3306/2550133_diplomathesis", "aruquense@gmail.com", "qwerty0000");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diplomathesisdb", "root", "");
            
            
        }catch(SQLException ex){
            
        }catch(Exception e){
            
        }
        return con;
    }
}
