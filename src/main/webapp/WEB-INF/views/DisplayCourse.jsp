
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                    <th class="info">Cid</th>
                    <th class="info">Title</th>
                    <th class="info">Price</th>
                    <th class="info">Duration</th>
                    <th class="info">Edit</th>
                    <th class="info">Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${courses}" var="Course">
                        <tr >
                          <td>${Course.cid}</td>   
                          <td>${Course.title}</td>
                          <td>${Course.price}</td>
                          <td>${Course.duration}</td>
                          <td><a href="EditCourse?cid=${Course.cid}&action=Edit">Edit</a></td>
                          <td><a href="DeleteCourse?cid=${Course.cid}">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        <a href="index">Back</a>
    </body>
</html>
