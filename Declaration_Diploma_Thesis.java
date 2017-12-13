package models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import io.ebean.*;
import javax.persistence.*;

@Entity
public class Declaration_Diploma_Thesis extends Model {
   @Id
   public Integer ID;
   public Integer TopicID;
   public Integer StudentID;
   public Integer TeacherID;
   public String Title;
   public String Content;
   

   public static Finder<Integer,Declaration_Diploma_Thesis> find = new Finder<>(Declaration_Diploma_Thesis.class);
   

}