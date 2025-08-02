<%@page language="java" %>

<html>
   <head>
       <link rel ="stylesheet" type ="text/css" href ="style.css"

   </head>
     <body>
           <h2>Calculator Output:</h2>

              <c:if test="${not empty result}">
                  <p>Result: ${result}</p>
              </c:if>

              <c:if test="${not empty error}">
                  <p style="color:red;">Error: ${error}</p>
              </c:if>

     </body>
</html>