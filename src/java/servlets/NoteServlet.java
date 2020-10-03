package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.CoyoteWriter;

public class NoteServlet extends HttpServlet 
{
        

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String title= br.readLine();
        String content = br.readLine();
        Note notes = new Note(title,content);
        request.setAttribute("notes", notes);
        if(request.getParameter("edit") == null || request.getParameter("edit") == "")
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        else
        {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        br.close();
        
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedWriter bw =new BufferedWriter(new FileWriter(path,false));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        bw.write(title + "\n");
        bw.write(content);
        bw.close();
    }

}
