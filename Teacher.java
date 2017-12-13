package models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import io.ebean.*;
import javax.persistence.*;

@Entity
public class Teacher extends Model {
   @Id
   public Integer ID;
   public String Name;
   public String Surname;
   public String Title;
   

   public static Finder<Integer,Teacher> find = new Finder<>(Teacher.class);
   

}