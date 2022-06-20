/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
            res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        
        Connection c1=null;
        Statement st=null;
        ResultSet rs;
        String q="";
   
    
           try {
               String nm1=req.getParameter("nm");
        String lgnm1=req.getParameter("lgnm");
        String ps1=req.getParameter("ps");
        String mb1=req.getParameter("mb");
        String gen1=req.getParameter("gen");
        String country1=req.getParameter("country");
        
              Class.forName("com.mysql.jdbc.Driver").newInstance();
             c1=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");     
             st=c1.createStatement();
             q="insert into user(name,lname,password,mobile,gen,country) values('"+nm1+"','"+lgnm1+"','"+ps1+"','"+mb1+"','"+gen1+"','"+country1+"')";
             st.executeUpdate(q);
             RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");  
             rd.forward(req, res);  
             }
            catch(Exception e)
            {
                out.println("Connection Fail..");
            }  
     
            
         //   st.close();
         //    c1.close();
             
    }    
    }

