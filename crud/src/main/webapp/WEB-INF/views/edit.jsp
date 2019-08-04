<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>EDIT</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
        <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
    </head>
    <body> 
        <div class="container">
            <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item" ><a href="<c:url value="/" />">Ver miembros</a></li>
                <li class="breadcrumb-item active">Editar</li>
            </ol>
            </nav>
            <div class="panel panel-primary">
                <div class="panel-heading">Editar</div>
                <div class="panel-body">
                   
                        <form:form method="post" modelAttribute="usuarios">
                            <h1>Complete el formulario</h1>
                            
                            <form:errors path="*" element="div" cssClass="alert alert-danger" />
                            
                            <p>
                                <form:label path="nombre">Nombre:</form:label>
                                <form:input path="nombre" cssClass="form-control" />
                                
                            </p>
                            
                            <p>
                                <form:label path="correo">Correo electrónico</form:label>
                                <form:input path="correo" cssClass="form-control" />
                            </p>
                            
                            <p>
                                <form:label path="telefono">Teléfono</form:label>
                                <form:input path="telefono" cssClass="form-control" />
                            </p>
                            <hr />
                            <input type="submit" value="Enviar" class="btn btn-danger" />
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
