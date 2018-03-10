<%-- 
    Document   : ContactUs
    Created on : Mar 5, 2018, 2:19:55 PM
    Author     : Night
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
   

    </head>
    <body>
        
         <jsp:include page="Header.jsp"/>
        <jsp:include page="Navigation_panle.jsp"/>
         <div class="main">
        <!-- Contact Container -->
        <div class="w3-container w3-padding-64 w3-theme-l5" id="contact">
            <div class="w3-row" style="padding-top: 100px">
                <div class="w3-col m5">
                    <div class="w3-padding-16"><span class="w3-xlarge w3-border-teal w3-bottombar">Contact Us</span></div>
                    <h3>Address</h3>
                    <p><i class="fa fa-map-marker w3-text-teal w3-xlarge"></i>  National Zoological Gardens,<br>
                        Anagarika Dharmapala Mawatha,<br>Dehiwala</p>
                    
                    <p><i class="fa fa-phone w3-text-teal w3-xlarge"></i>  +94-11-2712752-3</p>
                    <p><i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>  zoosl@slt.lk</p>
                </div>
                <div class="w3-col m7">
                    <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="Contact_us" target="_blank">
                        <div class="w3-section">      
                            <label>Name</label>
                            <input class="w3-input" type="text" name="txtname" required>
                        </div>
                        <div class="w3-section">      
                            <label>Email</label>
                            <input class="w3-input" type="email" name="txtemail" required>
                        </div>
                        <div class="w3-section">      
                            <label>Subject</label>
                            <input class="w3-input" type="text" name="txtsubject" required>
                        </div>
                        <div class="w3-section">      
                            <label>Message</label>
                            <textarea name="txtmessage" class="w3-input" form="usrform" required></textarea>
                        </div>  
                       
                        <input type="submit" class="w3-button w3-right w3-theme" value="Send" name="btnsend">
                    </form>
                </div>
            </div>
            
        </div>
        </div>
<jsp:include page="Footer.jsp"/>
    </body>
    <%
        if(request.getAttribute("message") =="send"){
            %>
            <script>alert("Your message sent successfully. We will Provide a quick response.")</script>
            <%
        }
 if(request.getAttribute("message") =="notsent"){
            %>
            <script>alert("Something went wrong, Message sending failed try again.")</script>
            <%
        }
    
    %>
</html>
