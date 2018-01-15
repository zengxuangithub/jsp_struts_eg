<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title><s:text name="loginPage"/></title>
    
	

  </head>
  
  <body>
  <table>
  
  </table>
  
   <s:form action="timer"  >
   		<s:textfield name="username" key="user"/>
   		<s:textfield name="password" key="pass"/>
   		<s:submit key="login"/>
   </s:form>
   
  </body>
</html>
