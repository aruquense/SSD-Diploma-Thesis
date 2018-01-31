/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aru
 */
public class Student {
   Integer ID;
   Integer TopicID;
   String Name;
   String Surname;
   
   
   public Student(){
       ID=0;
       Name="";
       Surname="";
   }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setID(Integer id) {
        this.ID=id;
    }
   
   
}
