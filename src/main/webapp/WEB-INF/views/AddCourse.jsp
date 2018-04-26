

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SubmitAddCourse" method="post">
            <fieldset style="width: 100px">
            Title: <input type="text" name="title"/> <br/><br/>
            Price: <input type="text" name="price"/> <br/><br/>
            Duration: <input type="text" name="duration" />
            
            <button type="submit"  name="submit">Submit Button</button>
            <button type="reset" >Reset Button</button>
            </fieldset>
        </form>
    </body>
</html>
