<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My first Spring boot web demo</title>
</head>

<script type="text/javascript">
    var websocket;

    // 首先判断是否 支持 WebSocket
    if('WebSocket' in window) {

        websocket = new WebSocket("ws://localhost:8080/wsMy?jspCode=AA");
    } else if('MozWebSocket' in window) {
        websocket = new MozWebSocket("ws://localhost:8080/wsMy?jspCode=AA");
    } else {
        websocket = new SockJS("ws://localhost:8080/wsMy?jspCode=AA");
    }

    // 打开连接时
    websocket.onopen = function(event) {
        console.log(" websocket.onopen  ");
    };

    // 收到消息时
    websocket.onmessage = function(event) {
        console.log("收到一条消息"+event.data);
        alert(event.data);
    };

    websocket.onerror = function(event) {
        console.log("  websocket.onerror  ");
    };

    websocket.onclose = function(event) {
        console.log("  websocket.onclose  ");
    };



</script>

</html>