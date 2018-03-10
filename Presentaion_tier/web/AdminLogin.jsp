<%-- 
    Document   : AdminLogin
    Created on : Mar 9, 2018, 7:41:20 PM
    Author     : Night
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
         <jsp:include page="Header.jsp"/>
         <div class="main">
        <!-- Contact Container -->
        <div class="w3-container w3-padding-64 w3-theme-l5" id="contact">
            <div class="w3-row" style="padding-top: 100px; padding-bottom: 100px">
             
                    <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="AdminLogin" target="_blank">
                        <div class="w3-section">      
                            <label>Username</label>
                            <input class="w3-input" type="text" name="txtusername" placeholder="Username" required>
                        </div>
                        <div class="w3-section">      
                            <label>Password</label>
                            <input class="w3-input" type="password" name="txtpassword" placeholder="Passoword" required>
                        </div>
                          
                       
                        <input type="submit" class="w3-button w3-right w3-theme" value="Login" name="btnlogin">
                    </form>
                </div>
            </div>
         
        </div>
<jsp:include page="Footer.jsp"/>
    </body>
    <%
        if(request.getAttribute("login") == "fail"){
            %>
            <script>alert("Incorrect username or password, try again")</script>
            <%
        }

    
    %>
</html>

</html>
