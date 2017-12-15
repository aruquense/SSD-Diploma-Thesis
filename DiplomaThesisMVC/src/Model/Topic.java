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

public class Topic {
    Integer ID;
   
    Integer TeacherID;
   
    String Title;
   
    String Description;
   
    Integer Level;

    public Integer getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(Integer TeacherID) {
        this.TeacherID = TeacherID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer Level) {
        this.Level = Level;
    }
   
    Integer IsPublished;

    //public static Finder<Long,Item> find = new Finder<>(Item.class);
    
}
