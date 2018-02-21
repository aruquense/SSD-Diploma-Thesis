/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import Model.Topic;
import ModelDAO.StudentDao;
import View.Menu;
import java.awt.Component;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import Model.Database;

/**
 *
 * @author aru
 */
public class ControllerStudent implements ActionListener{

    public static void DatabaseButton2() {
        
        
        Model.Database DB;
        System.out.println("getStudent");
        Integer id = 1;
        String name = "John";
        String surname = "Smith";
        StudentDao instance = new StudentDao();
        Student expResult = new Student();
        expResult.setName(name);
        expResult.setSurname(surname);
        expResult.setID(id);
        Student result = instance.getStudent(id, name, surname);
        //student = modelStudent.veryfyPreparedStatement(id, name, surname);
        System.out.println("Mio: " + expResult.getName());
        System.out.println("DB: " + result.getName());
        //assertEquals(expResult.getID(), result.getID());
//        assertEquals(expResult.getName(), result.getName());
//        assertEquals(expResult.getSurname(), result.getSurname());
        // TODO review the generated test code and remove the default call to fail.
    }

    public static void checkDatabase() {
        System.out.println("1");
        //JOptionPane.showMessageDialog(vistagerente, "tonto");
        //throw new UnsupportedOperationException("Not supported yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void resetTopics() {
        System.out.println("resetTopics");
        Database con;
        con= new Database();
        Connection DB= con.getConection();
        List<String> topics= new ArrayList<String>();
        try{
            PreparedStatement ps=DB.prepareStatement("UPDATE `diplomathesisdb`.`topic` SET `IsPublished` = '1'");
            ps.executeUpdate();

        }catch(Exception e){
            
        }
    }

    public static void GetDescription(String selectedValue) {
        System.out.println("ContactTopic");
        Database con;
        con= new Database();
        Connection DB= con.getConection();
        try{

            //DB.prepareStatement(name);
            PreparedStatement ps=DB.prepareStatement("SELECT * FROM `topic` Where `Title`=?");
            
            /*SELECT * FROM `Student` WHERE `ID`=1 AND `Name`="John" AND `Surname`="Smith"*/
                
            ps.setString(1, selectedValue);
            
            //System.out.println(ps.toString());
            
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                Component fm = null;
                
                JOptionPane.showMessageDialog(fm, "Description: " +rs.getString(4)) ;
            }
            }catch(Exception e){
            
        }
            
    
    }

    //DatabaseMenu vistagerente = new DatabaseMenu();
    //DatabaseMenu vistagerente = new DatabaseMenu();
    StudentDao modelStudent = new StudentDao();
    Student student= new Student();
    
    public void DatabaseButton() {
       
        /*Integer ID=1;
        String name="MARCOS";
        String surname="DSAAS";
        student= modelStudent.veryfyPreparedStatement(ID, name, surname);
        if(student==null){
            JOptionPane.showMessageDialog(vistagerente, "EMPLEADO NO ENCONTRADO");
        }else{
            JOptionPane.showMessageDialog(vistagerente, "datos correctos");
            
        }*/
    }
    /*****************************************/
    /*****************************************/
    /*****************************************/
    public ControllerStudent(Menu vistagerente, StudentDao modelStudent){
        this.modelStudent=modelStudent;
//        this.vistagerente.btnprueba.addActionListener(this);
    }
    public void InicializarLogin(){
        

    }
    public void actionPerformed(ActionEvent e){
   /*     Integer ID=1;
        String name="MARCOS";
        String surname="DSAAS";
        student= modelStudent.veryfyPreparedStatement(ID, name, surname);
        if(student==null){
            JOptionPane.showMessageDialog(vistagerente, "EMPLEADO NO ENCONTRADO");
        }else{
            JOptionPane.showMessageDialog(vistagerente, "datos correctos");
            DatabaseMenu DM = new DatabaseMenu();
            DM.setVisible(true);
            DM.setLocationRelativeTo(null);
            
            
        }*/
    }
    /*****************************************/
    /*****************************************/
    /*****************************************/
        
    public static void SoTButton() {
        
        System.out.println("SoTButton");
        Database con;
        con= new Database();
        Connection DB= con.getConection();
        List<String> topics= new ArrayList<String>();
        try{
            PreparedStatement ps=DB.prepareStatement("SELECT * FROM `topic`");
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                if (rs.getInt(6)==1){
                    topics.add(rs.getString(3));
                }
                
                //System.out.println(rs.getString(3));
                //System.out.println("3");
                
                //return student; 
                
            }
        }catch(Exception e){
            
        }
        
       
        
        View.StudentSelectOneTopic sot= new View.StudentSelectOneTopic(topics);
        
        sot.setVisible(true);
        sot.setLocationRelativeTo(null);
    }

    public static void SDoDTButton() {
        View.StudentSubmitDeclarationOfDiplomaThesis sdodt = new View.StudentSubmitDeclarationOfDiplomaThesis();
        sdodt.setVisible(true);
        sdodt.setLocationRelativeTo(null);
        }

    public static void AcceptTopic(String selectedValue) {
        
        System.out.println("el usuario ha elegido " +selectedValue);
        Database con;
        con= new Database();
        Connection DB= con.getConection();
        if(selectedValue==null){
            
            System.out.println("Really?  " +selectedValue+"...?  ");
        }else{       
            try{
                
                
                //if is published == 1 yet
                String updateTableSQL = "UPDATE `diplomathesisdb`.`topic` SET `IsPublished` = ? "
				                  + " WHERE `topic`.`title` = ?";
                PreparedStatement ps=DB.prepareStatement(updateTableSQL);
                ps.setString(2, selectedValue);
                ps.setInt(1, 0);
                //System.out.println(ps.toString());
                ps.executeUpdate();
        }catch(Exception e){
            
        }
            
        }
    }

    public static void ContactTopic(String selectedValue) {
      
        System.out.println("ContactTopic");
        Database con;
        con= new Database();
        Connection DB= con.getConection();
        try{

            //DB.prepareStatement(name);
            PreparedStatement ps=DB.prepareStatement("SELECT * FROM `topic` Where `Title`=?");
            
            PreparedStatement ps2=DB.prepareStatement("SELECT * FROM `teacher` WHERE `id`=?");
            /*SELECT * FROM `Student` WHERE `ID`=1 AND `Name`="John" AND `Surname`="Smith"*/
                
            ps.setString(1, selectedValue);
            
            //System.out.println(ps.toString());
            
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                
                //System.out.println("CONTACT: " +rs.getInt(2));  
            }
            ps2.setInt(1, rs.getInt(2));
            
            //System.out.println(ps2.toString());  
            ResultSet rs2 = ps2.executeQuery();
            if(rs2.next()){
                
                //System.out.println("CONTACT: " +rs2.getString(2)+" "+ rs2.getString(3));
                Component fm = null;
                
                JOptionPane.showMessageDialog(fm, "CONTACT: " +rs2.getString(2)+" "+ rs2.getString(3)) ;
            }   
            }catch(Exception e){
            
        }
            
    }

    public static void SubmitDeclarationOfDiplomathesis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      */  
}
