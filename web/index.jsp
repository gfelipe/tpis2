<%--
  Created by IntelliJ IDEA.
  User: felipe
  Date: 21/11/16
  Time: 00:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Album de Fotos</title>
  </head>
  <body>
    <form method="POST" action="upload" enctype="multipart/form-data" >
      Foto:
      <input type="file" name="file" id="file" /> <br/>

      </br>
      <input type="submit" value="Upload" name="upload" id="upload" />
    </form>
  </body>
</html>
