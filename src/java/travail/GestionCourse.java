
package Travail;

import java.sql.*;
import java.util.*;
import sql.*;


public class GestionCourse
{
    Statement stmt = null;
    
    public GestionCourse()
    {
        stmt = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "ski", "localhost", "root", "");
    }
    public ArrayList getListe() 
    {
 	ArrayList listeRetour = new ArrayList();
 	
 	try
   	{
            ResultSet rs = stmt.executeQuery("select * from course order by 'date'");
                    
            while(rs.next())
            {
                Course uneCourse=new Course(rs.getString("nom"),rs.getString("lieu"),rs.getDate("date"), rs.getTime("heureDepart"), rs.getFloat("distance"), rs.getInt("prix"), rs.getInt("challenge"));
    		listeRetour.add(uneCourse);
            }
            rs.close();
            stmt.close();
            return listeRetour;
 	}
        
   	catch (SQLException sqle)
   	{
            System.out.println("Erreur accès base " + sqle.getMessage());
            return null;
	}
   }
    
//   public Course getCourse(int pcode) 
//    {
// 	try
//   	{
//            ResultSet rs = stmt.executeQuery("select codestation, nomstation, capacitestation, codepostal,"
//                    + " complementadresse, commentaire, image from station where codestation = " + pcode);
//                    
//            rs.first();
//            Course uneCourse=new Course(rs.getInt("codestation"),rs.getString("nomstation"),rs.getInt("capacitestation"), rs.getString("codepostal"), rs.getString("complementadresse"), rs.getString("commentaire"), rs.getString("image"));
//            
//            rs.close();
//            stmt.close();
//            return uneCourse;
// 	}
//        
//   	catch (SQLException sqle)
//   	{
//            System.out.println("Erreur requete getStation : " + sqle.getMessage());
//            return null;
//	}
//   }
   
   
}
