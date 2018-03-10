<%-- 
    Document   : Addanimals
    Created on : Mar 9, 2018, 11:50:13 PM
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
        <jsp:include page="Navigation_panle.jsp"/>
         <div class="main">
        <!-- Contact Container -->
        <div class="w3-container w3-padding-64 w3-theme-l5" id="contact">
            <div class="w3-row" style="padding-top: 100px">
             
                <div class="w3-col m7" style="margin-right: 200px;margin-top:100px;margin-bottom: 80px;margin-left: 300px">
                    <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="Animalmodification" target="_blank">
                     
                        <br>
                        <div class="w3-section">      
                            <label>Animal name</label>
                            <input class="w3-input" type="text" name="txtname" required>
                        </div>
                        <div class="w3-section">      
                            <label>Scientific name</label>
                            <input class="w3-input" type="text" name="txtscientificname" required >
                        </div>
                        <div class="w3-section">      
                            <label>Link</label>
                            <input class="w3-input" type="text" name="txtlink" required >
                        </div>
                        
                        <div class="w3-section">      
                            <label>No of categories</label>
                            <input class="w3-input" type="text" name="txtnoofcategories" required >
                        </div>
                        <div class="w3-section">      
                            <label>Description</label>
                            <input class="w3-input" type="text" name="txtdescription" required >
                        
                        </div>  
                       
                        <input type="submit" class="w3-button w3-right w3-theme" value="Add" name="btnadd">
                      
                    </form>
                </div>
                      
            </div>
                            
        </div>
        </div>
<jsp:include page="Footer.jsp"/>
   
        <%
              if(request.getAttribute("Result") =="added"){
            %>
            <script>alert("Animal information added sucessfully")</script>
            <%
        }
 if(request.getAttribute("Result") =="not added"){
            %>
            <script>alert("Animal information didn't add sucessfully.")</script>
            <%
            }
        %>
    </body>
</html>

