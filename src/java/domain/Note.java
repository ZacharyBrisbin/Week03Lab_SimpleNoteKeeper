/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author 696019
 */
public class Note extends HttpServlet  implements Serializable 
{
    private String title,content;

    public Note() 
    {
        this.title = "";
        this.content = "";
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getContent() 
    {
        return content;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }
    
    
    
    
    
    
}
