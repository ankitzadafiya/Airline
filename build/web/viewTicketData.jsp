<%-- 
    Document   : deleteData
    Created on : Mar 28, 2017, 7:42:41 PM
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
        ResultSet rs;
        String q="";
          try
          {
               String lgnm=request.getParameter("lgnm");
               
              Class.forName("com.mysql.jdbc.Driver").newInstance();
             c1=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
             
             st = c1.createStatement();
             q="select * from pass where lname='"+lgnm+"'";
             
             rs = st.executeQuery(q);
             
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<link rel='stylesheet' href='style1.css'>");
                    out.println("<h3 style='color:white'>Viewing Ticket Reservation</h3>");
                    out.println("<table border='1' style='color:white;border: 2px solid white; width:500px; height:150px'><tr><th>lname</th><th>source</th><th>dest</th><th>date</th><th>time</th></tr>");
                    while(rs.next()){
                        out.println("<tr><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr></table>");
                    }
                    out.println("<a href='Home.jsp'>Click Here to Continue..</a>");
                    out.println("</body>");
                    out.println("</html>");
                }
             catch(Exception e)
             {
                     out.println("<a href='viewTicket.jsp'>Try Again</a>");
             }
            
   %>
               </td>
               </tr>
               <tr height="20px" align="center"><td colspan="4"><footer><h3>Airline Reservation Copyright &copy; 2022</h3></footer></td>
               </tr>
        </table>
    </body>
</html>
