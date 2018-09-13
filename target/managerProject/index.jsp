<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="common/angular/angular.min.js"></script>
    <link href="common/bootStrap/css/bootstrap.css" rel="stylesheet">
    <!--  jquery必须在bootstrap.js前引用-->
    <script src="common/jquery/jquery-3.3.1.min.js"></script>
    <script src="common/bootStrap/js/bootstrap.js"></script>

</head>
<body>
<h2>Hello World!</h2>
<h1>Hello, world!</h1>haiyou zhongwen wenti
<div ng-app="">
    input your name:<input type="text" ng-model="name"/>
    hello {{name}}
</div>
</body>
</html>
