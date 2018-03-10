<%-- 
    Document   : SearchAnimals
    Created on : Mar 6, 2018, 3:08:56 PM
    Author     : Night
--%>

<%@page import="dataservice.Animal"%>
<%@page import="bussinessservice.BussinessService_Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="bussinessservice.BussinessService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>

    <body>
        <%
            BussinessService proxy = new BussinessService_Service().getBussinessServicePort();
            List<Animal> animalnames = new ArrayList<Animal>();
            animalnames.addAll((List) proxy.animalsnames());

        %>
        <jsp:include page="Header.jsp"/>
        <jsp:include page="Navigation_panle.jsp"/>
        <div class="main" style="min-height: 400px">
            <!-- Contact Container -->
            <div class="w3-container w3-padding-64 w3-theme-l5" style="margin-right: 200px;margin-top:100px;margin-bottom: 80px;margin-left: 200px">

                <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="Searchanimals" method="get">
                    <div class="w3-section">      
                        <label ><b>Select Animal</b></label>
                        <br>
                        <br>
                        <select class="w3-input" name="txtname" required style="border: 2">
                            <%for (dataservice.Animal a : animalnames) {%>
                            <option><%=a.getName()%></option>
                            <%}%>
                        </select>
                    </div>

                    <input type="submit"  class="w3-button w3-right w3-theme" name="btnsearch" value="Search"> 
                </form>
            </div>


            <%
                List<Animal> searchingresults = new ArrayList<Animal>();

                if (request.getAttribute("Result") != null) {
                    searchingresults.addAll((List) request.getAttribute("Result"));
                    for (Animal a : searchingresults) {
            %> 
            <center>
                <div class="container" style=" max-width: 800px; padding-bottom: 100px">
                    <h2 style="text-align: center; color: darkgreen; text-transform: uppercase" ><%=a.getName()%></h2>
                    <table class="table">

                        <tbody>
                            <tr class="success">
                                <td>Scientific name</td>
                                <td><%=a.getScientificname()%></td>
                            </tr>      
                            <tr class="success">
                                <td>No of categories</td>
                                <td><%=a.getNoofcategories()%></td>
                            </tr> 
                            </tr>      
                            <tr class="success">
                                <td>Description</td>
                                <td><%=a.getDescription()%></td>
                            </tr> 
                            </tr>      
                            <tr class="success">
                                <td>More info</td>
                                <td><a href="<%=a.getLink()%>" class="w3-bar-item w3-button" style="color:blue "><u>Click here</u></a></td>
                            </tr> 
                        </tbody>
                    </table>
                </div>
            </center>
                            <%}
            }
        %>

        </div>

        
        <jsp:include page="Footer.jsp"/>
    </body>

</html>
