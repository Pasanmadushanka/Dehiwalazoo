<%-- 
    Document   : Animal_modification
    Created on : Mar 9, 2018, 9:44:43 PM
    Author     : Night
--%>

<%@page import="bussinessservice.BussinessService_Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dataservice.Animal"%>
<%@page import="bussinessservice.BussinessService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = "";
            String description = "";
            String scientificname = "";
            String link = "";
            String noofcategories = "";
            BussinessService proxy = new BussinessService_Service().getBussinessServicePort();
            List<Animal> animalnames = new ArrayList<Animal>();
            animalnames.addAll((List) proxy.animalsnames());

            List<Animal> searchingresults = new ArrayList<Animal>();

            if (request.getAttribute("Result") != null) {
                searchingresults.addAll((List) request.getAttribute("Result"));
                for (Animal a : searchingresults) {
                    name = a.getName();
                    description = a.getDescription();
                    scientificname = a.getScientificname();
                    link = a.getLink();
                    noofcategories = a.getNoofcategories() + "";
                }
            }
        %>
        <jsp:include page="Header.jsp"/>
        <jsp:include page="Navigation_panle.jsp"/>
        <div class="main">
            <!-- Contact Container -->
            <div class="w3-container w3-padding-64 w3-theme-l5" id="contact">
                <div class="w3-row" style="padding-top: 100px">

                    <div class="w3-col m7" style="margin-right: 200px;margin-top:100px;margin-bottom: 80px;margin-left: 300px">
                        <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="Animalmodification" target="_blank">
                            <label ><b>Select Animal</b></label>
                            <br>
                            <br>
                            <select class="w3-input" name="txtname" required style="border: 2">
                                <option><%=name%></option>
                                <%for (dataservice.Animal a : animalnames) {%>
                                <option><%=a.getName()%></option>
                                <%}%>
                            </select>
                            <div class="w3-section">      
                                <label>Scientific name</label>
                                <input class="w3-input" type="text" name="txtscientificname" value="<%=scientificname%>" >
                            </div>
                            <div class="w3-section">      
                                <label>Link</label>
                                <input class="w3-input" type="text" name="txtlink" value="<%=link%>" >
                            </div>

                            <div class="w3-section">      
                                <label>No of categories</label>
                                <input class="w3-input" type="text" name="txtnoofcategories" value="<%=noofcategories%>" >
                            </div>
                            <div class="w3-section">      
                                <label>Description</label>
                                <input class="w3-input" type="text" name="txtdescription" value="<%=description%>" >

                            </div>  

                            <input type="submit" class="w3-button w3-right w3-theme" value="Search" name="btnsearch">
                            <input type="submit" class="w3-button w3-right w3-theme" value="Delete" name="btndelete">
                            <input type="submit" class="w3-button w3-right w3-theme" value="Update" name="btnupdate">
                        </form>
                    </div>

                </div>

            </div>
        </div>
        <jsp:include page="Footer.jsp"/>
        <%
            if (request.getAttribute("result") == "updated") {
        %>
        <script>alert("Animal information updated sucessfully")</script>
        <%
            }
            if (request.getAttribute("result") == "not updated") {
        %>
        <script>alert("Animal information didn't update sucessfully.")</script>
        <%
            }

            if (request.getAttribute("result") == "deleted") {
        %>
        <script>alert("Animal information deleted sucessfully")</script>
        <%
            }
            if (request.getAttribute("result") == "not deleted") {
        %>
        <script>alert("Something went wrong, deleteing failed try again.")</script>
        <%
            }
        %>
    </body>


</html>

