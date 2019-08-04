<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       <form:form method="post" modelAttribute="datos" value="youchoose.htm">
                            <h1>Complete el formulario</h1>
                            <form:errors path="*" element="div" cssClass="alert alert-danger" />        
                                <form:label path="correo">Correo electrónico</form:label>
                                <form:input path="correo" cssClass="form-control" />
                            <hr />
                            <input type="submit" value="Enviar" class="btn btn-danger" />
                        </form:form>
    </body>
</html>
