<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Hello, World</title>
<style type="text/css">
html {
	height: 100%
}

body {
	height: 100%;
	margin: 0px;
	padding: 0px
}

#container {
	height: 100%
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=1.5&ak=PBANl9DPLQSGT0Zxfh5b3uX0">
	
</script>
</head>

<body>
	<div id="container"></div>
	<script type="text/javascript">
		var map = new BMap.Map("container"); // 创建地图实例  
		var point = new BMap.Point(116.404, 39.915); // 创建点坐标  
		map.centerAndZoom(point, 15); // 初始化地图，设置中心点坐标和地图级别
		map.addControl(new BMap.NavigationControl());
		map.addControl(new BMap.ScaleControl());
		map.addControl(new BMap.OverviewMapControl());
		map.addControl(new BMap.MapTypeControl());
		map.setCurrentCity("北京");
		var opts = {
			width : 250, // 信息窗口宽度    
			height : 100, // 信息窗口高度    
			title : "Hello" // 信息窗口标题   
		}
		var infoWindow = new BMap.InfoWindow("World", opts); // 创建信息窗口对象    
		map.openInfoWindow(infoWindow, map.getCenter()); // 打开信息窗口
	</script>
</body>
</html>
