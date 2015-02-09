<%-- 
    Document   : PageGenerator2
    Created on : Feb 8, 2015, 9:22:24 PM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Class 2 Lab 3</title>
        <link href="css/pageGenerator2.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h2>Practice webpage with "out.println();" statements</h2>
        <div id="containerDiv">
            <div id="singleCntDiv">
                <table border=1>
                    <h3>Multiplication Table</h3>
                    <tr><th colspan="5">•Single Count•</th></tr
                            <%
                                for (int r = 1; r <= 5; r++) {
                                    out.println("<tr>");
                                    for (int c = 1; c <= 5; c++) {
                                        int val = r * c;
                                        out.println("<td>");
                                        if (val < 10) {
                                            out.println("&nbsp&nbsp&nbsp" + val);
                                        } else if (val <= 25) {
                                            out.println("&nbsp" + val);
                                        }
                                        out.println("</td>");
                                    }
                                    out.println("</tr");
                                }
                                out.println("</table>");
                            %>
            </div>
        </div>
    </body>
</html>
