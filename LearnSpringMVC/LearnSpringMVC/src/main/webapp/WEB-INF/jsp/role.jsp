<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/30
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数</title>
    <script src="https://code.jquery.com/jquery-3.2.0.js"></script>
</head>
<body>
    <form id="form" action="./params/commonParamPojo.do">
        <table>
            <tr>
                <td>角色名称</td>
                <td><input id="roleName" name="roleName" value="" /></td>
            </tr>
            <tr>
                <td>备注</td>
                <td><input id="note" name="note" /></td>
            </tr>
            <tr>
                <td></td>
                <td align="right"><input type="submit" value="提交" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
