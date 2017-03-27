<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>菜单选项</title>
</head>
<body>
<div class="st_tree">
<ul>
    <li>系统菜单</li>
    <ul>
        <li><a href="#" >用户管理</a></li>
        <li><a href="#" >日志查看</a></li>
    </ul>
    <li><a href="#">仓库管理</a></li>
    <ul>
        <li><a href="#" >库存管理</a></li>
        <li><a href="#" >收货管理</a></li>
        <li><a href="#" >发货管理</a></li>
        <ul>
            <li><a href="#" ref="yhgl">用户管理</a></li>
            <li><a href="#" ref="rzck">日志查看</a></li>
        </ul>
    </ul>
</ul>
</div>
</body>
</html>