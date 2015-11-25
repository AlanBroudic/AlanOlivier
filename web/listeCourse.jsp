<%@ page contentType="text/html" pageEncoding="UTF8" %>
<!DOCTYPE html>
        <%@ include file="entete.html" %>
        <%@ page import="java.util.*" %>
        <%@ page import="Travail.*" %>
        <div id="corps">
                <form method="post" action="Controleur?choix=1">
                <table>
                    <caption>Calendrier des courses</caption>
                <tr><th>nom</th><th>lieu</th><th>date</th><th>heureDepart</th><th>distance</th><th>prix</th><th>challenge</th></tr>    
                    <%
                        ArrayList colCourse = (ArrayList)request.getAttribute("colCourse");
                        for(int i=0;i<colCourse.size();i++)
                        {
                            Course uneCourse = (Course)colCourse.get(i);
                            %>
                            <tr><td><a href="ControleurSki?choix=2&code=<%= uneCourse.getCode() %>"><%= uneCourse.getCode() %></a></td>
                                <td><a href="ControleurSki?choix=2&code=<%= uneCourse.getCode() %>"><%= uneCourse.getNom() %></a></td>
                                <td><a href="ControleurSki?choix=2&code=<%= uneCourse.getCode() %>"><%= uneCourse.getCapacite() %></a></td>
                            </tr>
                            <%
                        }
                        %>
                        
                </table>   
                <input type="submit" name="btnValid" value="Retour">
                </form>
             
        </div>



