<%-- 
    Document   : feedbackData
    Created on : Mar 28, 2017, 9:31:33 PM
    Author     : N
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Airline Reservation</title>
    </head>
    <body>
       <table width="100%">
            <tr height="100px">
                <td colspan="3" align="center"><h1>Airline Reservation</h1></td>
            <td align="right" style="vertical-align: top;"><h3><jsp:include page="header.jsp"></jsp:include></h3></td></tr>
            <tr height="50px" align="center"><td><h3><a href="Home.jsp">Home</a></h3></td>
                <td><h3><a href="ticketreservation.jsp">Ticket Reservation</a></h3></td>
                <td><h3><a href="aboutus.jsp">About Us</a></h3></td>
                <td><h3><a href="feedback.jsp">Feedback</a></h3></td></tr>
            <tr height="500px" align="center"><td colspan="4">
             <%
                         
        Connection c1 = null;
        Statement st = null;
        ResultSet rs1;
        String q="";
   
    try {
          
               String feed=request.getParameter("feed");
        String lname=request.getParameter("lname");
        
        
        
              Class.forName("com.mysql.jdbc.Driver").newInstance();
             c1=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
             
             
             st = c1.createStatement();
             q="insert into feedback values('"+feed+"','"+lname+"')";
             
             st.executeUpdate(q);
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<link rel='stylesheet' href='style1.css'>");
                    out.println("<h3>Thank You "+lname+" For Your feedback ,<br> "+feed+"</h3><br>");
                    out.println("<a href='Home.jsp'>Click Here to Continue..</a>");
                    out.println("</head>");
                    out.println("</body>");
    }               
    catch(Exception e)
    {
                    out.println("Invalid Insertion<br>");
                     out.println("<a href='ticketreservation.jsp'>Try Again</a>");
    }        
            
   %>
                    </td>
               </tr>
               <tr height="20px" align="center"><td colspan="4"><footer><h3>Airline Reservation Copyright &copy; 2022</h3></footer></td>
               </tr>
        </table>
    </body>
</html>
