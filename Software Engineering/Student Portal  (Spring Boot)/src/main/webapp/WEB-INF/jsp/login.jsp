<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIL4kxIl
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGLyvwx9Hj@s
</head>
<body>

     <%@ include file="header.jsp" %>

     <div class="row">
         <div class="col-sm-4"></div>
         <div class="col-sm-4">
              <h1>Login Form</h1>
              <form>

                   <input type="email" name="email" placeholder="Enter your email" class="form-control mb-2">
                   <input type="password" name="password" placeholder="Enter your password" class="form-control mb-2">
                   <button type="submit" class="btn btn-success">Submit</button>

              </form>
         </div>
     </div>
</body>
</html>
