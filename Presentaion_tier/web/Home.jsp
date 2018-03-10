<%-- 
    Document   : Home
    Created on : Mar 3, 2018, 10:38:07 AM
    Author     : Night
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    </head>
   
    </style>
    <body>
        <jsp:include page="Header.jsp"/>
        <jsp:include page="Navigation_panle.jsp"/>
        <div class="main">
        
 <video autoplay muted loop id="myVideo" width="100%">
    <source src="Video/Dehiwala National Zoo in 10 minutes - YouTube.MP4" type="video/mp4">

</video>
       
</div>
  <script>
var video = document.getElementById("myVideo");
var btn = document.getElementById("myBtn");

function myFunction() {
  if (video.paused) {
    video.play();
    btn.innerHTML = "Pause";
  } else {
    video.pause();
    btn.innerHTML = "Play";
  }
}
</script>

<div id="map" style="width:100%;height:400px;"></div>
     <script>
         
function myMap() {
  var myCenter = new google.maps.LatLng(6.8568, 79.8729);
  var mapCanvas = document.getElementById("map");
  var mapOptions = {center: myCenter, zoom: 15};
  var map = new google.maps.Map(mapCanvas, mapOptions);
  var marker = new google.maps.Marker({position:myCenter});
  marker.setMap(map);

  // Zoom to 9 when clicking on marker
  google.maps.event.addListener(marker,'click',function() {
    map.setZoom(9);
    map.setCenter(marker.getPosition());
  });
}
</script>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBOynRfHitJeMgEcoDQdRr0gRYPB3ScYLc&callback=myMap"></script>
<jsp:include page="Footer.jsp"/>
    
    </body>
</html>
