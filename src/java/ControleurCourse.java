/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;
import travail.*;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author alan
 */
public class ControleurCourse extends HttpServlet {
    
    GestionCourse tc;
    ArrayList colCourse;
    
    protected void processRequest(HttpServletRequest requete, HttpServletResponse reponse)
            throws ServletException, IOException {
        
        HttpSession session = requete.getSession(true);
        reponse.setContentType("text/html;charset=UTF-8");
        PrintWriter out = reponse.getWriter();
        
        try
        {   int choix;
            if (requete.getParameter("choix")== null)
            {
                choix = 0;
            }
            else
            {
                choix = Integer.parseInt(requete.getParameter("choix"));
            }
            switch(choix)
            {
                case 0 : //Affichage "initiale"
                    allerPage("Accueil.jsp", requete, reponse);
                    break;
                case 1 : //Affichage du calendrier des courses
                    tc = new GestionCourse();
                    colCourse = tc.getListe();
                    requete.setAttribute("colCourse", colCourse);
                    allerPage("listeCourse.jsp", requete, reponse);
                    break;
//                case 2 : //Affichage détaillé d'une station
//                    String code = requete.getParameter("code");
//                    int pcode = Integer.parseInt(code);
//                    tr = new GestionStation();
//                    Station uneStation = tr.getStation(pcode);
//                    requete.setAttribute("uneStation", uneStation);
//                    allerPage("detailStation.jsp", requete, reponse);
//                    break;
//                case 3 : //Affichage de l'enneigements de stations
//                    te = new gestionEnneig();
//                    colEnneig = te.getListe();
//                    requete.setAttribute("colEnneig", colEnneig);
//                    allerPage("listeEnneigements.jsp", requete, reponse);
//                    break;
//                case 4 :
//                    
//                case 5 :
//                    
//                case 6 :
                    
                    
                    
            }
        }
        catch(Exception e)
        {
            System.out.print("Erreur dans controleur : " + e.getMessage());
        }
        finally
        {            
            out.close();
        }
    }
    private void allerPage(String adr, HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException
    {
        RequestDispatcher d = req.getRequestDispatcher(adr);
        d.forward(req, rep);
    }

    
    @Override
    protected void doGet(HttpServletRequest requete, HttpServletResponse reponse)
            throws ServletException, IOException {
        processRequest(requete, reponse);
    }

   
    @Override
    protected void doPost(HttpServletRequest requete, HttpServletResponse reponse)
            throws ServletException, IOException {
        processRequest(requete, reponse);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
