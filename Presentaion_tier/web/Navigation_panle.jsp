<%-- 
    Document   : Navigation_panle
    Created on : Mar 5, 2018, 2:06:26 PM
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
       <!-- Navbar -->
       <div class="w3-top" style="margin-top: 90px">
 <div class="w3-bar w3-theme-d2 w3-left-align">
     <a href="Home.jsp" class="w3-bar-item w3-button w3-teal"><i class="fa fa-home w3-margin-right"></i>Home</a>
     <a href="Aboutus.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white">About us</a>
     <a href="ContactUs.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Contact us</a>
     <%if(session.getAttribute("username")!= null){%>
     <a href="Animal_modification.jsp" class="w3-bar-item w3-button">Modification of animal information</a>
      <a href="Addanimals.jsp" class="w3-bar-item w3-button">Add animals</a>
      <%}%>
<div class="w3-dropdown-hover w3-hide-small">
    <button class="w3-button" title="search animals">Search Animals  <i class="fa fa-caret-down"></i></button>     
    <div class="w3-dropdown-content w3-card-4 w3-bar-block">
      <a href="SearchAnimals.jsp" class="w3-bar-item w3-button">Search By name</a>
      <a href="#" class="w3-bar-item w3-button">search by image</a>
    </div> 
 </div>

  <!-- Navbar on small screens -->
  <div id="navDemo" class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium">
      <a href="Home.jsp" class="w3-bar-item w3-button">Home</a>
      <a href="Aboutus.jsp" class="w3-bar-item w3-button">About us</a>
      <a href="ContactUs.jsp" class="w3-bar-item w3-button">Contact us</a>
      <a href="SearchAnimals.jsp" class="w3-bar-item w3-button">Search by name</a>
    <a href="#" class="w3-bar-item w3-button">Search by image</a>
  </div>
</div>
       </div>
       <script>
       // Close side navigation
function close() {
    document.getElementById("mySidebar").style.display = "none";
}

// Used to toggle the menu on smaller screens when clicking on the menu button
function openNav() {
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
    </script>
    </body>
</html>
