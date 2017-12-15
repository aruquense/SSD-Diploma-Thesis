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
public class StudentDao {
    Database con;
    public StudentDao(){
        con= new Database();
    }
    public Student veryfyPreparedStatement(Integer id, String name, String surname){
        Student student= null;
        Connection DB= con.getConection();
        try{
            PreparedStatement ps=DB.prepareStatement("select * from student where name=? and surname=?");
            ps.setString(2, name);
            ps.setString(3, surname);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                student=new Student();
                student.setName(rs.getString(2));
                student.setSurname(rs.getString(3));
                
                
            }
        }catch(Exception e){
            
        }
        return student;
    }
}
