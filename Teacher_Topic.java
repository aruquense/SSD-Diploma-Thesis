package models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import io.ebean.*;
import javax.persistence.*;

@Entity
public class Teacher_Topic extends Model {
   @Id
   public Integer TopicID;
   public Integer TeacherID;
   

   public static Finder<Integer,Teacher_Topic> find = new Finder<>(Teacher_Topic.class);
   

}