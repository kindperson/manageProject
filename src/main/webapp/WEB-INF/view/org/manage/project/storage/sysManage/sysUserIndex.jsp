<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title> 注册用户 </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <link rel="stylesheet" href="/manageProject/statics/css/vendor.css">
    <script>
        var themeSettings = (localStorage.getItem('themeSettings')) ? JSON.parse(localStorage.getItem('themeSettings')) :
            {};
        var themeName = themeSettings.themeName || '';
        if (themeName)
        {
            document.write('<link rel="stylesheet" id="theme-style" href="/manageProject/statics/css/app-' + themeName + '.css">');
        }
        else
        {
            document.write('<link rel="stylesheet" id="theme-style" href="/manageProject/statics/css/app.css">');
        }
    </script>
</head>
<body>
<div class="auth">
    <div class="auth-container">
        <div class="card">
            <header class="auth-header">
                <h1 class="auth-title">
                    <div class="logo">
                        <span class="l l1"></span>
                        <span class="l l2"></span>
                        <span class="l l3"></span>
                        <span class="l l4"></span>
                        <span class="l l5"></span>
                    </div> 注册 </h1>
            </header>
            <div class="auth-content">
                <p class="text-center">新用户注册</p>
                <form id="signup-form" action="/manageProject/sysUser/inserSysUser" method="POST" novalidate="">
                    <div class="form-group">
                        <label for="firstname">用户名</label>
                        <div class="row">
                            <div class="col-sm-6">
                                <input type="text" class="form-control underlined" name="userName" id="userName" placeholder="请输入用户名" required=""> </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control underlined" name="lastname" id="lastname" placeholder="再次输入用户名" required=""> </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email">邮箱</label>
                        <input type="email" class="form-control underlined" name="email" id="email" placeholder="请输入邮箱" required=""> </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <div class="row">
                            <div class="col-sm-6">
                                <input type="password" class="form-control underlined" name="password" id="password" placeholder="请输入密码" required=""> </div>
                            <div class="col-sm-6">
                                <input type="password" class="form-control underlined" name="retype_password" id="retype_password" placeholder="请再次输入密码" required=""> </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="agree">
                            <input class="checkbox" name="agree" id="agree" type="checkbox" required="">
                            <span>已经阅读并同意这些协议
                                        <a href="#">协议</a>
                                    </span>
                        </label>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-block btn-primary">登录</button>
                    </div>
                    <div class="form-group">
                        <p class="text-muted text-center">已经有了用户名?
                            <a href="login.html">请登录!</a>
                        </p>
                    </div>
                </form>
            </div>
        </div>
        <div class="text-center">
            <a href="index.html" class="btn btn-secondary btn-sm">
                <i class="fa fa-arrow-left"></i> Back to dashboard </a>
        </div>
    </div>
</div>
<!-- Reference block for JS -->
<div class="ref" id="ref">
    <div class="color-primary"></div>
    <div class="chart">
        <div class="color-primary"></div>
        <div class="color-secondary"></div>
    </div>
</div>
<script>
    (function(i, s, o, g, r, a, m)
    {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function()
        {
            (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date();
        a = s.createElement(o),
            m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
    })(window, document, 'script', '/manageProject/statics/js/analytics.js', 'ga');
    ga('create', 'UA-80463319-4', 'auto');
    ga('send', 'pageview');
</script>
<script src="/manageProject/statics/js/vendor.js"></script>
<script src="/manageProject/statics/js/app.js"></script>
</body>
</html>