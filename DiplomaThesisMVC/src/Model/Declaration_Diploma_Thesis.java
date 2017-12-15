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
public class Declaration_Diploma_Thesis {
    
    public Integer ID;
    public Integer StudentID;
    public Integer TopicID;
    public String Title;
    public String Content;

    public Integer getStudentID() {
        return StudentID;
    }

    public void setStudentID(Integer StudentID) {
        this.StudentID = StudentID;
    }

    public Integer getTopicID() {
        return TopicID;
    }

    public void setTopicID(Integer TopicID) {
        this.TopicID = TopicID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
    
}
