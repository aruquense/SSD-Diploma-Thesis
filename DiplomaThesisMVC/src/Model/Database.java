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
            con = DriverManager.getConnection("jdbc:mysql://fdb17.atspace.me/2550133_diplomathesis", "aruquense@gmail.com", "qwerty0000");
            
            
        }catch(SQLException ex){
            
        }catch(Exception e){
            
        }
        return con;
    }
}
