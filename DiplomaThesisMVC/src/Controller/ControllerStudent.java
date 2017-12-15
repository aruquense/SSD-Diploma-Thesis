/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.*;
import View.StudentSelectOneTopic;
import View.StudentSubmitDeclarationOfDiplomaThesis;
import Model.Topic;
import java.util.List;

/**
 *
 * @author aru
 */
public class ControllerStudent implements ActionListener{

    public static void SoTButton() {
        //List<Topic> topics= Topic.find.all();
        View.StudentSelectOneTopic sot= new View.StudentSelectOneTopic();
        sot.setVisible(true);
        sot.setLocationRelativeTo(null);        
    }

    public static void SDoDTButton() {
        View.StudentSubmitDeclarationOfDiplomaThesis sdodt = new View.StudentSubmitDeclarationOfDiplomaThesis();
        sdodt.setVisible(true);
        sdodt.setLocationRelativeTo(null);
        }

    public static void AcceptTopic(String selectedValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void ContactTopic(String selectedValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void SubmitDeclarationOfDiplomathesis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
