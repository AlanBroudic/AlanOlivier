<%@ page contentType="text/html" pageEncoding="UTF8" %>
<!DOCTYPE html>
        <%@ include file="entete.html" %>
        <%@ page import="java.util.*" %>
        <%@ page import="Travail.*" %>
        <div id="corps">
                <form method="post" action="ControleurCourse?choix=1">
                <table>
                    <caption>Calendrier des courses</caption>
                <tr><th>nom</th><th>lieu</th><th>date</th><th>heureDepart</th><th>distance</th><th>prix</th><th>challenge</th></tr>    
                    <%
                        ArrayList colCourse = (ArrayList)request.getAttribute("colCourse");
                        for(int i=0;i<colCourse.size();i++)
                        {
                            Course uneCourse = (Course)colCourse.get(i);
                            %>
                            <tr><td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getNom() %></a></td>
                                <td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getLieu() %></a></td>
                                <td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getDate() %></a></td>
                                <td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getHeureDepart() %></a></td>
                                <td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getDistance() %></a></td>
                                <td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getPrix() %></a></td>
                                <td><a href="ControleurCourse?choix=1&code=<%= uneCourse.getNom() %>"><%= uneCourse.getChallenge() %></a></td>
                            </tr>
                            <%
                        }
                        %>
                        
                </table>   
                <input type="submit" name="btnValid" value="Retour">
                </form>
             
        </div>



