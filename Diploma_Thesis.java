package models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import io.ebean.*;
import javax.persistence.*;

@Entity
public class Diploma_Thesis extends Model {
   @Id
   public Integer ID;
   public Integer StudentID;
   public Integer TopicID;
   public String Title;
   public String Content;
   

   public static Finder<Integer,Diploma_Thesis> find = new Finder<>(Diploma_Thesis.class);
   

}