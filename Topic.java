package models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import io.ebean.*;
import javax.persistence.*;

@Entity
public class Topic extends Model {
   @Id
   public Integer ID;
   public Integer TeacherID;
   public String Title;
   public String Description;
   public Integer Level;
   public Integer IsPublished;
   

   public static Finder<Integer,Topic> find = new Finder<>(Topic.class);
   

}