/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;
import java.sql.*;

import DAL.Database;
import Model.Student;

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
        System.out.println("1");
                
        Student student= null;
        Connection DB= con.getConection();
        
        try{
            
            PreparedStatement ps=DB.prepareStatement("SELECT * FROM `Student` WHERE 1");
            System.out.println("2");
                
            ps.setString(2, name);
            ps.setString(3, surname);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                student=new Student();
                student.setName(rs.getString(2));
                student.setSurname(rs.getString(3));
                System.out.println("3");
                
                //return student; 
                
            }
        }catch(Exception e){
            
        }
        return student;
    }

    public Student getStudent(Integer id, String name, String surname) {System.out.println("1");
                
        Student student= null;
        Connection DB= con.getConection();
        try{
            //DB.prepareStatement(name);
            //PreparedStatement ps=DB.prepareStatement("SELECT * FROM `Student` WHERE `ID`=? AND `Name`=? AND `Surname`=");
            PreparedStatement ps=DB.prepareStatement("SELECT * FROM `teacher`");
            /*SELECT * FROM `Student` WHERE `ID`=1 AND `Name`="John" AND `Surname`="Smith"*/
            System.out.println("2");
                
            //ps.setString(2, name);
            //ps.setString(3, surname);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                student=new Student();
                student.setName(rs.getString(2));
                
                System.out.println(rs.getString(2));
                student.setSurname(rs.getString(3));
                System.out.println("3");
                
                //return student; 
                
            }
        }catch(Exception e){
            
        }
        return student;
    }
}
