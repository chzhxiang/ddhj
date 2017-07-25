<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	String js = path + "/js";
	String css = path + "/css";
	String img = path + "/images";
	String resources = path + "/resources";
	pageContext.setAttribute("js", js);
	pageContext.setAttribute("css", css);
	pageContext.setAttribute("img", img);
	pageContext.setAttribute("basePath", basePath);
	pageContext.setAttribute("resources", resources);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>点点环境后台管理系统</title>
<link rel="stylesheet" href="${css}/style.default.css" type="text/css" />
<script type="text/javascript" src="${js}/jquery-1.10.2.js"></script> 
<script type="text/javascript" src="${js}/plugins/jquery-ui.js"></script>
<script type="text/javascript" src="${js}/plugins/colorpicker.js" ></script>
<script type="text/javascript" src="${js}/plugins/jquery.alerts.js" ></script>
<!-- ajax相关方法 jsonp等 -->
<script type="text/javascript" src="${js}/utils/ajaxs.js"></script> 
<script type="text/javascript" src="${js}/system/general.js"></script>
</head>
<body class="withvernav">
	<div class="bodywrapper">
		<div class="vernav2 iconmenu nav">
			<ul class="nav-bar-ul">
				<c:forEach items="${menus }" var="m" varStatus="status">
					<li class="current">
						<a >${m.name }</a><span class="arrow"></span>
						<ul>
							<c:forEach items="${m.subMenus }" var="s" varStatus="status">
								<li><a class="J_menuItem" href="${s.url }">${s.name }</a></li>
							</c:forEach>
						</ul>
					</li>
				</c:forEach>
			</ul>
		</div>
		<div class="centercontent tables">
			<div id="contentwrapper" class="contentwrapper">
				<iframe id="J_iframe" width="100%" height="100%" src="" frameborder="0" data-id="sub_index" seamless></iframe>
			</div>
		</div>
	</div>
<script>
	$(function() {
		//菜单点击
		$(".J_menuItem").on('click', function() {
			var url = $(this).attr('href');
			$("#J_iframe").attr('src', url);
			return false;
		});
	});
</script>
</body>
</html>